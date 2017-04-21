package DesignPatterns.Singleton;

/**
 * Created by Rakshith on 4/18/2017.
 */
public class Main {
    public static void main(String[] args) {
        Steering steering1 = Steering.getUniqueInstance();
        Steering steering2 = Steering.getUniqueInstance();
        Steering steering3 = Steering.getUniqueInstance();


        System.out.println(steering1);
        System.out.println(steering2);
        System.out.println(steering3);






    }




}
