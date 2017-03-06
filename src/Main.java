public class Main {

    public static void main(String[] args) {

       // Car benz = new Car();

        DirtCar dirtyBenz = new DirtCar();

        dirtyBenz.setMileage(6);
        dirtyBenz.setDoors(2);
        dirtyBenz.setPrice(250000);
        dirtyBenz.setDirtyTerrainTopSpeed(45);

        System.out.println("Dirty Benz's mileage is:" + dirtyBenz.getMileage());
        System.out.println("Dirty Benz's Door count:" + dirtyBenz.getDoors());
        System.out.println("Dirty Benz's price is:" + dirtyBenz.getPrice());
        System.out.println("Dirty Benz's Terrain Top Speed is:" + dirtyBenz.getDirtyTerrainTopSpeed());


        System.out.println(dirtyBenz.startDirtCar());


//        benz.setMileage(20.25);
//        benz.setDoors(5);
//        benz.setPrice(50000);
//
//        System.out.println("Benz has "+ benz.getDoors()+ "doors");
//        System.out.println("Benz is priced at "+ benz.getPrice()+ "dollars");
//        System.out.println("The mileage being :" + benz.getMileage());




    }
}
