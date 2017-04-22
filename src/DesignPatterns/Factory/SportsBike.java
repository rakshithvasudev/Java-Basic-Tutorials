package DesignPatterns.Factory;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class SportsBike extends Bike {
    @Override
    public String getDescription() {
        return "SportsBike";
    }

    @Override
    public int getCost() {
        return 660;
    }
}
