package WeekendAssignments;
class Vehicle

{	static String company;
	String brand;
	int speed;
	String engineType;
	Vehicle(String brand,int speed)
	{
		this.brand = brand;
		this.speed = speed;
		
		
	}
	
	void run()
	{
		
		
		System.out.println("The vehicle is running");	
		}
	
	static void displayCompany(String company)
	{
		
		System.out.println("Company:"+company);
	}
	
	final void engineType(String engineType)
	{
		
		this.engineType=engineType;
		System.out.println("Engine Type:"+engineType);
		
	}
	void StringManipulation(String brand)
	{
		
		String reversed = new StringBuilder(this.brand).reverse().toString();
		System.out.println("Reversed:"+reversed);
		String replaced=this.brand.replace('y','*');
		 replaced=replaced.replace('u','*');
		 replaced=replaced.replace('a','*');
		 replaced=replaced.replace('i','*');
		System.out.println("Replaced:"+replaced);
		System.out.println("Equals "+brand+":"+this.brand.equals(brand));
		
	}
}

class Car extends Vehicle
{
	String fuelType;
	
	Car(String fuelType,String brand,int speed)
	{
		
		super(brand,speed);
		this.fuelType=fuelType;
		
		System.out.println("Brand:" +super.brand+"\nSpeed:"+super.speed+"\nFuel Type:"+this.fuelType);
	}
	
	void run()
	{
		
		
		System.out.println("The car is running smoothly");	
		}
	/*
	void engineType(String engineType) // Error!!! :Cannot override the final method from Vehicle
	{
		
		this.engineType=engineType;
		System.out.println("Engine Type:"+engineType);
		
	}*/
	
	
}
public class Assignment5_Q2_VehicleClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car obj = new Car("Petrol","Hyundai",120);
		obj.run();	
		Car.company = "AutoWorld Ltd";
		Car.displayCompany(Car.company);
		obj.engineType("Standard Engine");	
		
		System.out.println("\nSTRING MANIPULATION");
		System.out.println("----------------------");
		
		obj.StringManipulation("Hyundai");
		}

}
