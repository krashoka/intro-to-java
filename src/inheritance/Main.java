package inheritance;

public class Main {
    public static void main(String[] args) {
        Student s1;
        s1 = new Student(2, "Ashok", 9);
//        s1.phoneNumber = 12345;
        s1.setPhoneNumber(12345);

        User u1 = new User(2, "Amar", 67890);

        User user = new Student(); // UPCASTING | IMPLICIT CASTING
//        user.greet(); // features of the child class cannot be accessible

        /********* HIGHLY NOT RECOMMENDED ***********************/
//        Student st = (Student) new User(); // DOWN CASTING | EXPLICIT CASTING
//        st.greet();
//        st.greetAll();
    }
}
