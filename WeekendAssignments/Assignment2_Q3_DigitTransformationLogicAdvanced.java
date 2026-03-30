package WeekendAssignments;

public class Assignment2_Q3_DigitTransformationLogicAdvanced {

	public static void main(String[] args) {
		int num = 57243,digitposition = 1,original =num;
		int digitvalue = 0;
		int newnum=num;
		int position =0;
		int newdigitvalue =0;
		int old =0,latest =0;
		System.out.println("Problem : Digit transformation logic advanced\n");
		
		System.out.println("Input : \n n ="+original);
		
		System.out.println("*********************************************************************");
		while(num>0)
		{
			
			
		
			position++;
			digitvalue = num%10;
			num=num/10;
			
			//System.out.println(num);
			//System.out.println(digitvalue);
			//System.out.println(digitposition);
			System.out.println("Original value of the digit "+"at "+digitposition+"'s position "+" is : "+digitvalue);
			
			if(position%2!=0 && digitvalue<=4)
			{
				
				//System.out.println("For odd digit position");
				
				old = digitvalue*digitposition;
				latest = old*2;
				//System.out.println("old "+old);
				//System.out.println("latest "+latest);
				//System.out.println("Before change: "+newnum);
				
				newnum= newnum-old+latest;
				//System.out.println("After change: "+newnum);
				System.out.println("Modified number after changing the value at "+digitposition+"'s position is "+newnum);
				
				
			}
			else if(position%2==0)
			{
				//System.out.println("For even digit position");
				old = digitvalue*digitposition;
				latest = digitposition;
				//System.out.println("old "+old);
				//System.out.println("latest "+latest);
				//System.out.println("Before change: "+newnum);
				
				newnum= newnum-old+latest;
				//System.out.println("After change: "+newnum);
				System.out.println("Modified number after changing the value at "+digitposition+"'s position is "+newnum);
				
			}
			else
			{
				System.out.println("Since the value at "+digitposition+"'s position is >= 4 it is retained as the same value before :  "+digitvalue);
			}
			
			digitposition = digitposition*10;
			
		}
		
		System.out.println("*********************************************************************");
		
		System.out.println("Output : \n modified n ="+newnum);

	}

}
