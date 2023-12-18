package ExceptionHandlingConcept.com;

public class TryCatchDemo5 {
		
	
		int a;
		
		public static void main(String[] args) {
			
			System.out.println("Demo on excpections");
			
			TryCatchDemo4 obj=new TryCatchDemo4();
			
			obj=null;
			try
			{
				int ii=6/0;
				//obj.a=20;//NPE-->NullPointerException
				
			}
		
			catch(NullPointerException np)
			{
				System.out.println("NP is coming");
				
			}
			catch(ArithmeticException  ae)
			{
				System.out.println("AE is coming");
				
			}
			catch(Exception e)
			{
				System.out.println("E is coming");
			}
			
			System.out.println("Thanks");
			
			

		}
		
	

}
