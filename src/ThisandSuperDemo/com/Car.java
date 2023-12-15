package ThisandSuperDemo.com;

public class Car {
	
	String name;
	int price;
	
	
	Car()
	{
		System.out.println("Car constructor");
	}
	
	

	Car(String name,int price)
	{
		System.out.println("Two parameter --->Car constructor");
		this.name=name;
		this.price=price;
		
		
	}
	

}
