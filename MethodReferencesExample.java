package mentorConnectSampleCodes;

interface Calculate{
	int calculator(int a,int b);
}
interface ConstructInter{
	void printmsg(String msg);
}

class Message{
	 Message(String msg) {
		// TODO Auto-generated constructor stub
		System.out.println(msg);
	}
}

public class MethodReferencesExample  {

	public static void main(String[] args) {
		MethodReferencesExample methodReferencesExample=new MethodReferencesExample();
		
		// Using method reference to implement the functional interface -- Syntax: ContainingClass::staticMethodName  
        Calculate subtraction = MethodReferencesExample::subtract;
        System.out.println("static method Subtraction result: " + subtraction.calculator(5, 3)); // Output: Subtraction result: 2
        
        //Reference to an Instance Method -- Syntax: containingObject::instanceMethodName  
        Calculate addition=methodReferencesExample::addition;
        System.out.println("Non-static method Addition result "+addition.calculator(7, 7));
        
        Thread t2=new Thread(new MethodReferencesExample()::printnMsg);  
        t2.start();
        
       // Reference to a Constructor== Syntax:ClassName::new  
        ConstructInter msg=Message::new;
        msg.printmsg("Hello");
        
	}
	//instance method
	public void printnMsg(){  
        System.out.println("Hello, this is instance method");  
    }
	
	// Method referenced for subtraction operation
    private static int subtract(int a, int b) {
        return a - b;
    }
    public int addition(int a,int b) {
		return a+b;
	}
}
