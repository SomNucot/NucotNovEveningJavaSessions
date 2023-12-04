package ClassesandObjectDemo.com;

public class DemoClass {

	//1.no return type and no arguments(input)
	
	void add()
	{
		System.out.println("no return type and no arguments(input)");
		//local variables
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	
	
	//2--having return type and no arguments(no inputs)
	int add1()
	{
		System.out.println("having return type and no arguments(input)");
		//local variables
		int a=40;
		int b=30;
		int c=a+b;
		return c;
		
		
	}
	
	
	//3.No return type and with arguments(with input)
	
	
	void add11(int a,int b)
	{
		
		System.out.println("No return type and with arguments(with input)");
		//local variables
		int c=a+b;
		System.out.println(c);
		
		
	}
	
	
	//4.having return type and with arguments
	
	
	
	int add111(int a,int b)
	{
		System.out.println("having return type and with arguments");
		//local variables
		int c=a+b;
		return c;
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		DemoClass obj=new DemoClass();
		
		obj.add();
		
		int sum=obj.add1();
		System.out.println(sum);
		
		obj.add11(5, 9);
		
		
		int sum1=obj.add111(5, 5);
		System.out.println(sum1);
		
		
		

	}

}
