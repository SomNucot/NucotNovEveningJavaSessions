package InheritanceDemo.com;

public class Audi extends Car {
	
	//Method overriding-RP
	//Method overriding will happen two different(between two class(parent --child)) class
	//When you have a method present in parent class and same method in child class
	//with method same name
	//with same number of parameters
	//with same sequence of parameters
	//with return type should also same
	
	
	@Override
	public void start()
	{
		System.out.println("Start--->New");
	}
	
	@Override
	public  void stop()
	{
		System.out.println("Stop");
	}
	
	//individual
	public void autoParking()
	{
		System.out.println("Auto parking");
	}
	
	
	
	
	
	
	

}
