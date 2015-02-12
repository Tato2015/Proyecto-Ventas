package database;

import java.sql.Connection;

public class prueba {

    public static void main(String args[]){
      
        try {
        Connection cn=AccesoDB.getConnection();
            System.out.println("Exito de conexión ...");        
        
        } catch (Exception e) {
            System.out.println("Error de conexión "+e.getMessage());        
        }
        
    }
    
}
