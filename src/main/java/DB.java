import org.sql2o.Sql2o;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5433/wildlife_tracker", "postgres", "Bruno11057");
}
