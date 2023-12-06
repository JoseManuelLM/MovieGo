
package mx.itson.moviesys.persistence;

import mx.itson.moviesys.entities.Function;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Proporciona métodos para realizar operaciones de acceso a datos relacionadas con la entidad Function en la base de datos.
 * 
 * Los métodos incluidos permiten agregar, actualizar y eliminar información de funciones de cine en la base de datos.
 * 
 * @author José Manuel Leyva Munguía
 * @version 1.0
 */
public class FunctionDAO {
    /**
     * Agrega una nueva función de cine a la base de datos.
     * 
     * @param function La función de cine que se desea agregar.
     */
    public void addFunction(Function function) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "INSERT INTO tblfunctions (movie, room, date, hour, price) VALUES (?, ?, ?, ?,?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, function.getMovie());
                pstmt.setString(2, function.getRoom());
                pstmt.setString(3, function.getDate());
                pstmt.setString(4, function.getHour());
                pstmt.setDouble(5, function.getPrice());
                pstmt.executeUpdate();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Actualiza la información de una función de cine existente en la base de datos.
     * 
     * @param function La función de cine con la información actualizada.
     */
    public void updateFunction(Function function) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "UPDATE tblfunctions SET movie = ?, room = ?, date = ?, hour = ?, price = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, function.getMovie());
                pstmt.setString(2, function.getRoom());
                pstmt.setString(3, function.getDate());
                pstmt.setString(4, function.getHour());
                pstmt.setDouble(5, function.getPrice());
                pstmt.setInt(6, function.getId());
                pstmt.executeUpdate();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Elimina una función de cine de la base de datos según su identificador.
     * 
     * @param idFunction El identificador único de la función de cine que se desea eliminar.
     */
    public void deleteFunction(int idFunction) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "DELETE FROM tblfunctions WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, idFunction);
                pstmt.executeUpdate();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
