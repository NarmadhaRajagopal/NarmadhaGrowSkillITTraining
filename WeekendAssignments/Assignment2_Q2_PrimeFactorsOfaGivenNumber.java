package WeekendAssignments;

public class Assignment2_Q2_PrimeFactorsOfaGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int original =60;
		int num=1;
		System.out.println("Problem :To return the Prime factors of of a given number \n");
		System.out.println("Intput :"+original);
		System.out.print("Output :");
		
		for(;num<=original;num++)
		{
			if(original%num == 0)
			{			
				if(num > original/2)
				{
					break;
				}
			if(num<=original)
			{			
				
				int factor = num;
				int temp = 1;
								
				for(;temp<=factor;temp++)
				{					
					if(factor%temp == 0)
					{					
						
						if(temp==1)
					
						{}
					
						else if(temp>1 && temp!=factor)
						{
						
							break;//Without break it will return all the factors of original
						}
						else 
						{
									
						System.out.print(factor +" ");
						}
						
						
					}
			}//for loop factor
			}
			}
		}//first for loop
	}
}
		
	
			
			
			
				
				
				
			
	


	