package ExceptionHandlingConcept.com;

public class FinallyKeywordDemo {

	
	//final and finally
	//final is keyword
	//finally is block
	public static void main(String[] args) {
		
		
		System.out.println("Nucot");
		
		try
		{
			int a=5/0;
			//DB connection
		}
		/*catch(ArithmeticException ae)
		{
			System.out.println("catch block");
		}
		*/
		finally
		{
			System.out.println("I excute allways");
			//DB.close
		}
		
		
		

	}

}
