package collectionsconcept.com;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		
		LinkedList<Integer> oarraylist=new LinkedList<Integer>();
		oarraylist.add(10);
		oarraylist.add(20);
		oarraylist.add(30);
		oarraylist.add(10);
		oarraylist.add(30);
		oarraylist.add(20);
		oarraylist.add(50);
		
		System.out.println("Before sorting-->"+oarraylist);
		
		Collections.sort(oarraylist);
		System.out.println("After sorting-->"+oarraylist);
		
		System.out.println(oarraylist.size());
		
		for(int i=0;i<oarraylist.size();i++)
		{
			System.out.println(oarraylist.get(i));
			
		}
		
		
		
		System.out.println("Priniting all the values in the arraylist using foreach loop");
		for(Integer newlist:oarraylist)
		{
			
			System.out.println(newlist);
			
		}
		
		
		
		
		
		

	}

}
