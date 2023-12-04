package Polymorphism.com;

public class Methodchangingdemo {
	
	
	
	void demo1()
	{
		System.out.println("Heartly");
		demo2();
	}
	void demo2()
	{
		System.out.println("welcome");
		demo3();
	}
	void demo3()
	{
		System.out.println("to");
		demo4();
	}
	void demo4()
	{
		System.out.println("Nucot");
	}
	

	public static void main(String[] args) {
		
		Methodchangingdemo obj=new Methodchangingdemo();
		obj.demo1();

	}

}
