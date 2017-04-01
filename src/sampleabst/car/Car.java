package sampleabst.car;

/**
 * Created by Rakshith on 3/31/2017.
 */
public abstract class Car {
    //1) Don't instantiate a new Car class. ->Car Audi != new Car()
    //2) This class doesn't provide implementation for all the methods.


    protected int doors;

    public abstract void setDoors();



}
