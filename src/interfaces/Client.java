package interfaces;

public class Client {
    public static void main(String[] args) {
        // This is called TIGHTLY COUPLED as there is no room for other vehicles to be used here.
        // For changing vehicle in the Travel class, we will need to change the whole Travel class attributes and methods.
        Travel tr = new Travel(new Tata());
        tr.travel();
        System.out.println("============================");

        // This is called LOOSELY COUPLED as any vehicle can be used here.
        // For changing vehicle you just need to change the vehicle type in the constructor and there is no need to
        // change TravelUpgraded class attributes and methods.
        TravelUpgraded trU = new TravelUpgraded(new Tata());
        trU.travelUpgraded();
        // OR JUST DO THIS for changing the vehicle
//        TravelUpgraded trU = new TravelUpgraded(new Mahindra());
//        trU.travelUpgraded();
    }
}
