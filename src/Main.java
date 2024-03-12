import school.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Student{
    public static void main(String[] args) {
        Student s = new Student();
        s.rank = 10; // It has public access
//        s.marks = 23; // Since it is default, so Cannot be accessible outside the package but as a child class
//        s.address = "Adarsh Nagar"; // Since it is private, so Cannot be accessible outside the package but as a child class
        System.out.println(s.rank);

        // Now to set private value of a class we will use setter method of that class like below
        s.setAddress("Adarsh Nagar");
        System.out.println(s.getAddress()); // getAddress is used for getting the address after setting with setter
        System.out.println("git repo created");
    }

    public void demo(){
        Main main = new Main();
        main.name = "Ashok"; // Since it is protected, so it will be accessible outside the package but as a child class
    }
}