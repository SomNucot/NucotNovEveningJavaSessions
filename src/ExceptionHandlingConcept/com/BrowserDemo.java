package ExceptionHandlingConcept.com;

public class BrowserDemo {

	
	public static void launchBrowser()
	{
		String browser="c";
		
		if(browser.equals("chrome"))
		{
			
			System.out.println("Launch the chrome browser");
			
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch the firefox browser");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("Launch the ie browser");
		}
		
		else if(browser.equals("safari"))
		{
			System.out.println("Launch the safari browser");
		}
		else
		{
			System.out.println("Pass the vaild browser name");


			throw new MyException("Microsoft Browser Not foundException");
	


		}
		
		
		
	
		
	}
	
	

	
	public static void main(String[] args) {
		
		launchBrowser();

	}

}
