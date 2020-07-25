import org.sql2o.Connection;

import java.sql.Timestamp;
import java.util.List;

public class Sightings implements AnimalInterface{
    private String name;
    private String location;
    private int animalId;
    private Timestamp timestamp;
    private int id;
    public Sightings(String name, String location, int animalId) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Please enter a name mate");
        }
        if (location.equals("")) {
            throw new IllegalArgumentException("Please enter a location mate");
        }
}