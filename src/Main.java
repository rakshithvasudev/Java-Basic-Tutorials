public class Main {

    public static void main(String[] args) {
        Car benz = new Car(10.25,35000,4);
        Car Audi = new Car();
        Car Ram = new Car(6);


        System.out.println("Benz has "+ benz.doors + " doors");
        System.out.println("Benz is priced at "+ benz.price + " dollars");
        System.out.println("The mileage being :" + benz.mileage);


        System.out.println("Audi has "+Audi.doors + " doors");
        System.out.println("Audi is priced at: "+Audi.price + " dollars");
        System.out.println("The mileage being :"+Audi.mileage);


        System.out.println("Ram has "+ Ram.doors + " doors");
        System.out.println("Ram is priced at "+ Ram.price +" dollars");
        System.out.println("Ram's mileage being :" +Ram.mileage);


    }
}
