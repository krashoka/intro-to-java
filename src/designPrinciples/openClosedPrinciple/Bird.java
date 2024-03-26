package designPrinciples.openClosedPrinciple;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    abstract void fly();
    abstract void makeSound();
    abstract void dance();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
