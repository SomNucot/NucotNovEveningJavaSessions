package ExceptionHandlingConcept.com;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		System.out.println("Demo on excpections");
		try
		{
			System.out.println("In try block1");
			int i=10/0;
			System.out.println("In try block2");
			System.out.println("In try block3");
			System.out.println("In try block4");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			ae.printStackTrace();
			
			
		}
		
		System.out.println("Thanks");
		

	}

}
