package interfaces;

public class Travel {
    public Tata tata;

    public Travel(Tata tata) {
        this.tata = tata;
    }

    public void travel(){
        System.out.println("Start your travel journey!");
        this.tata.startEngine();
        this.tata.startAC();
        this.tata.startMedia();
    }
}
