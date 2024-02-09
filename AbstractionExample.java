package oopsConcept;

// where you define the structure of a class in a way that hides the implementation details from the user and only shows the necessary features or functionalities.

//Abstract class
abstract class Shape {
 // Abstract method
 abstract double area();
}

//Concrete class Circle extending Shape
class Circle extends Shape {
 double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 // Implementation of abstract method area() for Circle
 double area() {
     return Math.PI * radius * radius;
 }
}

//Concrete class Rectangle extending Shape
class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementation of abstract method area() for Rectangle
 double area() {
     return length * width;
 }
}

public class AbstractionExample {

	public static void main(String[] args) {
		// Creating objects of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calling area() method on Circle and Rectangle objects
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
	}

}
