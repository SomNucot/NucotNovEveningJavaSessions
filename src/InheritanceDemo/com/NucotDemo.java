package InheritanceDemo.com;



 class Car1 {
	
	
	
	public void start()
	{
		System.out.println("Start---Car--->old");
	}
	
	public  void stop()
	{
		System.out.println("Stop-->Car");
	}
	
	public void petrol()
	{
		System.out.println("Petrol engine--Car");
	}
		

}



class Audi1 extends Car1 {
	
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

class BMW1 extends Car1 {
	
	
	@Override
	public void start()
	{
		System.out.println("Start-BMW");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Stop-BMW");
	}
	
	public void differentColorTypes()
	{
		System.out.println("Types of colors");
		
	}
	
	

}




public class NucotDemo {

	
	public static void main(String[] args) {
		System.out.println("<--------Parent Car-->");
		
		Car1 obj=new Car1();
		
		obj.start();
		obj.stop();
		obj.petrol();
		
		System.out.println("<--------Child Audi-->");
		
		Audi1 obj1=new Audi1();
		
		obj1.start();//inherited
		obj1.stop();//inherited
		obj1.petrol();////individual parent
		obj1.autoParking();
		
		
		System.out.println("<-------Child BMW------>");
		
		
		BMW1 obj2=new BMW1();
		obj2.start();//inherited
		obj2.stop();//inherited
		obj2.petrol();////individual method present in parent
		obj2.differentColorTypes();
		
		
		
		
		//Top casting/Up Casting
		
		//Creating the child class object by taking parent ref
		//child class object can be referred by parent class variable
		
			Car obj3=new Audi();
			
			obj3.start();
			obj3.stop();
			obj3.petrol();
			//obj3.autoParking();
			
			
			Car obj4=new BMW();
			
			obj4.start();
			obj4.stop();
			obj4.petrol();
			//obj4.differentColorTypes();
			
			
			//Down casting
			//parent class object can be referred by child class variable
			
			//Audi obj5=(Audi)new Car();//lang.ClassCastException:
			
	}

}
