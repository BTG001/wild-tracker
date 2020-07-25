import org.sql2o.Connection;

import java.util.List;

public class Animal extends AnimalAbstract  {
    public Animal(String name, String age, String health, String type){

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