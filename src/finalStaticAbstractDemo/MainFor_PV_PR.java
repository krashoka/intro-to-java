package finalStaticAbstractDemo;

public class MainFor_PV_PR {
    public static void main(String[] args) {
        // Example code for PASS BY VALUE
        int x = 10;
        int y = 20;
        swap(x, y);
        // Here the swap function is taking just the value of x and y not the variables
        // that is why the value is being swapped but at the time of printing the value is being passed of the original
        // x and y variables.
        System.out.println(x);
        System.out.println(y);

        System.out.println("=============================");

        // Example code for PASS BY REFERENCE
        Point p = new Point();
        p.x = 10;
        p.y = 20;
        swap(p);
        // Here the swap function is taking the reference variable p and changing the value of the object in the heap,
        // that is why the value is being swapped and printed accordingly.
        System.out.println(p.x);
        System.out.println(p.y);
    }

    public static void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

    public static void swap(Point p){
        int temp = p.x;
        p.x = p.y;
        p.y = temp;
    }
}

class Point{
    int x;
    int y;
}
