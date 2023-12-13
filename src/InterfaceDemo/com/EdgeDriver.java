package InterfaceDemo.com;

public class EdgeDriver implements WebDriver{

	public String getTitle()
	{
		
		return "nucot";
	}

	@Override
	public void get(String url) {
		
		System.out.println("Enter the url "+ url);
	}

	@Override
	public void click(String element) {
		
		System.out.println("Click on  "+ element);
	}

	@Override
	public void sendKeys(String element, String value) {
		
		System.out.println("enter the value in to the input text "+ element+"The value is "+value);
		
	}

	@Override
	public void findElement(String element) {
		System.out.println("Go the element "+ element);
		
	}

	@Override
	public void close() {
	
		System.out.println("close the app");
	}

	
	
	
	
	

}
