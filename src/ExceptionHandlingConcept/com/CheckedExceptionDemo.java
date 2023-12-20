package ExceptionHandlingConcept.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to exception handling");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CE is coming");
		}
		
		
		
		System.out.println("File not found");
		
		try {
			FileInputStream obj=new FileInputStream("location");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		

	}

}
