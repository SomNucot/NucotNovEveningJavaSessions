package collectionsconcept.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		
		HashSet<Integer> oset=new HashSet<Integer>();
		
		oset.add(10);
		oset.add(40);
		oset.add(20);
		oset.add(10);
		oset.add(30);
		oset.add(20);
		System.out.println(oset);
		//Collections.sort(oset);
		
		SortedSet<Integer> oset1=new TreeSet<Integer>();
		
		oset1.add(10);
		oset1.add(40);
		oset1.add(20);
		oset1.add(10);
		oset1.add(30);
		oset1.add(20);
		System.out.println(oset1);
		
		Set<String> hash_Set = new HashSet<String>(); 
		  
        // Adding elements to the Set 
        // using add() method 
        hash_Set.add("Geeks"); 
        hash_Set.add("For"); 
        hash_Set.add("Geeks"); 
        hash_Set.add("Example"); 
        hash_Set.add("Set"); 
  
        // Printing elements of HashSet object 
        System.out.println(hash_Set);
        
        
        
     // Creating an object of Set class  
        // Declaring object of Integer type  
        Set<Integer> a = new HashSet<Integer>(); 
       
        a.add(10);
		a.add(40);
		a.add(20);
		a.add(10);
		a.add(30);
		a.add(20);
		System.out.println(a);
	
        // Adding all elements to List  
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 })); 
        
      // Again declaring object of Set class 
      // with reference to HashSet 
        Set<Integer> b = new HashSet<Integer>(); 
        b.add(10);
		b.add(40);
		b.add(20);
		b.add(10);
		b.add(30);
		b.add(20);
		System.out.println(b);
      b.addAll(Arrays.asList( 
           new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 })); 
  
          
        // To find union 
        Set<Integer> union = new HashSet<Integer>(a); 
        union.addAll(b); 
        System.out.print("Union of the two Set"); 
        System.out.println(union); 
  
        // To find intersection 
        Set<Integer> intersection = new HashSet<Integer>(a); 
        intersection.retainAll(b); 
        System.out.print("Intersection of the two Set"); 
        System.out.println(intersection); 
  
        // To find the symmetric difference 
        Set<Integer> difference = new HashSet<Integer>(a); 
        difference.removeAll(b); 
        System.out.print("Difference of the two Set"); 
        System.out.println(difference); 
		
        Set<String> hs = new HashSet<String>(); 
        
        // Adding elements to Set   
        // using add() method 
  
        // Custom input elements  
        hs.add("A"); 
        hs.add("B"); 
        hs.add("C"); 
        hs.add("B"); 
        hs.add("D"); 
        hs.add("E"); 
        hs.add("C");
  
        // Iterating through the Set 
        // via for-each loop  
        for (String value : hs) 
        {
  
            // Printing all the values inside the object  
            System.out.print(value + ", "); 
        }
          
        System.out.println(); 
		
        
        
        // Iterating through iterators 
        Iterator<String> i=hs.iterator(); 
  
        // It holds true till there is a single element 
        // remaining in the object 
        while (i.hasNext()) 
        {
  
            System.out.println("inside while loop--->"+i.next()); 
        } 
        
        
        
        
        Set<Integer> hs1 = new HashSet<Integer>();   
        hs1.add(20);
        hs1.add(30);
        
        Iterator<Integer> ii= hs1.iterator();
        while (ii.hasNext()) 
        {
  
            System.out.println(ii.next()); 
        } 
		System.out.println("Thanks");
		
		

	}

}
