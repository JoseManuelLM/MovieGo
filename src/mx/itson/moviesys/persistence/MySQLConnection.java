
package mx.itson.moviesys.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Josem
 */
public class MySQLConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/proyecto_final";
        String usuario = "root";
        String contraseña = "Petrolera2022!";
        return DriverManager.getConnection(url, usuario, contraseña);
    }
}
