package InterfaceDemo.com;

public class TestingApplication {

	public static void main(String[] args) {
		
		
		ChromeDriver obj=new ChromeDriver();
		
		obj.getTitle();
		obj.findElement("nucot");
		obj.click("nucot");
		obj.get("https://www.nucot.com");
		obj.sendKeys("nucot", "nucot@gmail.com");
		obj.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
