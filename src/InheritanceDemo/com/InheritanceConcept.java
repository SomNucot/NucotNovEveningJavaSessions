package InheritanceDemo.com;


class AA
{
		
	void test()
	{
		System.out.println("*******Parent Class**************");
		System.out.println("test");
	}
	
	
	void show()
	{
		System.out.println("show");
	}
	
	
}

//creating the child class from the parent
/*
 * syntax
 * 
 * class child_class_name extends parent_class_Name
 * {
 * 			body
 * 
 * }
 * 
 * 
 * 
 */



class BB extends AA
{
	
	@Override
	void test()
	{
		System.out.println("*******Child Class**********");
		System.out.println("test");
		System.out.println("test2");
	
	}
	
	
	void display()
	{
		System.out.println("display");
	}
	
	
}


public class InheritanceConcept {

	public static void main(String[] args) {
		
		AA obj =new AA();
		obj.test();	
		obj.show();
		//obj.display();//child class
		
		
		
		
		System.out.println("****Child execution point********");
		
		BB obj1=new BB();
		obj1.test();//child class method will be exc-->inherited
		obj1.show();//parent class method
		obj1.display();//indiv
		
		
		
		
		
		
		
		
		

	}

}
