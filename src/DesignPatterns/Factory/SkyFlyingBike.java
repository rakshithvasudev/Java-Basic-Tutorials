package DesignPatterns.Factory;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class SkyFlyingBike extends Bike {
    @Override
    public String getDescription() {
        return "Sky Flying Bike";
    }

    @Override
    public int getCost() {
        return 5000;
    }
}
