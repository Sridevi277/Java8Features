package mentorConnectSampleCodes;

//Default Interface allows you to add new methods to interfaces without breaking the existing implementations of those interfaces
interface Vehicle {
	void start();

	void stop();

	default void honk() {
		System.out.println("Beep beep!");
	}
}

public class DefaultInterface implements Vehicle {

	public static void main(String[] args) {
		DefaultInterface car = new DefaultInterface();
		car.start();  // Output: Car started
		car.stop();   // Output: Car stopped
		car.honk();   // Output: Beep beep!
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}

}
