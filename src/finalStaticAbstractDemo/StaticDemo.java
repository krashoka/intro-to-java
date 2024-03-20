package finalStaticAbstractDemo;

public class StaticDemo {
    public static void main(String[] args) {
        Student.fullMarks = 100;
        Student s1 = new Student(98);
        Student s2 = new Student(94);

        s2.fullMarks = 150; // This will change the fullMarks for all the students. So this is not advisable

        System.out.println("Full Marks: " + Student.fullMarks + ", Scored Marks: " + s1.scoredMarks);

        // This s2.fullMarks is not advisable
        System.out.println("Full Marks: " + s2.fullMarks + ", Scored Marks: " + s2.scoredMarks);

        System.out.println("*****************************");

        // Here in below two examples the execution of static methods always happens at class level.
        IntelligentStudent intellSt = new IntelligentStudent();
        intellSt.greet(); // So the static greet() method is called from its reference class that is IntelligentStudent

        Student st = new IntelligentStudent();
        // And here also the static greet() method is called from its reference class i.e. Student
        // not from IntelligentStudent despite being UPCASTED.
        st.greet();
    }
}

class Student{
    static int fullMarks;
    int scoredMarks;

    public Student() {
    }

    public Student(int scoredMarks) {
        this.scoredMarks = scoredMarks;
    }

    public void studentScore(){
        System.out.println("Full Marks: " + Student.fullMarks); // Static members(attributes/methods) can be accessed by non-static methods
        System.out.println("Scored Marks: " + scoredMarks); // Non-static members(attributes/methods) can be accessed by non-static methods
    }
    public static void studentScoreStatic(){
        System.out.println("Full Marks: " + Student.fullMarks); // Static members(attributes/methods) can be accessed by static methods
//        System.out.println("Scored Marks: " + scoredMarks); //Non-static field 'scoredMarks' cannot be referenced from a static context
    }

    public static void greet(){
        System.out.println("Hello, How are you?");
    }
}

class IntelligentStudent extends Student{
    public static void greet(){
        System.out.println("Hi, I'm fine.");
    }
}
