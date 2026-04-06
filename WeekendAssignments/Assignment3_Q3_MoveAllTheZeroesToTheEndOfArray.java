package WeekendAssignments;

public class Assignment3_Q3_MoveAllTheZeroesToTheEndOfArray {

	public static void main(String[] args) {
		// Problem Statement:To move all the zeroes in the array to the end
		//without using extra array
		
		int[] arr = {0,1,0,3,5,0,0,0,9,0,0,0,7,0,5};
		int count =0;int temp;
		for(int ind=0;ind<=arr.length-1;ind++)
		{
			if(arr[ind]!=0)
				count++;
			
		}
		System.out.println("Input :");
		for(int i =0;i<=arr.length-1;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Number of NonZero elements in the array is:"+count);

		for (int ind=0;ind<count;ind++)
		{
						
			{
			while(arr[ind]==0)
				
			{
				temp =arr[ind];
				for(int k=ind;k<arr.length-1;k++)
				{
					arr[k]=arr[k+1];
					
				}
				arr[arr.length-1]=temp;
				
				//to print the step in each iteration
				//for(int i =0;i<=arr.length-1;i++)
					//System.out.print(arr[i]+" ");
				//System.out.println();
				
				
					
			}
			
			}
				
				
			
			
		}
		System.out.println("Output :");
		for(int i =0;i<=arr.length-1;i++)
		System.out.print(arr[i]+" ");
		System.out.println();
		

	}

}
