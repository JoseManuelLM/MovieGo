
package mx.itson.moviesys.entities;

/**
 * Representa una entidad que describe una sala en el sistema de gestión de cine.
 * 
 * @author José Manuel Leyva Munguía
 * @version 1.0
 */
public class Room {
    private int id;
    private String name;
    private int capacity;
    private String availability;
    
    /**
     * Constructor predeterminado de la clase Room.
     */
    public Room() {
    }
    /**
     * Obtiene el identificador único de la sala.
     * 
     * @return El identificador único de la sala.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de la sala.
     * 
     * @param id El identificador único de la sala.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre descriptivo de la sala.
     * 
     * @return El nombre descriptivo de la sala.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre descriptivo de la sala.
     * 
     * @param name El nombre descriptivo de la sala.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la capacidad de asientos de la sala.
     * 
     * @return La capacidad de asientos de la sala.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Establece la capacidad de asientos de la sala.
     * 
     * @param capacity La capacidad de asientos de la sala.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Obtiene el estado de disponibilidad de la sala.
     * 
     * @return El estado de disponibilidad de la sala.
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Establece el estado de disponibilidad de la sala.
     * 
     * @param availability El estado de disponibilidad de la sala.
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
}
