package collections;

import java.util.HashMap;

public class HashMapClass {
	public void hashMapClass() {
		System.out.println("Does not maintain insertion order.");
		System.out.println("Heterogeneous key is allowed.");
		System.out.println("Only one null key is allowed.");
		System.out.println();
		System.out.println("e.g., HashMap Example.");
		
		HashMap hashmap = new HashMap();
		hashmap.put(1, "hello");
		hashmap.put("Mello", 2);
		hashmap.put(3, null);
		hashmap.put(null, 4);
		hashmap.put(5, false);
		hashmap.put(true, 6);
		hashmap.put(7, 'a');
		hashmap.put(10.0, 8);
		
		System.out.println("HashMap using put(key, object) method adding objects in hashmap.");
		System.out.println("HashMap : " + hashmap);
		System.out.println();
		
		HashMap hashmap1 = new HashMap();
		hashmap1.put(1, "hello");
		hashmap1.put(2, "Mello");
		hashmap1.put(3, null);
		hashmap1.put(4, false);
		hashmap1.put(5, true);
		hashmap1.put(6, 'a');
		hashmap1.put(7, 10.0);
		
		System.out.println("HashMap using put(key, object) method adding objects in hashmap1.");
		System.out.println("HashMap : " + hashmap1);
		System.out.println();
		
		hashmap.putAll(hashmap1);
		System.out.println("Using putAll() method to add hashmap1 Map to hashmap.");
		System.out.println("HashMap : " + hashmap);
		System.out.println();
		
		System.out.println("Searching objects in HashMap using key and value");
		System.out.println("null key in HashMap : " + hashmap.containsKey(null));
		System.out.println("null value in HashMap : " + hashmap.containsValue(null));
		System.out.println();
		
		System.out.println("Accessing entry in HashMap.");
		System.out.println("accessing only key using keySet() : " + hashmap.keySet());
		System.out.println("accessing only value using values() : " + hashmap.values());
		System.out.println("Converting Map into Set using entrySet() : " + hashmap.entrySet());
		System.out.println();
		
		System.out.println("Removing objects in HashMap.");
		System.out.println("Using remove(int index) to remove objects : " + hashmap.remove(1));
		hashmap.clear();
		System.out.println("Using clear() to clear hashmap : " + hashmap);
	}
}
