package constructordemo.com;

public class AAA {

	
	AAA()
	{
		System.out.println("Default constructor");
	}
	
	AAA(int a)
	{
		a=10;
		System.out.println("one para constructor"+a);
	}
	
	
	AAA(int a,int b)
	{
		a=20;
		b=30;
		System.out.println("two para constructor");
		System.out.println("Tha value of a is-->"+a +"The value of b is-->"+b);
	}
	
	
	AAA(int a,int b,int c)
	{
		System.out.println("three para constructor");
		a=20;
		b=30;
		System.out.println("two para constructor");
		System.out.println("Tha value of a is-->"+a +"The value of b is-->"+b+"The value of c is-->"+c);
	}
	
	
	
	public static void main(String[] args) {
		
		AAA obj1=new AAA();
		AAA obj2=new AAA(10);
		AAA obj3=new AAA(10,20);
		AAA obj4=new AAA(10,20,30);
		
		
		
		

	}

}
