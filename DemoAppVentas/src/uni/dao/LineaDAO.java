package uni.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import uni.database.AccesoDB;
import uni.entity.LineaDTO;
import uni.servicio.Icrud;

public class LineaDAO implements Icrud<LineaDTO>{
    
      // variables
    private Connection cn = null;
    private Statement stm = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql;
    private List<LineaDTO> lista;
    private LineaDTO pr;
    

    @Override
    public void create(LineaDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(LineaDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(LineaDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    //devuelve todas las columnas de la tabla lineas
    @Override
    public List<LineaDTO> readAll() throws Exception {
        lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select * from lineas order by idlinea";
            stm = cn.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                pr = new LineaDTO();
                pr.setIdlinea(rs.getInt("idlinea"));
                pr.setNombre(rs.getString("nombre"));                                
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
    public LineaDTO find(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LineaDTO> getAll(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           
}