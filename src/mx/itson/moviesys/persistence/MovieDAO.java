
package mx.itson.moviesys.persistence;

import mx.itson.moviesys.entities.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Proporciona métodos para realizar operaciones de acceso a datos relacionadas con la entidad Movie en la base de datos.
 * 
 * Los métodos incluidos permiten agregar, actualizar y eliminar información de películas en la base de datos.
 * 
 * @author José Manuel Leyva Munguía
 * @version 1.0
 */
public class MovieDAO {
    /**
     * Agrega una nueva película a la base de datos.
     * 
     * @param movie La película que se desea agregar.
     */
    public void addMovie(Movie movie) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "INSERT INTO tblmovies (name,director,genre,length,rating,country,studio) VALUES (?,?,?,?,?,?,?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, movie.getName());
                pstmt.setString(2, movie.getDirector());
                pstmt.setString(3, movie.getGenre());
                pstmt.setString(4, movie.getLength());
                pstmt.setString(5, movie.getRating());
                pstmt.setString(6, movie.getCountry());
                pstmt.setString(7, movie.getStudio());
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Actualiza la información de una película existente en la base de datos.
     * 
     * @param movie La película con la información actualizada.
     */
    public void updateMovie(Movie movie) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "UPDATE tblmovies SET name = ?, director = ?, genre = ?, length = ?, rating = ?, country = ?, studio = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, movie.getName());
                pstmt.setString(2, movie.getDirector());
                pstmt.setString(3, movie.getGenre());
                pstmt.setString(4, movie.getLength());
                pstmt.setString(5, movie.getRating());
                pstmt.setString(6, movie.getCountry());
                pstmt.setString(7, movie.getStudio());
                pstmt.setInt(8,movie.getId());
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Elimina una película de la base de datos según su identificador.
     * 
     * @param idMovie El identificador único de la película que se desea eliminar.
     */
    public void deleteMovie(int idMovie) {
        try (Connection conn = MySQLConnection.getConnection()) {
            String query = "DELETE FROM tblmovies WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, idMovie);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
}
