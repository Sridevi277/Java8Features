package mentorConnectSampleCodes;

import java.util.Optional;

//The Optional class in Java 8 is a container object which is used to contain a value that might or might not be present.
public class OptionalClass {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[5]="cat";
		str[1]="puppy";
		
		Optional<String> checkNull=Optional.ofNullable(str[5]);
		
		if(checkNull.isPresent()) {
			String lowerCaseString=str[5].toLowerCase();
			System.out.println(lowerCaseString);
		}else {
			System.out.println("String is not present");
		}
		
		Optional<String> empty=Optional.ofNullable(str[5]);
		if(empty.isEmpty()) {
			System.out.println("String is Empty");
		}else {
			System.out.println("String is not Empty");
		}
		
		Optional<String> value=Optional.of(str[5]);
		System.out.println("Filtered value "+value.filter((s)->s.equals("cat")));
		System.out.println("Filtered value "+value.filter((s)->s.startsWith("Dog")));
		
		System.out.println("getting value "+value.get());
		System.out.println("Getting Hashcode "+ value.hashCode());
		System.out.println("orElse "+value.orElse("value is not present"));

	}

}
