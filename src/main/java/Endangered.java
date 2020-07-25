import org.sql2o.Connection;

import java.util.List;

public class Endangered extends  AnimalAbstract {
    public Endangered(String name, String age, String health, String type) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Please enter a name");
        }
        if (age.equals("")) {
            throw new IllegalArgumentException("Please enter the age of the animal");
        }
        if (health.equals("")) {
            throw new IllegalArgumentException("Please enter the health status of the animal");
        }
}
