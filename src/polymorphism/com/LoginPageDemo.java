package polymorphism.com;

public class LoginPageDemo {

	
	
	
	
	
	static void login()
	{
		System.out.println("Without user name and pwd");
	}
	
	static void login(String userName)
	{
		System.out.println("With user name");
	}
	
	static void login(String userName,String passWord)
	{
		System.out.println("with username and pwd");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("First way of execution to static method");
		login();
		
		login("Nucot");
		
		login("Nucot","Nucot9876");
		
		System.out.println("Second way of execution to static method");
		
		LoginPageDemo.login();
		
		LoginPageDemo.login("Nucot");
		
		LoginPageDemo.login("Nucot","Nucot9876");
		
		
		
		
	}

}
