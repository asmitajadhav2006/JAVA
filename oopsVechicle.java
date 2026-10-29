
class Vehicle {
    public String name;
    public String model;
    public int noofTyres;

    // Parameterized constructor
    Vehicle(String name, String model, int noofTyres) {
        this.name = name;
        this.model = model;
        this.noofTyres = noofTyres;
    }

    public void startEngine() {
        System.out.println("Engine is starting of " + name);
    }

    public void stopEngine() {
        System.out.println("Engine is stopping of " + name);
    }
}

// Car subclass
class Car extends Vehicle {
    public int noofDoors;
    public String transmissionType;

    Car(String name, String model, int noofTyres,
        int noofDoors, String transmissionType) {

        super(name, model, noofTyres);
        this.noofDoors = noofDoors;
        this.transmissionType = transmissionType;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Car engine started: " + name);
    }

    public void displayCar() {
        System.out.println("Car Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Number of Tyres: " + noofTyres);
        System.out.println("Number of Doors: " + noofDoors);
        System.out.println("Transmission Type: " + transmissionType);
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    public String handleBarStyle;
    public String suspensionType;

    Motorcycle(String name, String model, int noofTyres,
               String handleBarStyle, String suspensionType) {

        super(name, model, noofTyres);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie! " + name);
    }

    public void displayMotorcycle() {
        System.out.println("Motorcycle Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Number of Tyres: " + noofTyres);
        System.out.println("Handlebar Style: " + handleBarStyle);
        System.out.println("Suspension Type: " + suspensionType);
    }
}

// Main class
public class oopsVechicle {
    public static void main(String[] args) {

        Car c = new Car("Maruti", "800", 4, 5, "Automatic");

        System.out.println("----- CAR DETAILS -----");
        c.displayCar();
        c.startEngine();
        c.stopEngine();

        System.out.println();

        Motorcycle m = new Motorcycle(
            "Yamaha", "R15", 2, "Sport", "Telescopic"
        );

        System.out.println("----- MOTORCYCLE DETAILS -----");
        m.displayMotorcycle();
        m.startEngine();
        m.stopEngine();
        m.wheelie();
    }
}
