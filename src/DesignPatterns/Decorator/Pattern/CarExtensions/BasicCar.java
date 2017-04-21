package DesignPatterns.Decorator.Pattern.CarExtensions;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class BasicCar implements CarExtension {

    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public int getCost() {
        return 100000;
    }
}
