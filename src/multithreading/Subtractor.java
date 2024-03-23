package multithreading;

public class Subtractor implements Runnable{

    private int x;
    private int y;

    public Subtractor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        System.out.println("Difference is: " + (x-y) + " from thread: " + Thread.currentThread().getName());
    }
}
