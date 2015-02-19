
package uni.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import uni.database.AccesoDB;
import uni.entity.ClienteDTO;
import uni.servicio.Icrud;


public class ClienteDAO implements Icrud<ClienteDTO>{

    public List<ClienteDTO>listar(){
    List<ClienteDTO>lista = new ArrayList<ClienteDTO>();
    Connection cn = null;
    
        try {
        cn = AccesoDB.getConnection();
        String query = "select idCliente,nombre from Clientes order by idCliente";
        Statement stm = cn.createStatement();
        ResultSet rset = stm.executeQuery(query);
            while (rset.next()) {
                ClienteDTO o = new ClienteDTO();
                o.setIdcliente(rset.getString("idCliente"));
                o.setNombre(rset.getString("nombre"));
                lista.add(o);                
            }
            rset.close();
            stm.close();
        
        } catch (Exception e) {
            try {
                throw e;
            } catch (Exception ex) {
            }
            
            
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return lista;
    }
    
    
    @Override
    public void create(ClienteDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ClienteDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ClienteDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClienteDTO> readAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClienteDTO find(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClienteDTO> getAll(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
