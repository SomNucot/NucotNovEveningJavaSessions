package ThisandSuperDemo.com;

public class ThisDemo {

	
	String name;
	int age;
	String address;
	
	//this
	//1.to initialize class variable with local variable
	//2.getter/setter-->encapsulation
	//3.constructor calling---Method calling
	//note
	//it should be the first statement in the constructor(calling)
	
	ThisDemo()
	{
		
		this("Modi",10);
		System.out.println("Default constructor");
	}
	
	ThisDemo(String na,int age)
	{
		
		System.out.println("2-Paramaeterzised constuctor");
		this.name=name;
		this.age=age;
		System.out.println(this.name+"--->"+this.age);
		
		
	}
	
	ThisDemo(String name,int age,String address)
	{
		this("Modi",10);
		System.out.println("3-Paramaeterzised constuctor");
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println(this.name+"--->"+this.age+"--->"+this.address);
		
	}
	
	
	
	
	
	void test1(String name,int age)
	{
		this.test2();
		this.name=name;
		this.age=age;
		System.out.println(this.name+"--->"+this.age);
		
	}
	
	void test2()
	{
		System.out.println("Welcome to india");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		ThisDemo obj1=new ThisDemo();
		
		ThisDemo obj2=new ThisDemo("Nucot",15);
		
		ThisDemo obj3=new ThisDemo("Nucot",15,"Bangalore");
		
		
		
		
		obj1.test1("NarendraModi", 20);
		

	}

}
