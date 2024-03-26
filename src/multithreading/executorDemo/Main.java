package multithreading.executorDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Creating threads according to number of loops
//        for (int n = 1; n <= 100; n++) {
//            NumberPrinting number = new NumberPrinting(n);
//            Thread t = new Thread(number);
//            t.start();
//        }

        // Fixing the size of the thread using ExecutorService.
        ExecutorService ex = Executors.newFixedThreadPool(10);

        for (int n = 1; n <= 100; n++) {
            NumberPrinting number = new NumberPrinting(n);
            ex.submit(number);
        }

        ex.shutdown();
    }
}
