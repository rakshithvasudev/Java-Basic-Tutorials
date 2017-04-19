package DesignPatterns.Singleton;

/**
 * Created by Rakshith on 4/18/2017.
 */
public class Steering {
    private String size;
    private volatile static Steering uniqueInstance  = new Steering();

    private Steering() {
        size = "Big";
    }

    public static Steering getUniqueInstance() {
        if (uniqueInstance == null) {
             synchronized (Steering.class) {
                 if (uniqueInstance == null) {
                     uniqueInstance = new Steering();
                 }
             }

        }
        return uniqueInstance;
    }
}
