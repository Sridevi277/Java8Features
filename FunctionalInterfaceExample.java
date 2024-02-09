package mentorConnectSampleCodes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//A functional Interface consists of only one abstract method and can contain many default or static methods.
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample{
    public static void main(String[] args) {
    	
        // Using lambda expression to implement the functional interface
        Calculator addition = (a, b) -> a + b;
        System.out.println("Addition result: " + addition.calculate(5, 3)); // Output: Addition result: 8
        
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

        // Using lambda expression to create a comparator for sorting names in ascending order
        Comparator<String> ascendingComparator = (s1, s2) -> s1.compareTo(s2);
        names.sort(ascendingComparator);
        System.out.println("Names sorted in ascending order: " + names); // Output: Names sorted in ascending order: [Alice, Bob, Charlie, John]

        // Using method reference to create a comparator for sorting names in descending order
        Comparator<String> descendingComparator = String::compareTo;
        names.sort(descendingComparator.reversed());
        System.out.println("Names sorted in descending order: " + names); // Output: Names sorted in descending order: [John, Charlie, Bob, Alice]
   
    }


}

