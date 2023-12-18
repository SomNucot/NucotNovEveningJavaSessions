package ExceptionHandlingConcept.com;

public class TryCatchDemo3 {

	
	
	
	public static int div(int a,int b)
	{
		
		int result=-1;
		
		try
		{
			 result=a/b;//AE because of b=0
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming because of b=0");
			//ae.printStackTrace();
			
		}
		
		
		
		
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int d=div(10,0);
		System.out.println(d);
		
		

	}

}
