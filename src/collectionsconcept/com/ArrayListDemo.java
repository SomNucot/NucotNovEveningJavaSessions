package collectionsconcept.com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList oarraylist=new ArrayList();
		
		oarraylist.add(10);
		oarraylist.add(20);
		oarraylist.add(30);
		oarraylist.add(10);
		oarraylist.add(30);
		oarraylist.add(20);
		oarraylist.add(50);
		
		
		
		//first way
		System.out.println("Before adding some more in to the array--->"+oarraylist.size());
		
		//second way
		int sizeOfArrayList=oarraylist.size();
		System.out.println("Before adding some more in to the array--->"+sizeOfArrayList);
		
		oarraylist.add(50);
		oarraylist.add(60);
		oarraylist.add(80);
		int sizeOfArrayList1=oarraylist.size();
		System.out.println("After adding some more in to the array--->"+sizeOfArrayList1);
		
		
		System.out.println(oarraylist.get(5));
		//System.out.println(oarraylist.get(10));//IndexOutOfBoundsException:
		
		ArrayList oarraylist2=new ArrayList();
		
		oarraylist2.add("Selenium");
		oarraylist2.add("Api");
		oarraylist2.add("Postman");
		oarraylist2.add("Jenkins");
		oarraylist2.add("Jira");
		System.out.println("Before adding some more in to the string array--->"+oarraylist2.size());
		System.out.println(oarraylist2.get(2));
		
		
		
		
		ArrayList<Integer> oarraylist3=new ArrayList<Integer>();
		
		
		oarraylist3.add(10);
		oarraylist3.add(20);
		oarraylist3.add(30);
		oarraylist3.add(10);
		oarraylist3.add(30);
		oarraylist3.add(20);
		
		System.out.println(oarraylist3.size());
		
		
		System.out.println(oarraylist3.get(4));
		System.out.println("Priniting all the values in the arraylist using normal for loop");
		
		for(int i=0;i<oarraylist3.size();i++)
		{
			System.out.println(oarraylist3.get(i));
			
		}
		System.out.println("Priniting all the values in the arraylist using foreach loop");
		for(Integer newlist1:oarraylist3)
		{
			
			System.out.println(newlist1);
			
		}
		
		

		ArrayList<String> oarraylist4=new ArrayList<String>();
		
		oarraylist4.add("Selenium");
		oarraylist4.add("Api");
		oarraylist4.add("Postman");
		oarraylist4.add("Jenkins");
		oarraylist4.add("Jira");
		System.out.println("Before adding some more in to the string array--->"+oarraylist4.size());
		System.out.println(oarraylist4.get(2));
		
		System.out.println("Priniting all the values in the arraylist");
		System.out.println("Priniting all the values in the arraylist using normal for  loop");
		for(int i=0;i<oarraylist4.size();i++)
		{
			System.out.println(oarraylist4.get(i));
			
		}
		System.out.println("Priniting all the values in the arraylist using foreach loop");
		for(String newlist:oarraylist4)
		{
			
			System.out.println(newlist);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
