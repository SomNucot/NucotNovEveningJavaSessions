package InterfaceDemo.com;

public class FirefoxDriver implements WebDriver{

	public String getTitle()
	{
		
		return "nucot-->FirefoxDriver";
	}

	@Override
	public void get(String url) {
		
		System.out.println("FirefoxDriver-->Enter the url "+ url);
	}

	@Override
	public void click(String element) {
		
		System.out.println("FirefoxDriver-->Click on  "+ element);
	}

	@Override
	public void sendKeys(String element, String value) {
		
		System.out.println("FirefoxDriver-->enter the value in to the input text "+ element+"The value is "+value);
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("FirefoxDriver-->Go the element "+ element);
		
	}

	@Override
	public void close() {
	
		System.out.println("FirefoxDriver-->close the app");
	}

	
	
	
	
}
