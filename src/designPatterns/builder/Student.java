package designPatterns.builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private int gradYear;
    private int psp;
    private String phoneNumber;
    private String universityName;

    private Student(int id, String name, int age, int gradYear, int psp, String phoneNumber, String universityName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gradYear = gradYear;
        this.psp = psp;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;
        private int gradYear;
        private int psp;
        private String phoneNumber;
        private String universityName;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder universityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public void validate(){
            if(this.name == null){
                throw new InvalidNameException();
            }

            if (this.age < 18){
                throw new InvalidAgeException();
            }

            if(this.gradYear > 2024){
                throw new InvalidGradYearException();
            }
        }

        public Student build(){
            validate();
            return new Student(this.id, this.name, this.age, this.gradYear, this.psp, this.phoneNumber, this.universityName);
        }
    }
}
