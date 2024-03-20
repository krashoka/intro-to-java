package interfaces;

public class TravelUpgraded {
    public Vehicle vehicle;

    public TravelUpgraded(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void travelUpgraded(){
        System.out.println("Now travel with any vehicle");
        vehicle.startEngine();
        vehicle.startAC();
        vehicle.startMedia();
    }
}
