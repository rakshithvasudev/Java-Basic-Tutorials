package DesignPatterns.Decorator.Pattern.CarService;

/**
 * Created by Rakshith on 4/19/2017.
 */
public class BasicCarService implements CarService {

    @Override
    public String getDescription() {
        return "Basic Car Service";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
