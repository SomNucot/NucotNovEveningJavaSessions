package ExceptionHandlingConcept.com;

public class TryCatchDemo4 {

	int a;
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Demo on excpections");
		
		TryCatchDemo4 obj=new TryCatchDemo4();
		
		obj=null;
		try
		{
			obj.a=20;//NPE-->NullPointerException
			
		}
		catch(NullPointerException np)
		{
			System.out.println("NP is coming");
			
		}
		
		try
		{
			int i=10/0;
		}
		catch(ArithmeticException  ae)
		{
			System.out.println("AE is coming");
			
		}
		
		System.out.println("Thanks");
		
		

	}

}
