package interfaces;

public class Mahindra implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Engine is starting in Mahindra");
    }

    @Override
    public void startAC() {
        System.out.println("AC is starting in Mahindra");
    }

    @Override
    public void startMedia() {
        System.out.println("Media is starting in Mahindra");
    }
}
