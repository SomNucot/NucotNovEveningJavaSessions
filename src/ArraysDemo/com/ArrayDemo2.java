package ArraysDemo.com;

import java.util.Arrays;

public class ArrayDemo2 {

	//Limitations of array
	//1.Size is fixed--->Dynamic array-->Collections
	//2.Similar type of data--->We use Object array 
	
	
	public static void main(String[] args) {
		
		//single D array(one D array(1D array))
				//syntax
				//declarations of 1 D array(One-Dimensional Arrays:)
				
				/*
				 * 
				 * 1. without new keyword
				 * 
				 *	Array literals
				 *
				 *	syntax
				 *
				 *declarations
				 *data_type array_Name[];
				 *
				 *init syntax
				 *
				 *data_type array_Name[]={val1,val2,va.2.........valn};
				 * 
				 * 
				 * 
				 */
		
		//declarations of array
		//int a[];
		//init array
		int a[]= {1,22,3,4,5};//35
		
		System.out.println(a.length);
		
		//How to print the array values
		
				for(int i=0;i<a.length;i++) 
				{
					
					System.out.println(a[i]);
					
					
				}
				
				
				int sum=a[0]+a[1];
				System.out.println("Sum of first two numbers is -->"+sum);
		
				//without using for loop
				
				System.out.println(a);
				System.out.println(Arrays.toString(a));
				
		char c[]= {'a','e','i','o','u'};
		
		System.out.println(c.length);
		
		//How to print the array values
		
				for(int i=0;i<c.length;i++) 
				{
					
					System.out.println(c[i]);
					
					
				}
		
		//static array examples
		int month[]=new int[12];
		int days[]=new int[12];
		
		int sum1=0;
		//To print sum of all the numbers
		for(int i=0;i<a.length;i++) 
		{
			
			sum1=sum1+a[i];
			
			System.out.println(sum1);
			
			
		}
		
		
		
		
		
				
		
		
		

	}

}
