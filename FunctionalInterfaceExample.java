package java8Features;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import java.util.function.Consumer;

//A functional interface is an interface that contains only one abstract method and can have many default,static methods. 
//They can have only one functionality to exhibit. Also known as Single Abstract Method Interfaces.

//Runnable –> This interface only contains the run() method.
//Comparable –> This interface only contains the compareTo() method.
//ActionListener –> This interface only contains the actionPerformed() method.
//Callable –> This interface only contains the call() method.

@FunctionalInterface
interface animal{
	
	void speak(String animal);
		
}

interface In1 {
	   
    // public, static and final
    final int a = 10;
 
    // public and abstract
    void display();
    void screen();
}

public class FunctionalInterfaceExample implements Runnable,animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceExample funcInterfaceExample=new FunctionalInterfaceExample();
		funcInterfaceExample.speak("Dog");
		
		BiConsumer<Integer, Integer> biConsume = (value,values) -> System.out.println(value+values);
		biConsume.accept(30, 40);
		
		Consumer<Integer> consumer = (value) -> System.out.println(value);	
		consumer.accept(300);
		
		Runnable r1=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Runnable Interface");
			}
		};
		
		Runnable r2 = () -> {
			System.out.println("Lambda Runnable class");
		};
		
		
		
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak(String animal) {
		// TODO Auto-generated method stub
		System.out.println(animal);
	}
}