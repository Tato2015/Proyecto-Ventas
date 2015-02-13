/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.database;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class prueba {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Connection cn=AccesoDB.getConnection();
        System.out.println("Conexion conforme....");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
