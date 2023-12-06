
package mx.itson.moviesys.entities;

/**
 * Representa una entidad que describe una función de cine.
 * 
 * @author José Manuel Leyva Munguía
 * @version 1.0
 */
public class Function {
    private int id;
    private String movie;
    private String room;
    private String date;
    private String hour;
    private double price;
    
    /**
     * Constructor de la clase Function.
     */
    public Function(){
    }
    
    /**
     * Obtiene el identificador único de la función.
     * 
     * @return El identificador único de la función.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Establece el identificador único de la función.
     * 
     * @param id El identificador único de la función.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la película asociada a la función.
     * 
     * @return El nombre de la película asociada a la función.
     */
    public String getMovie() {
        return movie;
    }

    /**
     * Establece el nombre de la película asociada a la función.
     * 
     * @param movie El nombre de la película asociada a la función.
     */
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /**
     * Obtiene el nombre de la sala en la que se lleva a cabo la función.
     * 
     * @return El nombre de la sala en la que se lleva a cabo la función.
     */
    public String getRoom() {
        return room;
    }

    /**
     * Establece el nombre de la sala en la que se lleva a cabo la función.
     * 
     * @param room El nombre de la sala en la que se lleva a cabo la función.
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * Obtiene la fecha en la que se realiza la función.
     * 
     * @return La fecha en la que se realiza la función.
     */
    public String getDate() {
        return date;
    }

    /**
     * Establece la fecha en la que se realiza la función.
     * 
     * @param date La fecha en la que se realiza la función.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Obtiene la hora de inicio de la función.
     * 
     * @return La hora de inicio de la función.
     */
    public String getHour() {
        return hour;
    }

    /**
     * Establece la hora de inicio de la función.
     * 
     * @param hour La hora de inicio de la función.
     */
    public void setHour(String hour) {
        this.hour = hour;
    }

    /**
     * Obtiene el precio de entrada a la función.
     * 
     * @return El precio de entrada a la función.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Establece el precio de entrada a la función.
     * 
     * @param price El precio de entrada a la función.
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
}
