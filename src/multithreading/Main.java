package multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! from thread: " + Thread.currentThread().getName());

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        t.start();

        Adder add = new Adder(10, 4);
        Thread t1 = new Thread(add);
        t1.start();

        Subtractor sub = new Subtractor(10, 4);
        Thread t2 = new Thread(sub);
        t2.start();
    }
}
