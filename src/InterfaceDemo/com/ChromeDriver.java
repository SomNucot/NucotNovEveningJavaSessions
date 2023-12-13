package InterfaceDemo.com;

public class ChromeDriver implements WebDriver{
	
	
	
	public String getTitle()
	{
		
		return "nucot in chrome";
	}

	@Override
	public void get(String url) {
		
		System.out.println("chrome-->Enter the url "+ url);
	}

	@Override
	public void click(String element) {
		
		System.out.println("chrome-->Click on  "+ element);
	}

	@Override
	public void sendKeys(String element, String value) {
		
		System.out.println("chrome-->enter the value in to the input text "+ element+"The value is "+value);
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("chrome-->Go the element "+ element);
		
	}

	@Override
	public void close() {
	
		System.out.println("chrome-->close the app");
	}

	
	
	
	
	
	
	
	
	
}
