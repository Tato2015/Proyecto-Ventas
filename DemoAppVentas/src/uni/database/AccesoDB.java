package uni.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {

    public AccesoDB() {
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection cn=null;
        try {
            //cargar el driver en memoria
            Class.forName("oracle.jdbc.OracleDriver");
            // obtener objto conexion
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            cn = DriverManager.getConnection(url, "ventas", "admin");
        } catch (SQLException e) {
            throw e;
        }
        return cn;
    }
}
