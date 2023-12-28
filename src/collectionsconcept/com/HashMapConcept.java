package collectionsconcept.com;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<String,String> omap=new HashMap<String,String>();
		//key and value pair
		omap.put("name", "Modi");
		omap.put("age", "65");
		omap.put("city", "Bangalore");
		omap.put("address", "india");
		
	
		System.out.println(omap.size());
		
		System.out.println(omap.get("name"));
		System.out.println(omap.get("age"));
		
		
		Map<String, Integer> hm = new HashMap<String, Integer>(); 

    // Inserting pairs in above Map 
    // using put() method 
    hm.put("a", 10); 
    hm.put("b", 30); 
    hm.put("c", 40); 
    hm.put("d", 50); 

    // Traversing through Map using for-each loop 
    for (Map.Entry<String, Integer> me : hm.entrySet()) { 

        // Printing keys 
        System.out.print(me.getKey() + " : -->"+ me.getValue()); 
        
} 
		System.out.println(hm.remove("c"));
		
		System.out.println(hm);
		
		
		
		
	}		

	

}
