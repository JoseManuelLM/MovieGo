
package mx.itson.moviesys.persistence;

import mx.itson.moviesys.entities.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Proporciona métodos para realizar operaciones de acceso a datos relacionadas con la entidad Room en la base de datos.
 * 
 * Los métodos incluidos permiten agregar, actualizar y eliminar información de salas en la base de datos.
 * 
 * @author José Manuel Leyva Munguía
 * @version 1.0
 */
public class RoomDAO {
    /**
     * Agrega una nueva sala a la base de datos.
     * 
     * @param room La sala que se desea agregar.
     */
    public void addRoom(Room room) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "INSERT INTO tblrooms (name,capacity,availability) VALUES (?,?,?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, room.getName());
                pstmt.setInt(2, room.getCapacity());
                pstmt.setString(3, room.getAvailability());
                pstmt.executeUpdate();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Actualiza la información de una sala existente en la base de datos.
     * 
     * @param room La sala con la información actualizada.
     */
    public void updateRoom(Room room) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "UPDATE tblrooms SET name = ?, capacity = ?, availability = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, room.getName());
                pstmt.setInt(2, room.getCapacity());
                pstmt.setString(3, room.getAvailability());
                pstmt.setInt(4, room.getId());
                pstmt.executeUpdate();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Elimina una sala de la base de datos según su identificador.
     * 
     * @param idRoom El identificador único de la sala que se desea eliminar.
     */
    public void deleteRoom(int idRoom) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "DELETE FROM tblrooms WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, idRoom);
                pstmt.executeUpdate();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
