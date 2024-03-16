package constructors;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.noOfSeats=4;
        System.out.println(c1.noOfSeats);

        Car c2 = c1; // SHALLOW COPY
        c2.noOfSeats=6;
        System.out.println(c1.noOfSeats);

        Car c3 = new Car("Ghost", "Rolls-Royce", 5, 4000);
        System.out.println(c3.name);

        Car c4 = new Car();
        System.out.println(c4.name);

        Mobile m1 = new Mobile("iPhone", "Apple", 13, 65000);

        Mobile m2 = new Mobile(m1); // DEEP COPY
        System.out.println(m2.price);
    }
}
