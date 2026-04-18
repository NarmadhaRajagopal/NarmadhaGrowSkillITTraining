package WeekendAssignments;

class Book
{
	String title;
	String author;
	static String libraryName;
	final static String ISBN="978-0-439-02348-1";
	


	
	Book(String title,String author)
	{
		this.title = title;
		this.author = author;
		
		
			
	}
	
	
	void display(String filesize)
	{
		//Modify final variable ISBN
		//this.ISBN= "978-0-439-02348-";!!!Observed error : The final field Book.ISBN cannot be assigned
		
		System.out.println("Title:"+this.title+"\n"+"Author:"+this.author+"\n"+"Filesize:"+filesize);
	}
	

	void getDescription()
	{
		
		 System.out.println("This is a physical book");
	}
	
	static void showLibrary()
	{
		
		System.out.println("Library :"+libraryName+"\nISBN:"+ISBN);
	}
}
class eBook extends Book
{
	
	String filesize;
	String subtitle;
	
	
	
	eBook(String title,String author,String filesize)
	{
	super(title,author);
	super.display(filesize);
	//Modify ISBN
	//super.ISBN = "change";!!!Observed error : The final field Book.ISBN cannot be assigned
	}
	
	void getDescription()
	{
		
		 System.out.println("This is an Electronic book");
	}

	 void StringManipulation(String title,String subtitle)
	{
		this.title = title;
		this.subtitle = subtitle;
		System.out.println(this.title.toUpperCase());
		System.out.println(this.title.length());
		System.out.println(this.title.contains(this.subtitle));
		
	}



}
public class Assignment5_Q1_BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eBook obj = new eBook("Atomic Habits","James Clear","5MB");
		obj.getDescription();
		Book.libraryName="City Library";
		Book.showLibrary();
				
		//!!!!!!!NOTE!!!!!!!-The Book can be replaced by eBook as follows
		//eBook.libraryName="City Library";
		//eBook.showLibrary();
		//Both give the same output!!
		//Book.ISBN= "978-0-439-02348-1";//Error is observed when tried to change the final variable
	
		System.out.println("\nSTRING MANIPULATION");
		System.out.println("----------------------");
		
		obj.title ="Java Programming";
		obj.subtitle ="Java";
		obj.StringManipulation(obj.title,obj.subtitle);
	}

}
