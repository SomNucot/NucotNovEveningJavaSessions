package ExceptionHandlingConcept.com;

public class ThrowKeywordDemo {

	
	
	
	
	public static void main(String[] args) {
		
		try
		{
			throw new Exception("A user is not found in Nucot");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("***************************");
		
		String data=null;
		if(data==null)
		{
			try
			{
				throw new Exception("User Data is not found in Nucot");
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		
		
		

	}

}
