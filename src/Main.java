public class Main {

    public static void main(String[] args) {
        Car benz = new Car();
        benz.mileage = 10.54;
        benz.price = 30000;
        benz.doors = 4;

        System.out.println("Benz has "+ benz.doors + " doors");
        System.out.println("Benz is priced at "+ benz.price + " dollars");
        System.out.println("The mileage being :" + benz.mileage);

        benz.carStart();

        benz.carShutOff();




    }
}
