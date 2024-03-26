package designPrinciples.openClosedPrinciple;

public class Pigeon extends Bird{
    public Pigeon(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(this.getName() + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println("Gutur-gu");
    }

    @Override
    void dance() {
        System.out.println(this.getName() + " is dancing.");
    }
}
