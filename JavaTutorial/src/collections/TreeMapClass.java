package collections;

import java.util.TreeMap;

public class TreeMapClass {
	public void treeMapClass() {
		System.out.println("Does not maintain insertion order.");
		System.out.println("Heterogeneous key is not allowed only homogeneous key is allowed.");
		System.out.println("not even one null key is allowed.");
		System.out.println("TreeMap  by default sort objects in descending order based on key.");
		System.out.println();
		System.out.println("e.g., TreeMap Example.");
		
		TreeMap treemap = new TreeMap();
		treemap.put(1, "hello");
		treemap.put(-2, "Mello");
		treemap.put(3, null);
		treemap.put(-4, false);
		treemap.put(5, true);
		treemap.put(-6, 'a');
		treemap.put(7, 10.0);
		
		System.out.println("TreeMap using put(key, object) method adding objects in treemap.");
		System.out.println("TreeMap : " + treemap);
		System.out.println();
		
		TreeMap treemap1 = new TreeMap();
		treemap1.put(1, "hello");
		treemap1.put(2, "Mello");
		treemap1.put(3, null);
		treemap1.put(4, false);
		treemap1.put(5, true);
		treemap1.put(6, 'a');
		treemap1.put(7, 10.0);
		
		System.out.println("TreeMap using put(key, object) method adding objects in treemap1.");
		System.out.println("TreeMap : " + treemap1);
		System.out.println();
		
		treemap.putAll(treemap1);
		System.out.println("Using putAll() method to add treemap1 Map to treemap.");
		System.out.println("TreeMap : " + treemap);
		System.out.println();
		
		System.out.println("Searching objects in TreeMap using key and value");
		System.out.println("null key in TreeMap : " + treemap.containsKey(null));
		System.out.println("null value in TreeMap : " + treemap.containsValue(null));
		System.out.println();
		
		System.out.println("Accessing entry in TreeMap.");
		System.out.println("accessing only key using keySet() : " + treemap.keySet());
		System.out.println("accessing only value using values() : " + treemap.values());
		System.out.println("Converting Map into Set using entrySet() : " + treemap.entrySet());
		System.out.println();
		
		System.out.println("Removing objects in TreeMap.");
		System.out.println("Using remove(int index) to remove objects : " + treemap.remove(1));
		treemap.clear();
		System.out.println("Using clear() to clear treemap : " + treemap);
	}
}
