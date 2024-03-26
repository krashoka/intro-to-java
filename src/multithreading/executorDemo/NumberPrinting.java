package multithreading.executorDemo;

public class NumberPrinting implements Runnable{
    private int num;

    public NumberPrinting(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Num: " + num + ", from thread: " + Thread.currentThread().getName());
    }
}
