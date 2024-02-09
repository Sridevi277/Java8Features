package oopsConcept;

//that allows objects of different classes to be treated as objects of a common superclass.
//There are two types of polymorphism in Java: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).

//Parent class
class Animal {
	// Method to make sound
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Subclass Dog inheriting from Animal
class Dog extends Animal {
	// Overriding the makeSound method
	void makeSound() {
		System.out.println("Dog barks");
	}
}

//Subclass Cat inheriting from Animal
class Cat extends Animal {
	// Overriding the makeSound method
	void makeSound() {
		System.out.println("Cat meows");
	}
}

public class PolymorphismExample {

	public static void main(String[] args) {
		// Creating objects of Dog and Cat classes
		Animal dog = new Dog();
		Animal cat = new Cat();

		// Calling makeSound method of Dog and Cat objects
		dog.makeSound(); // Output: Dog barks
		cat.makeSound(); // Output: Cat meows

	}

}
