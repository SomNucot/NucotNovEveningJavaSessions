package JavaSessions.com;

public class ConditionalStaementDemo {

	public static void main(String[] args) {
		
		//if statement
		//if else statement
		//nested if else statement
		//switch statement
		
	
		int i=10;
		int j=20;
		System.out.println(i==j);
		
		//if statement
		/*
		 * syntax
		 * 
		 * if(condition)
		 * {
		 * 		body//statements
		 * 	
		 * }
		 * System.out.println("Thanks");
		 * 
		 */
		
		int ii=5;
		int jj=5;
		if(ii==jj)
		{
			System.out.println("Both are equal");
		}
		System.out.println("Bye");
		
		
		
		if(true)
		{
			System.out.println("Welcome  to nucot");
		}
		
		//two way selection
		//if else statement
		
		/*
		 * 
		 * if(condition)
		 * {
		 * 			body//statements
		 * 
		 * }
		 * else
		 * {
		 * 			body//statements
		 * 
		 * }
		 * 
		 * 
		 */
		
	
		int p=12;
		int q=5;
		
		if(p>q)
		{
			System.out.println("P is greater");
		}
		else
		{
			System.out.println("Q is greater");
			
		}
		
		
		
		//nested if
		
		System.out.println("*****Nested if satement**********");
		
		
		int num=100;
		
		if(num<=100)
		{
			System.out.println("marks with grade");
			
			if(num>=95)
			{
				System.out.println("The grade is below");
				
				if(num==100)
				{
					System.out.println("Excellent grade");
				}
				
				
				
			}
			
			
		}
		
		
		System.out.println("Excellent grade");
		
		
		//Nested if else statement
		
		String browser="chrome";
		
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
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
