package ClassesandObjectDemo.com;

public class SearchProduct {

	
	public void login()
	{
		
		String userName="abc";
		String passWord="abc123";
		System.out.println("The user name is -->"+userName);
		System.out.println("Password for the userName is -->"+passWord);
	}
	

	
	public  String getProduct(String productName)
	{
		
		System.out.println("Getting the product from the list---->"+ productName);
		
		String name="";
		
		if(productName.equals("15 Pro max"))
		{
			
			System.out.println("15 Pro max is avilable");	
			
		}
		else if(productName.equals("14 Pro max"))
		{
			System.out.println("14 Pro max is avilable");
		}
		
		else if(productName.equals("13 Pro max"))
		{
			System.out.println("13 Pro max is avilable");
		}
		
		else if(productName.equals("12 Pro max"))
		{
			System.out.println("12 Pro max is avilable");
			
		}
		else
		{
			System.out.println("Please enter valid product name...." + productName);
		}
		
		
		return productName;
		
	}
	

	
	public static void main(String[] args) {
		SearchProduct obj =new SearchProduct();
		obj.login();
		String result=obj.getProduct("13 Pro max");
		System.out.println(result);

	}

}
