package WeekendAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	
private int id;
private String productName;
private int price;

public Product(int id, String productName, int price) 
{
	
	this.id = id;
	this.productName = productName;
	this.price = price;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Product id :" + id + ", productName :" + productName + ", price :" + price ;
}


}
public class Assignment9_PART_D_StoreExpensiveProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product obj1 = new Product(1124,"Prod1",5659);
Product obj2 = new Product(1352,"Prod2",4000);
Product obj3 = new Product(1052,"Prod3",999);
Product obj4 = new Product(1093,"Prod3",250);

List<Product>list = new ArrayList<>();
list.add(obj1);
list.add(obj2);
list.add(obj3);
list.add(obj4);
System.out.println("Original Product List:");
list.stream()		
			.forEach(System.out::println);

List<Product>listnew =
 list.stream()
			.filter((p)->p.getPrice()>1000)
			.collect(Collectors.toList());

System.out.println("Updated Product List with price>1000:");
	
 listnew.stream()	
 		
			.forEach(System.out::println);

			



	
	}

}
