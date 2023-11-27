package ClassesandObjectDemo.com;

public class Employee {

	
	/*		syntax of class
	 * 
	 * 
	 * class is user define or blueprint or template
	 *		First character of the class name should be always upper case
	 * 		class class_name
	 * 		{
	 * 			variables
	 * 			methods
	 * 			constructors
	 * 
	 * 
	 * 		public static void main(String[] args)
	 * 		{
	 * 				
	 * 
	 * 
	 * 		}
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 		}
	 * 
	 * 
	 * 
	 
	 * 
	 */
	
	
	
		//class variable or global variables
		int a=10;
		int b=20;
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//object-object real world entity
		
	/*	Object is an instance of a class.
		Class is a blueprint or template from which objects are created. 
		Object is a real world entity such as pen, laptop, mobile, bed,
		keyboard, mouse, chair etc. Class is a group of similar objects.
	 */	
		//syntax to create object
		// Class_name obj_name=new Class_name();
		//example
		Employee obj=new Employee();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		
		
		//local variables
		int c=200;
		System.out.println(c);
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
