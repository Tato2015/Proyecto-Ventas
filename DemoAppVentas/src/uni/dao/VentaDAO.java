package uni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import uni.database.AccesoDB;
import uni.entity.DetalleDTO;
import uni.entity.VentaDTO;

public class VentaDAO {
    
    public int registraVenta(VentaDTO reg)throws Exception{
    Connection cn = null;
    int nroVenta;
        try {
        cn = AccesoDB.getConnection();
        //inicia transaccion
        cn.setAutoCommit(false);
        String consulta ="select Valor from Control where parametro='Ventas'";
        Statement stm1 = cn.createStatement();
        ResultSet rset = stm1.executeQuery(consulta);
        rset.next();
        nroVenta = rset.getInt("Valor");
        rset.close();
        consulta = "update Control set Valor = Valor + 1 where parametro='Ventas'";
        stm1 = cn.createStatement();
        stm1.executeQuery(consulta);
        
        //registra ventas
        String query="insert into Ventas (IdVenta,IdCliente,idEmpleado,tipodoc,Nrodoc,Fecha,Total)"+
                    "values(?,?,?,?,?,sysdate,?)";
        PreparedStatement stm = cn.prepareStatement(query);
        stm.setInt(1, nroVenta);
        stm.setString(2, reg.getIdcliente());
        stm.setString(3, reg.getIdempleado());
        stm.setString(4, reg.getTipodoc());
        stm.setString(5, reg.getNrodoc());
        stm.setDouble(6, reg.getTotal());
        stm.executeUpdate();
        
        //grabar detalle venta
        query = "insert into DetalleVenta(IdVenta,idproducto,precio,cantidad,importe)"+
                "values (?,?,?,?,?)";
        PreparedStatement stma = cn.prepareStatement(query);
        
        // actualiza stock
        query = "update Productos set Stock = Stock - ? where idProducto = ?";
        PreparedStatement stmb = cn.prepareStatement(query);
        
            for (DetalleDTO item : reg.getDetalle()) {
            stma.setInt(1, nroVenta);
            stma.setString(2, item.getIdproducto());
            stma.setDouble(3, item.getPrecio());
            stma.setInt(4, item.getCantidad());
            stma.setDouble(5, item.getTotal());
            stma.executeUpdate();  
            
            // actualizar stock del producto
            stmb.setInt(1, item.getCantidad());
            stmb.setString(2, item.getIdproducto());
            stmb.executeUpdate();
            }
            stm1.close();
            stm.close();
            stma.close();
            stmb.close();
            cn.commit(); // confirma la transaccion
        } catch (SQLException | ClassNotFoundException e) {
            try {
            cn.rollback();
            } catch (Exception ex) {
            
            }
        throw e;
        }finally{
            try {
               cn.close();
            } catch (Exception e) {
            }
        }
    return nroVenta;
    }
    
}
