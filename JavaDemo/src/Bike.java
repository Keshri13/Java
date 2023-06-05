public class Bike {

    int engineCapacity;
    int tankCapacity;
    int topSpeed;
    String manufacturingBrand;

    static int noOfWheels = 2;
    static String fuelUsed = "Petrol";

    static {
        noOfWheels = 2;
        fuelUsed = "Petrol";
        System.out.println("In Static Block");
    }

    Bike() {
        engineCapacity = 160;
        tankCapacity = 16;
        topSpeed = 123;
        manufacturingBrand = "Hero Honda";
    }

    Bike(int engineCapacity, int tankCapacity, int topSpeed, String manufacturingBrand) {
        this.engineCapacity = engineCapacity;
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
        this.manufacturingBrand = manufacturingBrand;
    }

    public void display() {

        System.out.println("------------------------------------------");
        System.out.println("Engine Capacity : " + engineCapacity + " cc");
        System.out.println("Tank Capacity : " + tankCapacity + " Ltr");
        System.out.println("Top Speed : " + topSpeed + " Kmph");
        System.out.println("Manufacturing Brand : " + manufacturingBrand);
        System.out.println("Number of Wheels used : " + noOfWheels);
        System.out.println("Fuel used : " + fuelUsed);
        // System.out.println("------------------------------------------");

    }

}
