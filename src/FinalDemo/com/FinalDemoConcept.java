package FinalDemo.com;

public class FinalDemoConcept {

	
	//Final is keyword in java
	//Final can be used for variables
	//final can be used for methods
	//Final can be used for classes
	
	
	//final variable value cannot be reinitialized with another value
		final int b=30;
		//area of the circle is Pi*R*R
		final String companyName="Nucot";
	
		int a=10;
			
	
	
		 public void show()
		{
			System.out.println("Show");
		}
	
		public static void show1()
		{
			System.out.println("Static Show");
		}
		
		
	
		
		
		
		
	
	
	public static void main(String[] args) {
		
		FinalDemoConcept obj=new FinalDemoConcept();
		
		System.out.println(obj.a);
		
		obj.show();
		//first way
		show1();
		
		//second way
		FinalDemoConcept.show1();
		
		
		
		System.out.println(obj.b);
		
		
		
	}

}
