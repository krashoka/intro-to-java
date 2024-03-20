package polymorphism;

public class ICEcar extends Vehicle{
    @Override
    public void move(){
        System.out.println("ICEcar is moving");
    }

    public void moveDemo(){
        System.out.println();
        super.move();
        this.move();
    }
}
