package constructordemo.com;

public class ConstructorDemo2 {
	
	
	String name;
	int usn;
	int phoneNumber;
	String address;
	
	public void display()
	{
		System.out.println("this is display");
	}
	
	
	public ConstructorDemo2(String name) {
		this.name = name;
	}
	
	public ConstructorDemo2(String name, int usn) {
		
		this.name = name;
		this.usn = usn;
	}

	public ConstructorDemo2(String name, int usn, int phoneNumber) {
		this.name = name;
		this.usn = usn;
		this.phoneNumber = phoneNumber;
	}

	public ConstructorDemo2(String name, int usn, int phoneNumber, String address) {
		this.name = name;
		this.usn = usn;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public static void main(String[] args) {
		
		ConstructorDemo2 obj=new ConstructorDemo2("nucot");
		System.out.println(obj.name);
		
		ConstructorDemo2 obj1=new ConstructorDemo2("nucot",10);
		System.out.println(obj1.name+":"+ obj1.usn);
		
		ConstructorDemo2 obj3=new ConstructorDemo2("nucot",10,30);
		System.out.println(obj1.name+":"+ obj1.usn);
		
		
		
	}

	
	
	
}
