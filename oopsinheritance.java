public class oopsinheritance {
    
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// 1. Single Inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// 2. Multiple Inheritance using interfaces
interface Engine {
    void engineType();
}

interface GPS {
    void navigate();
}

// 3. Multilevel Inheritance
class ElectricCar extends Car implements Engine, GPS {
    public void engineType() {
        System.out.println("Electric engine");
    }

    public void navigate() {
        System.out.println("GPS navigation started");
    }

    void charge() {
        System.out.println("Electric car is charging");
    }
}

// 4. Hierarchical Inheritance
class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding");
    }
}

// 5. Hybrid Inheritance using class and interfaces
class SmartCar extends Vehicle implements Engine, GPS {
    public void engineType() {
        System.out.println("Smart car engine");
    }

    public void navigate() {
        System.out.println("Smart car GPS is navigating");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. SINGLE INHERITANCE ===");
        Car c = new Car();
        c.start();
        c.drive();

        System.out.println("\n=== 2. MULTIPLE INHERITANCE ===");
        SmartCar s = new SmartCar();
        s.engineType();
        s.navigate();

        System.out.println("\n=== 3. MULTILEVEL INHERITANCE ===");
        ElectricCar e = new ElectricCar();
        e.start();
        e.drive();
        e.charge();

        System.out.println("\n=== 4. HIERARCHICAL INHERITANCE ===");
        Motorcycle m = new Motorcycle();
        m.start();
        m.ride();

        System.out.println("\n=== 5. HYBRID INHERITANCE ===");
        s.start();
        s.engineType();
        s.navigate();
    }
}

    
}
