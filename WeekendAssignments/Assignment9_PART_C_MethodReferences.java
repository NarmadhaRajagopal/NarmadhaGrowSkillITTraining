package WeekendAssignments;
import java.util.*;
public class Assignment9_PART_C_MethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>list1 = Arrays.asList("A","B","C");
		
		System.out.println("Printing the elements using method reference");
		list1.stream()
					.forEach(System.out::println);
		List<Integer>list2 = Arrays.asList(40,10,30,20);
		System.out.println("Printing the numbers in ASC Order");
		list2.stream()
					.sorted()
					.forEach(System.out::println);
		System.out.println("Printing the numbers in DESC Order");
		list2.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(System.out::println);
				
	}

}
