package WeekendAssignments;
abstract class Payment

{
	int amount;
	abstract void makePayment(int amount,String modeOfPayment);
	void paymentDetails(int amount)
	{
		
		
		System.out.println("Payment Amount: "+amount);
		
	}
	
}

class CreditCardPayment extends Payment
{
	void makePayment(int amount,String modeOfPayment)
	{
		paymentDetails(amount);
		
		System.out.println("Paid "+amount+" using Credit Card ending with "+modeOfPayment);
	}
	
}


class UPIPayment extends Payment
{
	void makePayment(int amount,String modeOfPayment)
	{
		
		paymentDetails(amount);
		System.out.println("Paid "+amount+" using UPI ID : "+modeOfPayment);
	}
}
public class Assignment6_Q2_AbstractClass_RealWorldDesign {

	public static void main(String[] args) {
		//Design a Java program for an E-commerce Payment System using an abstract class.
		Payment payment1= new CreditCardPayment();//Dynamic Polymorphism : Parent class is reference but object is created for child class
		payment1.makePayment(500, "1234");
		
		Payment payment2= new UPIPayment();
		payment2.makePayment(1500, "user@upi");
	
		
		
	
	
	
	
	
	}}