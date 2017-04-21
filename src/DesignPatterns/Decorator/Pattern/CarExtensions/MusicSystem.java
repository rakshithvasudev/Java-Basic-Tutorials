package DesignPatterns.Decorator.Pattern.CarExtensions;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class MusicSystem implements CarExtension {
    CarExtension carExtension;

    public MusicSystem(CarExtension carExtension) {
        this.carExtension = carExtension;
    }

    @Override
    public String getDescription() {
        return carExtension.getDescription()+ ", MusicSystem";
    }

    @Override
    public int getCost() {
        return carExtension.getCost() + 50;
    }
}
