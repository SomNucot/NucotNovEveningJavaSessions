package staticdemo.com;

public  class StaticClassDemo {

	//class can be mad static only if it is having nested class
	
	
	static class BB
	{
		 
		void show()
		{
			System.out.println("Show method");
		}
		
		
		
		static void show1()
		{
			System.out.println("Show1 method");
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		StaticClassDemo.BB obj=new StaticClassDemo.BB();
	
		obj.show();
		obj.show1();
		
		 //BB.show1();

	}

}
