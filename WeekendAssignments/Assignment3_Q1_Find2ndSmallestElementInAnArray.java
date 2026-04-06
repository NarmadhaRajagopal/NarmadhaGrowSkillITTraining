package WeekendAssignments;

public class Assignment3_Q1_Find2ndSmallestElementInAnArray {

	public static void main(String[] args) {
//Problem Statement
//Take an array of size 6
//Traverse and find smallest
//Traverse again to find second smallest
//Handle case when all elements are same
		int arr[] = {4,2,7,1,2,9};
		
		int smallest = arr[0];//assuming element 1 as the smallest and comparing other elements with this element
		int secondsmallest;
		
		for (int row =0;row<=arr.length-1;row++) //row can be 0 or 1
		{
			if(arr[row]<smallest)
			{
				smallest = arr[row];
				
			}
			
		}
		System.out.println(" Smallest element in the array is :"+smallest);
		
		
		
			
			if(arr[0]!=smallest)
				secondsmallest = arr[0];
			else
				secondsmallest = arr[1];
			
			{
			for (int row =0;row<=arr.length-1;row++)
			{
				
				if(arr[row]==smallest)
				{
					continue;
					
				}
				else if(arr[row]==secondsmallest)
				{
					continue;
				}
				else
					{if(arr[row]<secondsmallest)
					{
						secondsmallest = arr[row];
						
					}
					}
			}
			System.out.println(" SecondSmallest element in the array is :"+secondsmallest);
			
			}
			
			
					
					
		}
		
	}

