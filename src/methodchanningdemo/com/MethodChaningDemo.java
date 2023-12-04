package methodchanningdemo.com;

public class MethodChaningDemo {

	
	
	void test1()
	{
		System.out.println("test1");
		test2();
		
	}
	
	void test2()
	{
		System.out.println("test2");
		test3();
		
		
	}
	
	void test3()
	{
		System.out.println("test3");
		test4();
	}
	
	void test4()
	{
		System.out.println("test4");
		
	}
	
	
	
	public static void main(String[] args) {
		
		MethodChaningDemo obj=new MethodChaningDemo();
		obj.test1();
		
		
		
		

	}

}
