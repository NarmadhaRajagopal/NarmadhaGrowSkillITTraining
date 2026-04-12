package WeekendAssignments;
class Person
{
	String name;
	int age;
	Person()
	{}
	Person(String name,int age)
	{
		this.name =name;
		this.age=age ;
		
		
	}

}
class Student extends Person
{
	
	
	int marks;
	
	
	//Student()
	//{}
		
	Student(int marks)
	{
		
			
		this.marks =marks;
		
	}
	void Display()
	{
		System.out.println("Student Details :"+"\n"+"__________________");
		System.out.println("\n"+"Name: "+name+" \nAge: "+age+"\nMarks: "+marks);
		
	}
 
}

public class Assignment4_Q1_Create2Classes_use_this_inheritance_constructors {

	public static void main(String[] args) {
		
				
		
		
				
		//Person person = new Person("narmadha",36);
		//person.name = "Narmadha";
		//person.age = 36;
		Student student1  = new Student(82);
		
		
		
		student1.age =36;
		student1.name = "Narmadha.R";
		student1.marks = 90;
		student1.Display();
		
	
		
		

	}

}
