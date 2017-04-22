package DesignPatterns.Factory;

/**
 * Created by Rakshith on 4/21/2017.
 */
public class BikeShowRoom {
    public static void main(String[] args) {
        String bikeName = "SportsBike";
        Bike bike = BikeFactory.createBike(bikeName);
        System.out.println("Bike is: "+ bike.getDescription());
        System.out.println("Bike cost is :"+ bike.getCost());

    }
}
