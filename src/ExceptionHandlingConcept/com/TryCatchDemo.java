package ExceptionHandlingConcept.com;

public class TryCatchDemo {
	/*
	 * syntax of try and catch
	 * try
		{
			body
		}
		catch(Exception e)
		{
			
			
		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	

	public static void main(String[] args) {
		
		
		System.out.println("Demo on excpections");
		try
		{
			int i=10/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			ae.printStackTrace();
			
			
		}
		
		System.out.println("Thanks");
		
		
		
		
		

	}

}
