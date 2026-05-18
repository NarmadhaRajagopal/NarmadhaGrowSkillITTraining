package WeekendAssignments;
import java.util.*;
import java.util.stream.Collectors;
class StudentAPI
{
	String name;

	public StudentAPI(String name) 
	{
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return   name ;
	}
	
	
}


public class Assignment9_PART_B_StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentAPI obj1 = new StudentAPI("Aman");
StudentAPI obj2 = new StudentAPI("Riya");
StudentAPI obj3 = new StudentAPI("Ankit");
StudentAPI obj4 = new StudentAPI("Tushar");

List<StudentAPI> list1 = new ArrayList<>();
list1.add(obj1);
list1.add(obj2);
list1.add(obj3);
list1.add(obj4);
List<StudentAPI>filterList1=
list1.stream()
			.filter(s->(s.getName()).toLowerCase().endsWith("a"))
			.collect(Collectors.toList());
System.out.println(filterList1);

StudentAPI obj5 = new StudentAPI("Java");
StudentAPI obj6 = new StudentAPI("Automation");
StudentAPI obj7 = new StudentAPI("API");
StudentAPI obj8 = new StudentAPI("Playwright");

List<StudentAPI> list2 = new ArrayList<>();
list2.add(obj5);
list2.add(obj6);
list2.add(obj7);
list2.add(obj8);

List<StudentAPI>filterList2=
list2.stream()
			.filter(s->(s.getName().length()>5))
			.collect(Collectors.toList());
System.out.println(filterList2);



	}

}
