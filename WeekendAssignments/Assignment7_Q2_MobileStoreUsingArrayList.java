package WeekendAssignments;
import java.util.*;
class Mobile implements Comparable<Mobile>

{
	private String brand;
	private String model;
	private int price;
	Mobile(String brand,String model,int price)
	{
		
		this.brand = brand;
		this.model = model;
		this.price=price;
		
		
	}
	public void setBrand(String brand)
	{   if(!brand.isEmpty())
		{
		this.brand = brand;
		}
		
	}
	public String getBrand()
	{
		return this.brand;
		
	}
	
	public void setModel(String model)
	{   if(!model.isEmpty())
		{
		this.model = model;
		}
		
	}
	public String getModel()
	{
		return this.model;
		
	}
	public void setPrice(int price)
	{
		 if(price>0)
		 {this.price = price;
		
		 }
		
	}
	public int getPrice()
	{
		return this.price;
	}
	public int compareTo(Mobile obj)
	{
		return obj.price-this.price;
	}
	
}


public class Assignment7_Q2_MobileStoreUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mobile>listMob = new ArrayList<>();
listMob.add(new Mobile("Samsung","S23",70000));
listMob.add(new Mobile("Apple","iPhone15",80000));
listMob.add(new Mobile("OnePlus","12",60000));
listMob.add(new Mobile("Vivo","V30",35000));
listMob.add(new Mobile("Realme","GT",30000));
System.out.println("Original List:");
for(Mobile mobile:listMob)
{
	System.out.println(mobile.getBrand()+" "+mobile.getModel()+" "+mobile.getPrice());
}

Collections.sort(listMob);
System.out.println("\nAfter sorting based on Price:");
for(Mobile mobile:listMob)
{
	System.out.println(mobile.getBrand()+" "+mobile.getModel()+" "+mobile.getPrice());
}
ListIterator<Mobile>it = listMob.listIterator();
//Highest price
listMob.remove(0);

System.out.println("\nAfter removing most expensive Mobile:");
for(Mobile mobile:listMob)
{
	System.out.println(mobile.getBrand()+" "+mobile.getModel()+" "+mobile.getPrice());
}

int found =0;String BrandFound = "";
for(Mobile mobile:listMob)
{ 
	if(mobile.getBrand().equalsIgnoreCase("VIVO"))
	{
		found = 1;
		BrandFound = mobile.getBrand();
		break;
	}

	
}
if(found == 1)
{
	System.out.println("\nBrand Found : " +BrandFound);
}
//for updating the price
for(Mobile mobile:listMob) 
{
	if(mobile.getBrand().equalsIgnoreCase("SAMSUNG"))
	{
		
		mobile.setPrice(68000);
		break;
	}
}

System.out.println("\nAfter updating the price:");
for(Mobile mobile:listMob)
{
	System.out.println(mobile.getBrand()+" "+mobile.getModel()+" "+mobile.getPrice());
}

	}

}
