package staticdemo.com;

public class A {

	//Static--> keyword -->Memory management
	//static---->
	//1.Blocks
	//2.Static methods
	//3.Variables
	//4.Classes
	
	int a=10;
	
	static int c=20;
	
	
	//static method 
	public static void show()
	{
		int b=30;
		System.out.println("This is show method with static");
		System.out.println(b);
		//System.out.println(a);
		System.out.println(c);
	}
	
	//static method 
		public  void show1()
		{
			System.out.println("This is show1 method non static ");
			
		}
	
	
	
	 public static  void main(String[] args) {
		
		 	
		 //1.First way to execute to the static method
		 //directly call the method my giving method name
		 show();
		 
		//2.Second way to execute to the static method
		 //Class_name.method_name();
		 
		 A.show();
		 
		 
		 
		 A obj=new A();
		 obj.show1();
		 
		 System.out.println(obj.a);
		 
		 //1.First way to execute to the static method
		 //directly call the variable my giving variable name
		 System.out.println(c);
		 
		//2.Second way to execute to the static variable
		 //Class_name.variable_name();
		 System.out.println(A.c);
		 		
		 
		 
	}

}
