
package mx.itson.moviesys.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Proporciona un método para establecer una conexión a la base de datos MySQL.
 * Necesita el controlador JDBC de MySQL para funcionar.
 * 
 * @author José Manuel Leyva Munguía
 * @version 1.0
 */
public class MySQLConnection {
    /**
     * Método estático que devuelve una conexión a la base de datos MySQL.
     * 
     * @return Objeto `Connection` que representa la conexión a la base de datos.
     * @throws SQLException Si hay un problema al establecer la conexión.
     */
    public static Connection getConnection() throws SQLException {
        // URL de conexión a la base de datos MySQL
        String url = "jdbc:mysql://localhost:3306/proyecto_final";
        // Credenciales de acceso a la base de datos
        String usuario = "root";
        String contraseña = "Petrolera2022!";
        // Se establece y retorna la conexión
        return DriverManager.getConnection(url, usuario, contraseña);
    }
}
