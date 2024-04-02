package multithreading.synchronization;

public class Adder implements Runnable{
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.setCount(count.getCount() + 1);
    }
}
