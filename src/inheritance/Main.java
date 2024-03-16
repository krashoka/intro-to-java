package inheritance;

public class Main {
    public static void main(String[] args) {
        Student s1;
        s1 = new Student();
        s1.id = 1;
        s1.name = "Ashok";
//        s1.phoneNumber = 23455;
        s1.setPhoneNumber(12345);

        User u1 = new User(2, "Amar", 67890);
    }
}
