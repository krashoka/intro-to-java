package interfaces;

public class Tata implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Engine is starting in Tata");
    }

    @Override
    public void startAC() {
        System.out.println("Ac is starting in Tata");
    }

    @Override
    public void startMedia() {
        System.out.println("Media is starting in Tata");
    }
}
