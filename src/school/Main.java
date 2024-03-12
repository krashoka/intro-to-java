package school;

public class Main {
    public static void main(String[] args){
//        These are OUTSIDE THE CLASS BUT SAME PACKAGE
        Student s = new Student();
        s.marks = 95;
        s.rank = 10;
//        s.address = "Adarsh Nagar"; // Since it is private, so it is not accessible outside class
        s.name = "Ashok";
        System.out.println(s.rank);
    }
}
