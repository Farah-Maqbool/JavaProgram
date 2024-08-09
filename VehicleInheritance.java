//. Vehicle Inheritance:
// Create a class named Vehicle with attributes like model, year, and color.
// Create subclasses for Car, Motorcycle, and Truck inheriting from Vehicle.
// Add specific attributes and methods for each vehicle type (e.g., numberOfDoors for Car,
//engineCapacity for Motorcycle).
// Implement a method to display vehicle details for each type.
class Vehicle {
    String model, year, color;
    void displayDetails(){
        System.out.println("Details");
    }
}
class Car extends Vehicle{
    int numberOfDoors;
    Car(String model, String year, String color, int numberOfDoors){
        this.model = model;
        this.year = year;
        this.color = color;
        this.numberOfDoors= numberOfDoors;
    }
    @Override
    void displayDetails(){
        System.out.println("Car");
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Color: "+color);
        System.out.println("Number OF Doors: "+numberOfDoors);
    }

}
class MotorCycle extends Vehicle{
    String engineCapacity;
    MotorCycle(String model, String year, String color, String engineCapacity){
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }
    @Override
    void displayDetails(){
        System.out.println("Motor Cycle");
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Color: "+color);
        System.out.println("Engine Capacity: "+engineCapacity);
    }
}
class Truck extends Vehicle{
    int loadCapacity;
    Truck(String model, String year, String color, int loadCapacity){
        this.model = model;
        this.year = year;
        this.color = color;
        this.loadCapacity = loadCapacity;
    }
    @Override
    void displayDetails(){
        System.out.println("Truck");
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Color: "+color);
        System.out.println("Load Capacity: "+loadCapacity);
    }
}

public class VehicleInheritance {
    public static void main(String[]args){
        Vehicle car = new Car("Toyota Camry","2023","Black",4);
        Vehicle motorcycle = new MotorCycle("Rebel","2024","White","471cc");
        Vehicle truck = new Truck("Tacoma","2023","Blue",6754);
        car.displayDetails();
        motorcycle.displayDetails();
        truck.displayDetails();
    }
}
