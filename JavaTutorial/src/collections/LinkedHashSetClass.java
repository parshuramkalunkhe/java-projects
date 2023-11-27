package collections;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetClass {
	public void linkedHashSetClass() {
		System.out.println("LinkedHashSet is class that implements Set interface.");
		System.out.println("LinkedHashSet does maintains insertion order.");
		System.out.println("Heterogeneous objects are allowed.");
		System.out.println("Only one null object is allowed.");
		System.out.println();
		System.out.println("e.g., LinkedHashSet Collection");
		System.out.println();
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Hello");
		linkedHashSet.add(10);
		linkedHashSet.add(10.5);
		linkedHashSet.add('A');
		linkedHashSet.add(null);
		linkedHashSet.add(false);
		linkedHashSet.add(true);
		
		System.out.println("LinkedHashSet Collection using add(object) method adding objects in hashset.");
		System.out.println("LinkedHashSet : " + linkedHashSet);
		System.out.println();
		
		LinkedHashSet linkedHashSet1 = new LinkedHashSet();
		linkedHashSet1.add("Mello");
		linkedHashSet1.add(10);
		linkedHashSet1.add(10.5);
		linkedHashSet1.add('A');
		linkedHashSet1.add(null);
		linkedHashSet1.add(false);
		linkedHashSet1.add(true);
		
		linkedHashSet.addAll(linkedHashSet1);
		System.out.println("LinkedHashSet Collection using add(collection) method to add linkedHashSet1 collection to linkedHashSet collection.");
		System.out.println("LinkedHashSet : " + linkedHashSet);
		System.out.println();
		
		System.out.println("Searching object in collections using contains(object).");
		System.out.println("null object is present in hashset collection or not : " + linkedHashSet.contains(null));
		System.out.println("linkedHashSet collection is present in linkedHashSet1 collection or not : " + linkedHashSet1.containsAll(linkedHashSet));
		System.out.println();
		
		System.out.println("Accessing object in linkedHashSet using iterator() method.");
		System.out.println("Iterator is interface which has two methods.");
		System.out.println(" 1. next()");
		System.out.println(" 2. hasNext()");
		System.out.println();
		System.out.println("1. next() method.");
		System.out.println("\t It returns current object and moves curser to the next object in forward direction.");
		System.out.println();
		System.out.println("2. hasNext() method.");
		System.out.println("\t a) It is used to check whether the collection has next object or not.");
		System.out.println("\t b) If next object is present it returns true else it returns false.");
		System.out.println();
		
		Iterator i = linkedHashSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println();
		System.out.println("Accessing object in linkedHashSet using for each loop.");
		System.out.println();
		for(Object obj : linkedHashSet) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Checking the size of linkedHashSet using size() method.");
		System.out.println("HashSet : " + linkedHashSet1.size());
		System.out.println();
		System.out.println("Removing objects from  linkedHashSet using remove(object), remove(int index), removeAll(collection), clear()");
		
		System.out.println("Removing Mello object from linkedHashSet1 using remove(object) : " + linkedHashSet1.remove("Mello"));
		System.out.println("linkedHashSet1 after perfoming above operations.");
		System.out.println("LinkedHashSet : " + linkedHashSet1);
		
		System.out.println("Removing object from at index in linkedHashSet using remove(int index) : " + linkedHashSet.remove(0));
		System.out.println("linkedHashSet after perfoming above operations.");
		System.out.println("LinkedHashSet : " + linkedHashSet);
		
		System.out.println("Removing collection from linkedHashSet using removeAll(collection) : " + linkedHashSet.removeAll(linkedHashSet1));
		System.out.println("linkedHashSet after perfoming above operations.");
		System.out.println("LinkedHashSet : " + linkedHashSet);
		
		System.out.println("Clearing linkedHashSet1 collection using clear() method.");
		System.out.println("linkedHashSet1 after performing above operations.");
		linkedHashSet1.clear();
		System.out.println("LinkedHashSet : " + linkedHashSet1);
	}
}
