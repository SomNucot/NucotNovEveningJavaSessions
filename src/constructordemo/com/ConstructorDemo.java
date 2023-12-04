package constructordemo.com;

public class ConstructorDemo {

	
	//Constructors are used to initialize the objects
	
		//syntax
		
	/*	class_name()
		{
			
		}
	*/	

	//1.Constructors are used to init the objects
	//2.When user create object Constructor will called automatically
	//3.Constructor is similar to the method
	//4.Always Constructor name should be similar(same) to class name
	//5.it does not have return type/void
	//6.We have types of Constructors-->
	//1.one parameter constructor
	//2.two parameter constructor ..etc
	
	
	
	String name;
	int age;
	float salary;
	String address;
	int usn;
	
	
	void test()
	{
		System.out.println("test");
	}
	
	ConstructorDemo()
	{
		
	}
	
	
	 
	 ConstructorDemo(String name,int age,float salary,String address,int usn)
	 {
		 System.out.println("this  constructor is used init variables");
		 
			 this.name=name;
			 this.age=age;
			 this.salary=salary;
			 this.address=address;
			 this.usn=usn;
			 
		 
		 	System.out.println(this.name);
			System.out.println(this.age);
			System.out.println(this.salary);
			System.out.println(this.usn);
			System.out.println(this.address);
		  

	 }
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		ConstructorDemo obj =new ConstructorDemo();
		
		
		
		obj.name="nucot";
		obj.age=25;
		obj.salary=12000.0f;
		obj.usn=123;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary=12000.0f);
		System.out.println(obj.usn);
		obj.test();
		
		
		ConstructorDemo obj1 =new ConstructorDemo("nucot",25,1200.0f,"Bangalore",123);
		

	}

}
