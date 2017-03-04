/**
 * Created by Rakshith on 3/3/2017.
 */
public class Car {
    //mileage, price, doors count

    double mileage;
    int price;
    int doors;

    //constructors - special method - create objects - implicitly called.

    //this -> reference to whoever is using it.
    //class that is using the "this" keyword.

    public Car(double mileages,int prices,int doorss){
         this.mileage = mileages;  // set class's field mileage to equal to mileage from the method.
         this.price = prices;
         this.doors = doorss;
    }





    //functions
    //start  shutoff

    public void carStart(){
        System.out.println("Car Started");
    }

    public void carShutOff(){
        System.out.println("Car Engine off");
    }




}
