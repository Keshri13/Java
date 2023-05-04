public class App {
    public static void main(String[] args) throws ClassNotFoundException {

        //System.out.println("Hello, I am Keshu, And it seems I am not good as I was once");
        // DataTypes dataTypes = new DataTypes();
        // DataTypes.printX();

        //implementBikes();
        
        
    }

    static void implementBikes() {

        //Bike bike = new Bike();
        
        //For Loading the Bike class where the static blocks are called first when the class is loaded for the first time
        //Class.forName("Bike");
        
        // System.out.println(Bike.fuelUsed);
        // System.out.println(Bike.noOfWheels);

        Bike heroBike = new Bike();
        heroBike.display();

        Bike hondaBike = new Bike(250, 15, 180, "Honda");
        hondaBike.display();
        System.out.println("------------------------------------------");

    }
}
