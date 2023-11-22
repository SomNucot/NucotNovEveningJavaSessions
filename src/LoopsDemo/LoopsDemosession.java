package LoopsDemo;

public class LoopsDemosession {

	public static void main(String[] args) {
		
		//1-10
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		//1-100
		/*
		 * syntax
		 * 
		 * while(condition)
		 * {
		 * 		body/statements
		 * 
		 * }
		 *minimum number of times while will execute -->0
		 * 
		 * 
		 * 
		 * 
		 */
		System.out.println("Number from 1 to 10000");
		int i=1;
		while(i<=10000)
		{
			System.out.println(i);//123456789---last num
			i++;//-->i+1
		}
		
		System.out.println("Even number");
		
		int ii=2;
		while(ii<=100)
		{
			System.out.println(ii);//123456789---last num
			ii=ii+2;//-->i+1
		}
		
		System.out.println("odd number");
		
		int iii=1;
		while(iii<=100)
		{
			System.out.println(iii);//123456789---last num
			iii=iii+2;//-->i+1
		}
		
	
		//infinite while
		
		int a=1;
		while(true)
		{
			System.out.println("Welcome to Bangalore");
			if(a==5)
			{
				break;
			}
			a++;
			
		}
		
		
		
	System.out.println("****************do while Loop*********************");
	
	/*
	 * syntax--do while
	 * 
	 * 
	 * do
	 * {
	 * 			body/statements
	 * 
	 * }
	 * while(condition);
	 * 
	 * 
	 * minimum number of times while will execute -->1
	 * 
	 * 
	 * 
	 * 
	 */
		
	System.out.println("Number from 1 to 100 using do while");
	int d=1;
	do
	{
		
			System.out.println(d);//1234
			d++;//-->d+1-->2 3 4 5
		
		
	}
	while(d<=100);
	
	
	
	System.out.println("Even number using do while");
	
	int dd=2;
	do
	{
		
			System.out.println(dd);//2 4 6 8----last number
			dd=dd+2;//-->dd+2
		
	}
	while(dd<=100);
	
	
	
	
	System.out.println("odd number using do while");
	
	int ddd=1;
	do
	{
		
			System.out.println(ddd);//1 3 5 7 9---->last
			ddd=ddd+2;//-->ddd+2
		
	}
	while(ddd<=100);
	
	
		//for loop
	
	/*
	 * 
	 * for(initialize;condition;updation(increment/decrement))
	 * {
	 * 
	 * 			body/statements
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		
		System.out.println("Numbers from 1 to 100 using for loop");
		for(int j=1;j<=100;j++)
		{
			
			System.out.println(j);
			
		}
		
		
		System.out.println("Even number using for loop");
		
		for(int jj=2;jj<=100;jj=jj+2)
		{
			System.out.println(jj);
			
		}
		
	
		System.out.println("odd number using for loop");
		for(int jjj=1;jjj<=100;jjj=jjj+2)
		{
			System.out.println(jjj);
			
		}
		
		
		
		
		//infinite for loop
		
		for(;;)
		{
			System.out.println("Welcome to Nucot");
			break;
			
		}
		
		
		
		System.out.println("odd number using for loop");
		int jjjj=1;
		for(;jjjj<=100;jjjj=jjjj+2)
		{
			System.out.println(jjjj);
			
		}
		
		System.out.println("Printing  characters");
		for(char c='a';c<='z';c++)
		{
			System.out.println(c);
			System.out.println((byte)c);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
