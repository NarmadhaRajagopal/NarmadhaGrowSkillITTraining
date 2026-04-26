package WeekendAssignments;

public class Assignment6_Q1_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]words = {"interview", "internet", "interval","internal"};
		//String[]words = {"interspecies", "interstellar", "interstate", "internet"};
		//String[]words = {"abcd", "a", "abc","xy"};
		//String[]words = {"flower", "flow", "flight", "fl"};
		//String[]words = {"ab", "abc", "abd"};
		//String[]words={"dog", "racecar", "car"};
		//String[]words = {"abc", "ab",""};
		//String[]words = {"","inter", "internet"};
		
		System.out.print("Input :\n{");
		for(String w:words)
			
		{
			
			System.out.print("\""+w+"\",");
		}
		System.out.println("}");
		
		System.out.println("Length of input string: "+words.length);
		
		for(int i =0;i<words.length;i++)
		{
			
			if(words[i].isBlank())
				{words[i] = "";}
		}
			
		int[]stringSize = new int[words.length];
		int count =0;
		for(String S:words)
		{
			
			
			stringSize[count] = S.length();
			//System.out.println("Length of String:"+S+stringSize[count]);
			 count++;
		}
		int smallest = words[0].length();
		int indexOfsmallest = 0;
		
		
		for(int i =0;i <=stringSize.length-1;i++)
		{
			if(stringSize[i]<=smallest)
			{
				
				
				smallest = stringSize[i];
				indexOfsmallest = i;
			}
			
		}
		
		//System.out.println("Smallest String element is at index ["+indexOfsmallest+"]"+"with size : "+smallest);	
		String ref = words[indexOfsmallest];
		
		
		
			
		String prefix = " ";
		if(!ref.isEmpty() && !ref.isBlank())
		{
	
		outer:
		for(int j=1;j<=smallest;j++) 
		{
		
			for(int i=0;i<words.length;i++)
				{
					
					String edit=ref.substring(0,j);
					String comp = words[i].substring(0,j);
					///*For my reference:
					//System.out.println("Edit"+edit);
					//System.out.println("Comp"+ comp);
					/// */
					 
					
					
					
					if(!edit.equals(comp))
					{
						
						if(j==1)
						{
							System.out.println("No Common Prefix");
							break outer;
							
						}
						else if(j>1)
						
						{
							prefix =ref.substring(0,j-1); 
							
						break outer;
						}
											
					}
					else
					{
						
							prefix =ref.substring(0,j);
							
						
						
						
					}
				
								
				}
				}
				System.out.println("Output:");
				System.out.println("Longest common prefix:"+prefix);
		}
		else
		{
			System.out.println("Output:");
			System.out.println("No Common Prefix");
			
		}
				
				
	}

	
	}
	
	

