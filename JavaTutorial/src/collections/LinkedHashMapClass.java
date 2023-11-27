package collections;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {
	public void linkedHashMapClass() {
		System.out.println("Does not maintain insertion order.");
		System.out.println("Heterogeneous key is allowed.");
		System.out.println("Only one null key is allowed.");
		System.out.println();
		System.out.println("e.g., LinkedHashMap Example.");
		
		LinkedHashMap linkedhashmap = new LinkedHashMap();
		linkedhashmap.put(1, "hello");
		linkedhashmap.put("Mello", 2);
		linkedhashmap.put(3, null);
		linkedhashmap.put(null, 4);
		linkedhashmap.put(5, false);
		linkedhashmap.put(true, 6);
		linkedhashmap.put(7, 'a');
		linkedhashmap.put(10.0, 8);
		
		System.out.println("LinkedHashMap using put(key, object) method adding objects in linkedhashmap.");
		System.out.println("LinkedHashMap : " + linkedhashmap);
		System.out.println();
		
		LinkedHashMap linkedhashmap1 = new LinkedHashMap();
		linkedhashmap1.put(1, "hello");
		linkedhashmap1.put(2, "Mello");
		linkedhashmap1.put(3, null);
		linkedhashmap1.put(4, false);
		linkedhashmap1.put(5, true);
		linkedhashmap1.put(6, 'a');
		linkedhashmap1.put(7, 10.0);
		
		System.out.println("LinkedHashMap using put(key, object) method adding objects in linkedhashmap1.");
		System.out.println("LinkedHashMap : " + linkedhashmap1);
		System.out.println();
		
		linkedhashmap.putAll(linkedhashmap1);
		System.out.println("Using putAll() method to add linkedhashmap1 Map to linkedhashmap.");
		System.out.println("LinkedHashMap : " + linkedhashmap);
		System.out.println();
		
		System.out.println("Searching objects in LinkedHashMap using key and value");
		System.out.println("null key in LinkedHashMap : " + linkedhashmap.containsKey(null));
		System.out.println("null value in LinkedHashMap : " + linkedhashmap.containsValue(null));
		System.out.println();
		
		System.out.println("Accessing entry in LinkedHashMap.");
		System.out.println("accessing only key using keySet() : " + linkedhashmap.keySet());
		System.out.println("accessing only value using values() : " + linkedhashmap.values());
		System.out.println("Converting Map into Set using entrySet() : " + linkedhashmap.entrySet());
		System.out.println();
		
		System.out.println("Removing objects in LinkedHashMap.");
		System.out.println("Using remove(int index) to remove objects : " + linkedhashmap.remove(1));
		linkedhashmap.clear();
		System.out.println("Using clear() to clear linkedhashmap : " + linkedhashmap);
	}
}
