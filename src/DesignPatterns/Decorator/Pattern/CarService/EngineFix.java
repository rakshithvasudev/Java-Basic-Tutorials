package DesignPatterns.Decorator.Pattern.CarService;

/**
 * Created by Rakshith on 4/19/2017.
 */
public class EngineFix implements CarService {
    CarService carService;

    public EngineFix(CarService carService) {
        this.carService = carService;
    }

    @Override
    public String getDescription() {
        return carService.getDescription() + ", EngineFix";
    }

    @Override
    public int getCost() {
        return carService.getCost() +50;
    }
}
