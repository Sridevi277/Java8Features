package mentorConnectSampleCodes;

import java.util.*;
import java.util.stream.Stream;

//The Stream API in Java provides a powerful way to process collections of objects in a functional and declarative style.
public class StreamApiExample {

	public static void main(String[] args) {
		//		 Creating Streams
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = numbers.stream();
		System.out.println("count is: "+stream.count());
		//		Intermediate Operations: Common intermediate operations include filter, map, sorted, distinct, etc.
		List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
		names.stream()
		.filter(name -> name.startsWith("A"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);

		//		Terminal Operations: Common terminal operations include forEach, collect, reduce, count, findFirst, anyMatch, etc.
		List<Integer> nums = Arrays.asList(11,12, 13, 14, 15);
		int sum = nums.stream().reduce(0, Integer::sum);
		System.out.println("Sum: " + sum);
		
//		Parallel Streams: Streams can be processed in parallel to take advantage of multiple CPU cores for improved performance.
		List<Integer> newNumbers = Arrays.asList(21, 22, 23, 24, 25);
		int psum = newNumbers.parallelStream().reduce(0, Integer::sum);
		System.out.println("Sum: " + psum);

	}

}
