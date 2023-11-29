package ClassesandObjectDemo.com;

public class DemoOnMethods {

	
	//no return, no input
	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	
	}
	
	//no input,but some return type
	int sub()
	{
		int a=30;
		int b=20;
		int sub=a-b;
		return sub;
		
	}
	
	
	//no return type, but some input
	
	
	void mul(int a,int b)
	{
	
		int c=a*b;
		System.out.println(c);
		
	}
	
	//return type,some input
	
	
	int div(int a,int b)
	{
	
		int d=a/b;
		return d;
		
	}
	
	public static void main(String[] args) {
		
		DemoOnMethods obj=new DemoOnMethods();
		obj.add();
		
		int sub1=obj.sub();
		System.out.println(sub1);
		

		obj.mul(9, 9);
	
		
		int div1=obj.div(10, 2);
		System.out.println(div1);
	

	}

}
