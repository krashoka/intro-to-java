package inheritance;

public class Student extends User{
    int rating;

    public Student() {
    }

    public Student(int id, String name, int rating){
        super(id, name);
        this.rating = rating;
    }

    public void greet(){
        System.out.println("Hi Everyone!");
    }
}
