package InterfaceDemo.com;

public interface WebDriver {
	
	
	
	
	public static void show()
	{
		System.out.println("static method");
		
	}

	public String getTitle();
	
	public void get(String url);
	
	public void click(String element);
	
	public void sendKeys(String element,String value);
	
	public void findElement(String element);
	
	public void close();
	
	
	

}
