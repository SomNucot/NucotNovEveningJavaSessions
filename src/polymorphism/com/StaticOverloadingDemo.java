package polymorphism.com;

public class StaticOverloadingDemo {

	
	
	
	
	public static void main() {
		
		System.out.println("No arguments");

	}
	
	public static void main(String args,int a) {
		System.out.println("Two arguments-->string and integer");
		
	}
	public static void main(String args,char c) {
		
		System.out.println("Two arguments-->String and character");
	}
	

	public static void main(String[] args) {
		
		
		main();
		main("nucot",10);
		main("nucot",'a');
		
		

	}
	
	
	
	
	
	
	

}
