package packageA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExampleMap {
	public static void main(String[] args) {
		
		Map<String, Integer>  hm = new HashMap<>(); 
		  
		hm.put("sachin", 30); 
		hm.put("vaibhav", 20); 
		if(!hm.containsKey("Anisha")) {
			hm.put("Anisha", 80);
		}
		
		for(Entry<String, Integer> m :hm.entrySet()) {
	
			System.out.println(m.getKey() + " "+m.getValue());
		}
		

	}

	}

	
