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

    public Car(){
        this(5.23,50000,5);
    }

    public Car(int doors){
        this.doors=doors;
    }



    public Car(double mileage,int price,int doors){
         this.mileage = mileage;  // set class's field mileage to equal to mileage from the method.
         this.price = price;
         this.doors = doors;
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
