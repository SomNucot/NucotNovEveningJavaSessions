package ExceptionHandlingConcept.com;

public class ThrowsDemo {

	//Throws and Throw
	//The throws keyword indicates what exception type may be thrown by a method.
	//throws is used to pass the excpetion 
	public void test1()
	{
		System.out.println("Test1");
		test2();
	}
	
	public void test2()
	{
		System.out.println("Test2");
		try
		{
			test3();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
		}
	}
	
	
	public void test3() throws ArithmeticException
	{
		System.out.println("Test3");
		test4();
	}
	
	
	public void test4() throws ArithmeticException
	{
		System.out.println("Test4");
		int i=10/0;
	}
	
	
	public static void main(String[] args) {
		
		
		ThrowsDemo obj=new ThrowsDemo();
		
		obj.test1();
		
		

	}

}
