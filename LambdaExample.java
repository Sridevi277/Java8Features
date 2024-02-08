package java8Features;

import java.util.ArrayList;
import java.util.Comparator;

//Lambda expressions basically express instances of functional interfaces.
//A lambda expression is a short block of code which takes in parameters and returns a value.
//Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
interface Say{   
  public String sayNo();
} 

interface Sayable{   
    public String sayName(String name);
}  

@FunctionalInterface
interface Addable{
	int add(int a,int b,int c);
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	    
		Say say=()->{
			return "Zero parameter";
		};
		
		System.out.println(say.sayNo());
		
		Sayable s=(name)->{
			return "Single parameter Lambda Function";
		};
		
		System.out.println(s.sayName("lucky"));
		
		Addable ad1=(a,b,c)->(a+b+c);
		Addable ad2=(int a,int b,int c)->{  
            return (a+b+c);   
            };  
            
        System.out.println(ad2.add(100,200,300)); 
		System.out.println(ad1.add(23,73, 87));
		
	}

}
