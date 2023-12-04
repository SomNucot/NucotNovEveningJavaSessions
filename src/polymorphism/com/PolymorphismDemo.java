package polymorphism.com;

public class PolymorphismDemo {

	//Poly(Many)morphism(forms)-->single thing appears in many forms

	//two types of Polymorphism
	//a)Compile time(static )---->example is Method overloading
		//which method to be called will be decided by complier based on the basis of given value
		//Method overloading will happen in a single class-->if contains multiple methods with same name but different number of arguments

	//b)Run time--->example is Method overriding
	
	//Complie time(static) -Method overloding
	//1.It will happen in the same class,when we have multiple methods
	//2.if you have different methods(multiple methods) in class-Always methods name should be same-->
	//3.it should have different no of parameters/arguments
	//4.The sequence of the parameters should be also different
	
	
	PolymorphismDemo()
	{
		System.out.println("this is constructor");
	}
	
	
	
	
	
	
	
	
	//Method Overloading
	void add()
	{
		System.out.println("No argument");
	
		
		
	}
	
	void add(int a)
	{
		System.out.println("Single argument");
		
		
	}
	
	
	void add(int a,int b)
	{
		System.out.println("Double  argument");
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Three argument");
		
		int sum=a+b+c;
		System.out.println(sum);
		
		
		
	}
	
	
	void add(int a,int b,int c,int d)
	{
		System.out.println("four  argument");
		int sum=a+b+c+d;
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
	
		PolymorphismDemo obj=new PolymorphismDemo();
		obj.add();
		obj.add(10);
		obj.add(10,20,30,40);
		obj.add(10,20);
		obj.add(10,20,30);
		obj.add(10,20,30,40);
	
		

	}

}
