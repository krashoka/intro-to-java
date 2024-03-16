package constructors;

public class Car {
    String name;
    String brand;
    int noOfSeats;
    int engineSize;

    public Car(){
        name = "Phantom";
        brand = "Rolls-Royce";
        noOfSeats = 4;
        engineSize = 3500;
    }

    public Car(String carName, String carBrand, int carSeats, int carEngineSize){
        name = carName;
        brand = carBrand;
        noOfSeats = carSeats;
        engineSize = carEngineSize;
    }

    public Car(String carName, int carSeats){
        name = carName;
        noOfSeats = carSeats;
    }
}
