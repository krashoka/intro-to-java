package designPatterns.builder;

public class Main {
    public static void main(String[] args) {
        Student s = Student.builder()
                .id(1)
                .name("Ashok")
                .age(26)
                .gradYear(2019)
                .universityName("LNMI")
                .phoneNumber("8434280149")
                .psp(98)
                .build();

        System.out.println(s);
    }
}
