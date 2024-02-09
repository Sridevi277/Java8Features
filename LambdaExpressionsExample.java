package mentorConnectSampleCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

interface FuncInter1{
	int addOperation(int a,int b);
}

interface FuncInter2{
	void sayMessage(String msg);
}

public class LambdaExpressionsExample {
	
	private int operate(int a,int b,FuncInter1 fobj) {
		return fobj.addOperation(a, b);
	}

	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		array.add(32);
		array.add(123);
		array.add(345);
		array.add(12);
		array.add(78);
		
		array.forEach(
				(n)->System.out.println("Single Parameter "+n)
		);
		
		Consumer<Integer> conMethod=(n)->System.out.println(n);
		array.forEach(conMethod);
		
		Collections.sort(array, (o1,o2) -> (o1>o2) ? -1 : (o1<o2) ? 1:0);
		System.out.println(array);
		
		FuncInter1 addFunc=(int a,int b) -> a+b;
		FuncInter1 divFuncInter=(int a,int b) -> a*b;
		
		LambdaExpressionsExample lambdaExpressionsExample=new LambdaExpressionsExample();
		System.out.println("Addition operation "+lambdaExpressionsExample.operate(3, 4, addFunc));
		System.err.println("Multiplication operation "+lambdaExpressionsExample.operate(5, 6, divFuncInter));
		
		FuncInter2 fobj2=(msg)-> System.out.println("Message is"+msg);
		fobj2.sayMessage("Hello!");
		}

}
