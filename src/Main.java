public class Main {

    public static void main(String[] args) {

        Car benz = new Car();

        benz.setMileage(20.25);
        benz.setDoors(5);
        benz.setPrice(50000);

        System.out.println("Benz has "+ benz.getDoors()+ "doors");
        System.out.println("Benz is priced at "+ benz.getPrice()+ "dollars");
        System.out.println("The mileage being :" + benz.getMileage());




    }
}
