package multithreading.multithreadingDemo;

public class Adder implements Runnable{

    private int x;
    private int y;

    public Adder(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println("Sum is: " + (x+y) + " from thread: " + Thread.currentThread().getName());
    }
}
