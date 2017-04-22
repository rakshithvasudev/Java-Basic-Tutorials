package DesignPatterns.Factory;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class WaterDrowingBike extends Bike {
    @Override
    public String getDescription() {
        return "Water Drowing Bike";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
