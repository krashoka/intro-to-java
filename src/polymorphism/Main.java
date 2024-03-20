package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client c = new Client();
        c.name = "Ashok";
        c.greet();

        ClientChild cc = new ClientChild();
        cc.greet("Amar");  // METHOD OVERLOADING

        ICEcar ic = new ICEcar();
        ic.move();
        System.out.println("================");
        ic.moveDemo();

        Vehicle v = new ICEcar();
        System.out.println("===================");
        v.move(); // this method is overridden in child class(ICEcar)
        v.startEngine(); // this method is not overridden in child class(ICEcar)
//        v.moveDemo();  // moveDemo is a method of ICEcar class so not possible to call from Vehicle class reference variable in UPCASTING

        System.out.println("===================");
        List<Vehicle> vehicles = new ArrayList<>();
        ICEcar maruti = new ICEcar();
        ElectricCar tesla = new ElectricCar();
        ICEcar mahindra = new ICEcar();
        ElectricCar tata = new ElectricCar();
        vehicles.add(maruti);
        vehicles.add(mahindra);
        vehicles.add(tesla);
        vehicles.add(tata);

        startAllCars(vehicles);
    }

    public static void startAllCars(List<Vehicle> vehicles){
        for(Vehicle v: vehicles){
            v.startEngine();
        }
    }
}
