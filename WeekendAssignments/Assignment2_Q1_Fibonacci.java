package WeekendAssignments;

public class Assignment2_Q1_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 =0;
int num2 =1;
int count =20;
System.out.println("Problem : Fibonacci Series with Condition\n");

System.out.println("Input : "+count);

System.out.print("Output :\n");

System.out.print(num1+" "+num2+" ");

int i=1;count = count-2;

while(i<=count)
{
	int num3=num1+num2;
	System.out.print(+num3+" ");
	num1 = num2;
	num2 = num3;
	i++;
	}
	}

}
