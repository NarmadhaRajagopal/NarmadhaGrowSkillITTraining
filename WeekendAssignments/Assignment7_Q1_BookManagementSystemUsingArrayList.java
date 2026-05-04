package WeekendAssignments;
import java.util.*;
class BookA implements Comparable<BookA>

{
	private int bookId;
	private String bookName;
	private int price;
	BookA(int bookId,String bookName,int price)
	{
	
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		
		
	}
	//Getter Setter Section
	public void setBookId(int bookId)
	{   if(bookId>0)
		{
		this.bookId = bookId;
		}
		
	}
	public int getBookId()
	{
		return this.bookId;
		
	}
	public void setBookName(String bookName)
	{
		if(!bookName.equals("")&&!bookName.equals(" "))
		{
		this.bookName = bookName;
		}
		
	}
	public String getBookName()
	{
		return this.bookName;
	}
	public void setPrice(int price)
	{
		if(price>0)
		{
		this.price = price;
		}
		}
	public int getPrice()
	{
		return this.price;
	}
	
	public int compareTo(BookA obj)
	{
		return this.price-obj.price;
	}
}
public class Assignment7_Q1_BookManagementSystemUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<BookA>listBook = new ArrayList<>();
		BookA obj1 = new BookA(101,"Java",499);
		BookA obj2 = new BookA(102,"Python",399);
		BookA obj3 = new BookA(103,"SQL",299);
		BookA obj4 = new BookA(104,"C++",599);
		listBook.add(obj1);
		listBook.add(obj2);
		listBook.add(obj3);
		listBook.add(obj4);
	
		
		System.out.println("Original List:");
		for(BookA obj:listBook)
		{
			
			System.out.println(obj.getBookId()+"\s"+obj.getBookName()+"\s"+obj.getPrice());
			
		}
		
		//Sorting based on Price in ascending order
		Collections.sort(listBook);		
		System.out.println("\nSort Books based on Price(ascending):");
		for(BookA obj:listBook)
		{
			
			System.out.println(obj.getBookId()+"\s"+obj.getBookName()+"\s"+obj.getPrice());
			
		}
		//To remove/update a book with the given Book Id/Book Name
		int index2remove=0,index2update = 0;
		
		for(BookA obj:listBook)
		{
			
			if(obj.getBookId() == 102)
			{
				index2remove = listBook.indexOf(obj);
			}
			
			
			
		}
		listBook.remove(index2remove);//we can also use iterator
		
		System.out.println("\nAfter removing Book with id 102:");
		for(BookA obj:listBook)
		{
			
			System.out.println(obj.getBookId()+"\s"+obj.getBookName()+"\s"+obj.getPrice());
			
		}
		//updating the price of the Book using for Loop
		System.out.println("\nAfter updating price of the Book with name \"SQL \":");
		int bookFound = 0;String bookName = "";
		for(BookA obj:listBook)
		{
			if(obj.getBookName().equals("SQL"))
			{
				obj.setPrice(349); // for updating the price
				index2update =listBook.indexOf(obj);
				
			}
			System.out.println(obj.getBookId()+"\s"+obj.getBookName()+"\s"+obj.getPrice());
			if(obj.getBookName().equalsIgnoreCase("JAVA"))
			{
				
				bookFound =1;
				bookName =obj.getBookName();
				
			}
		}
		//listBook.get(index2update).setPrice(349);//index is used to update the field in the object
		
		if(bookFound==1)
		System.out.println("Book Found :"+bookName);
		
		System.out.println("\nFinal List:");
		for(BookA obj:listBook)
		{
			
			System.out.println(obj.getBookId()+"\s"+obj.getBookName()+"\s"+obj.getPrice());
			
		}
		
		
		
	}

}
