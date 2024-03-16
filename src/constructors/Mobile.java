package constructors;

public class Mobile {
    String name;
    String brand;
    int model;
    int price;

    public Mobile(String mName, String mBrand, int mModel, int mPrice){
        name = mName;
        brand = mBrand;
        model = mModel;
        price = mPrice;
    }

    // Copy Constructor
    public Mobile(Mobile mob){
        name = mob.name;
        brand = mob.brand;
        model = mob.model + 1;
        price = mob.price + 20000;
    }
}
