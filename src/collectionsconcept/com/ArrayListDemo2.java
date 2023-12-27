package collectionsconcept.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		
		

		List<Integer> oarraylist=new ArrayList<Integer>();
		
		oarraylist.add(10);
		oarraylist.add(20);
		oarraylist.add(30);
		oarraylist.add(10);
		oarraylist.add(30);
		oarraylist.add(20);
		oarraylist.add(50);
		
		System.out.println("this is arraylist bag"+oarraylist);
		
		System.out.println("Priniting all the values in the arraylist using normal for loop");
		
		for(int i=0;i<oarraylist.size();i++)
		{
			System.out.println(oarraylist.get(i));
			
		}
		System.out.println("Priniting all the values in the arraylist using foreach loop");
		for(Integer newlist1:oarraylist)
		{
			
			System.out.println(newlist1);
			
		}
		
		
		oarraylist.set(3, 100);
		
		System.out.println(oarraylist);
		
		oarraylist.remove(4);
		
		System.out.println(oarraylist);
		
		
		oarraylist.add(4, 99);
		System.out.println(oarraylist);
		
		Collections.sort(oarraylist);
		System.out.println(oarraylist);
		
		
		
		System.out.println(oarraylist.contains(1));
		
		
		
		
		
		
		
		
		

	}

}
