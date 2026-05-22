package WeekendAssignments;

import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assignment8_FileReader {



public static void main(String[] args) {
		// TODO Auto-generated method stub
		//path:"C:\Users\vishnu\GSIT\JAVAPractice\FileReadWrite.txt"
		try
		{
		/*
		Scanner sc = new Scanner(System.in);
		String userFile = sc.next();
 		FileWriter fw = new FileWriter(userFile);
 
 		fw.write("Java is simple\nThreads are powerful\nFile handling is important");
 		fw.close();
	
		;*/
		Scanner sc = new Scanner(System.in);
		File file = new File(sc.next());
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int count =0;
		String str ="";
		StringBuilder sb = new StringBuilder();
		while((str= br.readLine())!= null)
		{
			sb.append(str+" ");
			count++;
	
	
		}
  
		String strconv =(sb.toString().trim());
		System.out.println(strconv);
		String[]strs =strconv.split(" ");
		StringBuilder sbchar = new StringBuilder();
		for(String s:strs)
		{
			sbchar.append(s);
		}
		System.out.println("No of characters in the file is:"+sbchar.length());
		List<String>list = new ArrayList<>(Arrays.asList(strs));
//List<String>list = Arrays.asList(strs); //valid but becomes a list of fixed size-cant add /remove items
//list.size();
		Collections.sort(list,String.CASE_INSENSITIVE_ORDER);//for alpha order
		System.out.println("Alpha Order:"+list);
		Collections.sort(list,(a,b)->a.length()-b.length());//to sort based on the lenghth of the elements
		list.getLast();

		System.out.println("Sorted list based on lenghth of the strings"+list);
		System.out.println("No of words in the list:"+list.size());

		System.out.println("Longest word :"+list.getLast() );
 
		}catch(Exception e)
		
		{
			
		}
 
		}

}
