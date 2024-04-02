package multithreading.synchronization;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.setCount(count.getCount() - 1);
    }
}
