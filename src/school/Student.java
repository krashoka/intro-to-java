package school;

public class Student {
    int marks;
    public int rank;
    private String address;
    protected String name;

    public String getAddress(){
        return address;
    }

    public void setAddress(String add){ // String address
//        this.address = address; // if attribute and parameter have same spelling then we need to use this keyword to differenciate them.
        address = add;
    }
}
