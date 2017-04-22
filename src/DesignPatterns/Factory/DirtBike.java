package DesignPatterns.Factory;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class DirtBike extends Bike {

    @Override
    public String getDescription() {
        return "DirtBike";
    }

    @Override
    public int getCost() {
        return 1000;
    }
}
