package oopsConcept;

//It helps in hiding the internal state of an object and only exposing the necessary functionalities through public methods. 
//Example of encapsulation
class Student {
	private String name; // private attribute
	private int age;     // private attribute

	// Public setter methods to set the values of private attributes
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) { // validate age
			this.age = age;
		} else {
			System.out.println("Invalid age");
		}
	}

	// Public getter methods to get the values of private attributes
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		// Creating an object of Student class
		Student student = new Student();

		// Setting values using setter methods
		student.setName("John");
		student.setAge(20);

		// Getting values using getter methods
		System.out.println("Name: " + student.getName()); // Output: Name: John
		System.out.println("Age: " + student.getAge());   // Output: Age: 20

	}

}
