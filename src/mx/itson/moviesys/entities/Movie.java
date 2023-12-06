
package mx.itson.moviesys.entities;


/**
 * Representa una entidad de película.
 * 
 * @author José Manuel Leyva Munguía
 * @version 1.0
 */

public class Movie {
    
    private int id;
    private String name;
    private String director;
    private String length;
    private String genre;
    private String rating;
    private String country;
    private String studio;
    
    /**
     * Constructor de la clase Movie.
     */
    public Movie() {
    }

    /**
     * Obtiene el ID de la película.
     * 
     * @return El ID de la película.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la película.
     * 
     * @param id El ID de la película.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la película.
     * 
     * @return El nombre de la película.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la película.
     * 
     * @param name El nombre de la película.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el director de la película.
     * 
     * @return El director de la película.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Establece el director de la película.
     * 
     * @param director El director de la película.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Obtiene la duración de la película.
     * 
     * @return La duración de la película.
     */
    public String getLength() {
        return length;
    }

    /**
     * Establece la duración de la película.
     * 
     * @param length La duración de la película.
     */
    public void setLength(String length) {
        this.length = length;
    }

    /**
     * Obtiene el género de la película.
     * 
     * @return El género de la película.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Establece el género de la película.
     * 
     * @param genre El género de la película.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Obtiene la clasificación de la película.
     * 
     * @return La clasificación de la película.
     */
    public String getRating() {
        return rating;
    }

    /**
     * Establece la clasificación de la película.
     * 
     * @param rating La clasificación de la película.
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Obtiene el país de origen de la película.
     * 
     * @return El país de origen de la película.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Establece el país de origen de la película.
     * 
     * @param country El país de origen de la película.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Obtiene el estudio de producción de la película.
     * 
     * @return El estudio de producción de la película.
     */
    public String getStudio() {
        return studio;
    }

    /**
     * Establece el estudio de producción de la película.
     * 
     * @param studio El estudio de producción de la película.
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }
    
}
