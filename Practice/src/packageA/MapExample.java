package packageA;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<String, Integer>();
//		Collections.synchronizedMap(hm);
		hm.put("ANISHA", 1);
		hm.put("NISHA", 2);
		hm.put("ANISHA", 3);
		hm.put("ISHA", 4);
		hm.put("ISHA", 5);
		hm.put(null, null);
		 
		for (Map.Entry<String, Integer> map : hm.entrySet()) {

			System.out.println(map.getKey() + " " + map.getValue());
			//hm.putIfAbsent("AISHA", 6);
		}
		System.out.println();
		hm.put("key", null);
		
		
		hm.put(null, 8);
	
		for (Map.Entry<String, Integer> map : hm.entrySet()) {

			System.out.println(map.getKey() + " " + map.getValue());
			//hm.putIfAbsent("AISHA", 6);
		}
		System.out.println();

		
		hm.put(null, 9);
		
		for (Map.Entry<String, Integer> map : hm.entrySet()) {

			System.out.println(map.getKey() + " " + map.getValue());
			//hm.putIfAbsent("AISHA", 6);
		}
		
		for (Map.Entry<String, Integer> map : hm.entrySet()) {

		//	System.out.println(map.getKey() + " " + map.getValue());
		}
		
		
	}

}
