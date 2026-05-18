package WeekendAssignments;

@FunctionalInterface
interface StringMAnipulation
{
	
	String toUpperCase(String text);
}

interface toReverseAString
{
	StringBuilder Reverse(StringBuilder text);
}


interface toCountVowels
{
	
	int Count(String text);
}

public class Assignment9_PART_A_FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("engineer");
		String input1 = "hello java";
		StringBuilder input2 = new StringBuilder(sb); 
		String input3 = "automation";
		
		//toUpperCase
		StringMAnipulation obj1 = (t)->
									{   
										return t.toUpperCase();
								
										
									}; 
									
									String converted = obj1.toUpperCase(input1);
									
									System.out.println("Input :"+ input1 );
								
									System.out.println("Output :"+ converted );
		//StringReversal							
		toReverseAString obj2	=	(t)->
		
									{	
										return t.reverse();
									};
									StringBuilder reversed=obj2.Reverse(sb);
									
									System.out.println("\nInput :"+ input2 );
									
									System.out.println("Output :"+ reversed );

		toCountVowels  obj3 =  (t)->
									{   int c = 0;
										char[]arrchar=t.toCharArray();
										for(char ch:arrchar)
										{
										if("aeiou".indexOf(ch)!=-1)//returns the index of ch from "aeiou"										{
											c++;//if index is found
											
										}
										
										
										return c;
									};
									int count = obj3.Count(input3);
									System.out.println("\nInput :"+ input3 );
									
									System.out.println("Output :"+ count );
	}

}
