package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccesoDB {

    public static Connection getConnection()throws Exception{
    
        Connection cn=null;
        
        try {
        // cargamos el driver en memoria
            Class.forName("oracle.jdbc.OracleDriver");
        // obtenemos el objeto conexión
            String sql="jdbc:oracle:thin:@localhost:1521:XE";
            cn = DriverManager.getConnection(sql,"ventas","admin");            
        } catch (Exception e) {
        throw e;        
        }
        return cn;    
    }
    
}
