// Level 0
class Machine {
    public String brand = "Global Tech";
    protected String powerhouse = "Battery";
    private String serialNo = "SN-45";

    void showSecret() {
        System.out.println("My id is: " + serialNo);
    }
}

// Level 1
class Vehicle extends Machine {
    void checkSpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Power: " + powerhouse);
        // System.out.println(serialNo);  // ❌ Not allowed (private)
    }
}

// Level 2
class Car extends Vehicle {
    public String model = "Sports Car";

    void drive() {
        System.out.println(brand + " " + model);
    }
}

public class ExtendDemo {
    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();
        myVehicle.checkSpecs();

        Car myCar = new Car();
        myCar.drive();
    }
}
