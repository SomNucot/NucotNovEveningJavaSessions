package FinalDemo.com;

class GGG
{
	//final method -->method cannot be overridden by the child class
	
	final void test()
	{
		System.out.println("Test in parent");
	}
	
	void show()
	{
		System.out.println("show in parent");
	}
	
	
}

class HHH extends GGG
{
	
	
	@Override
	void show()
	{
		System.out.println("show in parent");
	}
	
	
	
}
















public class FinalMethodDemo {
	
	
	
	
	public static void main(String[] args) {
		
		
		

	}

}
