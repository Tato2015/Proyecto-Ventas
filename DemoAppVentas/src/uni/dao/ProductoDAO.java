package uni.dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import uni.database.AccesoDB;
import uni.entity.ProductoDTO;
import uni.servicio.Icrud;

public class ProductoDAO implements Icrud<ProductoDTO> {

    // variables
    private Connection cn = null;
    private Statement stm = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    private List<ProductoDTO> lista;
    private ProductoDTO pr;
    //.............

    @Override
    public void create(ProductoDTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            //generar codigo de producto
            sql = "select valor from control where parametro='Productos'";
            stm=cn.createStatement();
            rs =stm.executeQuery(sql);
            rs.next();
            int cont = rs.getInt(1);
            sql="update control set valor=valor+1 where parametro='Productos'";
            stm = cn.createStatement();
            stm.executeUpdate(sql);
            String cod="";
            if (cont<10) {
                cod = "A000"+cont;
            }else{
                cod= "A00"+cont;
            }
            t.setIdproducto(cod);
            //insertar
            sql = "insert into productos(idproducto,descripcion,idlinea,preciocompra,"
                    + "precioventa,stock) values (?,?,?,?,?,?)";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t.getIdproducto());
            ps.setString(2, t.getNombre());
            ps.setInt(3, t.getIdlinea());
            ps.setDouble(4, t.getPreciocompra());
            ps.setDouble(5, t.getPrecioventa());
            ps.setInt(6, t.getStock());
            ps.executeUpdate();//ejecuta los comandos
            ps.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                throw ex;
            }
        }

    }

    @Override
    public void delete(ProductoDTO t) throws Exception {
       try {
            cn = AccesoDB.getConnection();
            sql = "delete from productos where idproducto=?";
            ps = cn.prepareStatement(sql);            
            ps.setString(1, t.getIdproducto());          
            ps.executeUpdate();//ejecuta los comandos
            ps.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                throw ex;
            }
        }
    }

    @Override
    public void update(ProductoDTO t) throws Exception {
         try {
            cn = AccesoDB.getConnection();
            sql = "update productos set descripcion=?,idlinea=?,preciocompra=?,"
                    + "precioventa=?,stock=? where idproducto=?";
            ps = cn.prepareStatement(sql);            
            ps.setString(1, t.getNombre());
            ps.setInt(2, t.getIdlinea());
            ps.setDouble(3, t.getPreciocompra());
            ps.setDouble(4, t.getPrecioventa());
            ps.setInt(5, t.getStock());
            ps.setString(6, t.getIdproducto());
            ps.executeUpdate();//ejecuta los comandos
            ps.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            try {
                cn.close();
            } catch (SQLException ex) {
                throw ex;
            }
        }
    }

    @Override
    public List<ProductoDTO> readAll() throws Exception {
        lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select idproducto,descripcion,idlinea,precioventa,stock from productos";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                pr = new ProductoDTO();
                pr.setIdproducto(rs.getString(1));
                pr.setNombre(rs.getString(2));
                pr.setIdlinea(rs.getInt(3));
                pr.setPrecioventa(rs.getDouble(4));
                pr.setStock(rs.getInt(5));
                lista.add(pr);
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }

    @Override
    public ProductoDTO find(String t) throws Exception {    
        pr=null;
        try {
            cn = AccesoDB.getConnection();
            sql = "select * from productos"
                    + " where idproducto=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1,(String)t);
            rs = ps.executeQuery();
            while (rs.next()) {
                pr = new ProductoDTO();
                pr.setIdproducto(rs.getString(1));
                pr.setNombre(rs.getString(2));
                pr.setIdlinea(rs.getInt(3));
                pr.setPreciocompra(rs.getDouble(4));                
                pr.setPrecioventa(rs.getDouble(5));
                pr.setStock(rs.getInt(6));                
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return pr;                      
    }

    @Override
    public List<ProductoDTO> getAll(Object t) throws Exception {
        lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select idproducto,descripcion,idlinea,precioventa,stock from productos"
                    + " where descripcion like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, t + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                pr = new ProductoDTO();
                pr.setIdproducto(rs.getString(1));
                pr.setNombre(rs.getString(2));
                pr.setIdlinea(rs.getInt(3));
                pr.setPrecioventa(rs.getDouble(4));
                pr.setStock(rs.getInt(5));
                lista.add(pr);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }

    //no hay metodo override porque no esta dentro de la interfaz
    public List<ProductoDTO> getAllforLinea(Object t) throws Exception {
        lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select idproducto,descripcion,idlinea,precioventa,stock from productos"
                    + " where idlinea=?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, (int) t);
            rs = ps.executeQuery();
            while (rs.next()) {
                pr = new ProductoDTO();
                pr.setIdproducto(rs.getString(1));
                pr.setNombre(rs.getString(2));
                pr.setIdlinea(rs.getInt(3));
                pr.setPrecioventa(rs.getDouble(4));
                pr.setStock(rs.getInt(5));
                lista.add(pr);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }

}
