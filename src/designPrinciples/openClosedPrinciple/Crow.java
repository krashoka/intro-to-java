package designPrinciples.openClosedPrinciple;

public class Crow extends Bird{
    public Crow(String name) {
        super(name);
    }

    @Override
    void fly() {
        System.out.println(this.getName() + " is flying.");
    }

    @Override
    void makeSound() {
        System.out.println("Caw-Caw");
    }

    @Override
    void dance() {
        System.out.println(this.getName() + " is dancing.");
    }
}
