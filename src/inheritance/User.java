package inheritance;

public class User {

    int id;
    String name;
    private int phoneNumber;

    public User() {
    }

    public User(int id, String name, int phoneNumber) {
        this(id, name);
        this.phoneNumber = phoneNumber;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void greetAll(){
        System.out.println("Hey Guys!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
