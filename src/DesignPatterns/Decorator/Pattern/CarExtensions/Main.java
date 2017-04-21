package DesignPatterns.Decorator.Pattern.CarExtensions;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class Main {
    public static void main(String[] args) {

        CarExtension extension  = new RearCamera(new CushionSeat
                (new CushionSeat(new MusicSystem(new BasicCar()))));
        System.out.println(extension.getDescription());
        System.out.println(extension.getCost());


    }


}
