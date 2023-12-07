package InheritanceDemo.com;

public class TestingCar {

	public static void main(String[] args) {
		
		System.out.println("<--------Parent Car-->");
		
		Car obj=new Car();
		
		obj.start();
		obj.stop();
		obj.petrol();
		
	System.out.println("<--------Child Audi-->");
		
		Audi obj1=new Audi();
		
		obj1.start();//inherited
		obj1.stop();//inherited
		obj1.petrol();////individual parent
		obj1.autoParking();
		
		
		System.out.println("<-------Child BMW------>");
		
		
		BMW obj2=new BMW();
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
			
			Audi obj5=(Audi)new Car();//classcastexception
			
			
			
		
		
		
		
	}

}
