package abstractdemo.com;

public class LoginPage extends ApplicationPage{

	@Override
	public void titlePage() {
		
		System.out.println("Title of the page");
	}

	@Override
	public void currentUrlOfPage() {
		System.out.println("currentUrlOfPage");
		
	}

	@Override
	public void companyLogo() {
		System.out.println("companyLogo");
		
	}
	
	
	void show()
	{
		System.out.println("Show");
	}

}
