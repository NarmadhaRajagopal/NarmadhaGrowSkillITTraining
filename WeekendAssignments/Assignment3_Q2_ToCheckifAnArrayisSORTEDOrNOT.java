package WeekendAssignments;

public class Assignment3_Q2_ToCheckifAnArrayisSORTEDOrNOT {
	
	static boolean isSorted(int[] arr)
	{
		//Problem Statement : To check if an array is sorted or not
		
		for(int i=0;i<arr.length-1;i++)
		{
		if(arr[i+1]<arr[i])
		
			{
			return false;
			}//exit early
		
		
		}
		
			return true;//returns only after the loop is finished
		
}
		

	public static void main(String[] args) {
		
		int[] ARR1 = {1,2,3,4,6};
		int[] ARR2 = {1,3,2};
		boolean Array1= isSorted(ARR1);
		boolean Array2= isSorted(ARR2);
		System.out.println("Is this array {1,2,3,4,6} sorted? : "+Array1);
		System.out.println("Is this array {1,3,2} sorted? :"+Array2);

	}

}
