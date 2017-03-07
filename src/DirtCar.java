/**
 * Created by Rakshith on 3/5/2017.
 */
public class DirtCar extends Car{
    //super keyword! -> referring -> parent -> Car
    private int dirtyTerrainTopSpeed;

    public DirtCar(double mileage, int price, int doors, int dirtyTerrainTopSpeed ){

        super(mileage,price,doors);
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;

    }




    public int getDirtyTerrainTopSpeed() {
        return dirtyTerrainTopSpeed;
    }

    public void setDirtyTerrainTopSpeed(int dirtyTerrainTopSpeed) {
        this.dirtyTerrainTopSpeed = dirtyTerrainTopSpeed;
    }

    public String startDirtCar(){
       return "Dirt car status is :"+ super.carStart();
    }

}
