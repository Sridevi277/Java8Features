package oopsConcept;

//In Inheritance-- a class (subclass or child class) inherits properties and behaviors (methods) from another class (superclass or parent class).

//Parent class (superclass)
class Vehicle {
 String brand;
 int year;

 Vehicle(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 void displayInfo() {
     System.out.println("Brand: " + brand + ", Year: " + year);
 }
}

//Child class (subclass)
class Car extends Vehicle {
 int wheels;

 Car(String brand, int year, int wheels) {
     super(brand, year); // Call the superclass constructor
     this.wheels = wheels;
 }

 void displayCarInfo() {
     System.out.println("Brand: " + brand + ", Year: " + year + ", Wheels: " + wheels);
 }
}

public class InheritanceExample {

	public static void main(String[] args) {
		 // Create an object of Car class
        Car car = new Car("Toyota", 2022, 4);

        // Call methods from both Vehicle and Car classes
        car.displayInfo();      // Output: Brand: Toyota, Year: 2022
        car.displayCarInfo();   // Output: Brand: Toyota, Year: 2022, Wheels: 4

	}

}
