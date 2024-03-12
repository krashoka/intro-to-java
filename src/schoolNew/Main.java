package schoolNew;

import school.Student;

public class Main {
    public static void main(String[] args){
//        These are OUTSIDE THE PACKAGE IN DIFFERENT PACKAGE

        school.Student s = new Student();
//        s.marks = 95; // Since it is default, Cannot be accessed from outside package
        s.rank = 10;
//        s.address = "Adarsh Nagar"; // Since it is private, so it is not accessible outside class
//        s.name = "Ashok"; // Since it is protected, Cannot be accessed from outside package
        System.out.println(s.rank);
    }
}
