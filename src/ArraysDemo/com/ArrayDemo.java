package ArraysDemo.com;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
//Arrays are used to store multiple values(similar data types) in a single variable, instead of declaring separate variables for each value.
/*
		Array in Java is a group of like-typed variables referred to by a common name. Arrays in Java work differently than they do in C/C++. Following are some important points about Java arrays. 

		In Java, all arrays are dynamically allocated. (discussed below)
		Arrays may be stored in contiguous memory [consecutive memory locations].
		Since arrays are objects in Java, we can find their length using the object property length. This is different from C/C++, where we find length using sizeof.
		A Java array variable can also be declared like other variables with [] after the data type.
		The variables in the array are ordered, and each has an index beginning with 0.
		Java array can also be used as a static field, a local variable, or a method parameter.
		The size of an array must be specified by int or short value and not long.
		The direct superclass of an array type is Object.
		Every array type implements the interfaces Cloneable and java.io.Serializable. 
		This storage of arrays helps us randomly access the elements of an array [Support Random Access].
		The size of the array cannot be altered(once initialized).  However, an array reference can be made to point to another array.
*/
		
		
		//single D array(one D array(1D array))
		//syntax
		//declarations of 1 D array(One-Dimensional Arrays:)
		
		/*
		 * 
		 * 1. with new keyword
		 * 
		 * data_type array_name[]=new data_type[size];
		 * 
		 * 
		 * 
		 */
		
		//declarations of array
		int a[]=new int[5];
		
		//init the array
		
		a[0]=1;
		a[1]=11;
		a[2]=111;
		a[3]=1111;
		a[4]=11111;
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		System.out.println(a.length);
		//System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		System.out.println("Thanks");
		int len=a.length;
		System.out.println(len);

		int higerIndex=len-1;
		System.out.println(higerIndex);
		
		//How to print the array values
		
		for(int i=0;i<a.length;i++) 
		{
			
			System.out.println(a[i]);//1 11 111 1111 11111
			
			
		}
		
		//without using for loop
		
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
		
		
		System.out.println("******String data type");
		
		
		String s[]=new String[5];
		
		s[0]="ChromeBrowser";
		s[1]="IEBrowser";
		s[2]="SafariBrowser";
		s[3]="FirefoxBrowser";
		s[4]="EdgeBrowser";
		
		System.out.println(s[2]);
		
		System.out.println(s[3]);
		
		System.out.println(s[1]);
		
		//System.out.println(s[5]);
		System.out.println(s.length);
		
		//How to print the array values using loop
		
				for(int i=0;i<s.length;i++) 
				{
					
					System.out.println(s[i]);
					
					
				}
		
		//without using for loop
				
				System.out.println(s);
				System.out.println(Arrays.toString(s));
				
				
			String nn="nucot";
			nn.length();
			
			
			
				
				
				
				
				
		
		
		
		
	}

}
