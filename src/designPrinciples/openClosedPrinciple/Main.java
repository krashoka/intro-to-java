package designPrinciples.openClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        Crow crow = new Crow("Kaalu");
        crow.fly();
        crow.makeSound();
        crow.dance();

        System.out.println("========================");

        Pigeon pigeon = new Pigeon("Kabutar");
        pigeon.fly();
        pigeon.makeSound();
        pigeon.dance();
    }
}
