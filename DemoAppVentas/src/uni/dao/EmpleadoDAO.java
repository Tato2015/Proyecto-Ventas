package uni.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import uni.database.AccesoDB;
import uni.entity.EmpleadoDTO;
import uni.entity.ProductoDTO;
import uni.servicio.Icrud;

public class EmpleadoDAO implements Icrud<EmpleadoDTO> {

    //variables 
    private Connection cn = null;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private CallableStatement cs = null;
    private String sql = null;
    private List<EmpleadoDTO> lista;
    private Statement stm = null;
    private EmpleadoDTO em;
    
    
    @Override
    public void create(EmpleadoDTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "{call sp_Empleado_Adicionar(?,?,?,?,?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, t.getIdempleado());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getApellidos());
            cs.setString(4, t.getEmail());
            cs.setString(5, t.getUsuario());
            cs.setString(6, t.getClave());
            cs.executeUpdate();//ejecuta los comandos
            cs.close();

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
    public void delete(EmpleadoDTO t) throws Exception {
     try {
            cn = AccesoDB.getConnection();
            sql = "{call sp_Empleado_Eliminar(?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, t.getIdempleado());            
            cs.executeUpdate();//ejecuta los comandos
            cs.close();

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
    public void update(EmpleadoDTO t) throws Exception {
    try {
            cn = AccesoDB.getConnection();
            sql = "{call sp_Empleado_Actualizar(?,?,?,?,?,?)}";
            cs = cn.prepareCall(sql);
            cs.setString(1, t.getIdempleado());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getApellidos());
            cs.setString(4, t.getEmail());
            cs.setString(5, t.getUsuario());
            cs.setString(6, t.getClave());
            cs.executeUpdate();//ejecuta los comandos
            cs.close();

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
    public List<EmpleadoDTO> readAll() throws Exception {
     lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select idempleado,nombre,apellidos,email from empleados";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                em = new EmpleadoDTO();
                em.setIdempleado(rs.getString(1));
                em.setNombre(rs.getString(2));
                em.setApellidos(rs.getString(3));
                em.setEmail(rs.getString(4));                
                lista.add(em);
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
    public EmpleadoDTO find(String t) throws Exception {
     em=null;
        try {
            cn = AccesoDB.getConnection();
            sql = "select * from empleados"
                    + " where idempleado=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1,t);
            rs = ps.executeQuery();
            while (rs.next()) {
                em = new EmpleadoDTO();
                em.setIdempleado(rs.getString(1));
                em.setNombre(rs.getString(2));
                em.setApellidos(rs.getString(3));
                em.setEmail(rs.getString(4));                
                em.setUsuario(rs.getString(5));
                em.setClave(rs.getString(6));                
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return em;   
    }

    @Override
    public List<EmpleadoDTO> getAll(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
