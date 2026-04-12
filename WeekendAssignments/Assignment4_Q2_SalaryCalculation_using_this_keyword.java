package WeekendAssignments;

class Employee
{
	int id;

	String name;
	
	

	double basicsalary;
	
	double Totalsalary;
	
	double Bonus;
	Employee()
	{}
	
	Employee(int id,String name,double basicsalary)
	{		
		this.id =id;
		this.name = name;
		this.basicsalary =basicsalary;
		
		
	}
	
	double calculatesalary()
	{
		
		double HRA = 0.2*this.basicsalary;
		
		double Bonus = 0.1*this.basicsalary;
		double TotalSalary =this.basicsalary+HRA+Bonus;
		
		return TotalSalary;
		
	}
	void display(double TotalSalary)
	{
		System.out.println("Employee ID:"+this.id+"\n"+"Employee Name:"+this.name+"\n"+"Basic Salary:"+this.basicsalary+"\n"+ "Calculated Total Salary:"+TotalSalary);
		System.out.println("----------------------------------------");
		
	}
}

public class Assignment4_Q2_SalaryCalculation_using_this_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee employee1 = new Employee(234,"Narmadha",10500.0);
		Employee employee2 = new Employee(235,"Vishnu",12500.0);
		
		double TotalSalary = employee1.calculatesalary();
		
		employee1.display(TotalSalary);
		TotalSalary = employee2.calculatesalary();
		
		employee2.display(TotalSalary);
		

	}

}
