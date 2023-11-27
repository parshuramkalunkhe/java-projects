package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetClass {
	public void hashSetClass() {
		System.out.println("HashSet is class that implements Set interface.");
		System.out.println("HashSet does not maintains insertion order.");
		System.out.println("Heterogeneous objects are allowed.");
		System.out.println("Only one null object is allowed.");
		System.out.println();
		System.out.println("e.g., HashSet Collection");
		System.out.println();
		HashSet hashset = new HashSet();
		hashset.add("Hello");
		hashset.add(10);
		hashset.add(10.5);
		hashset.add('A');
		hashset.add(null);
		hashset.add(false);
		hashset.add(true);
		
		System.out.println("HashSet Collection using add(object) method adding objects in hashset.");
		System.out.println("HashSet : " + hashset);
		System.out.println();
		
		HashSet hashset1 = new HashSet();
		hashset1.add("Mello");
		hashset1.add(10);
		hashset1.add(10.5);
		hashset1.add('A');
		hashset1.add(null);
		hashset1.add(false);
		hashset1.add(true);
		
		hashset.addAll(hashset1);
		System.out.println("HashSet Collection using add(collection) method to add hashset collection to hashset collection.");
		System.out.println("HashSet : " + hashset);
		System.out.println();
		
		System.out.println("Searching object in collections using contains(object).");
		System.out.println("null object is present in hashset collection or not : " + hashset.contains(null));
		System.out.println("hashset collection is present in hashset1 collection or not : " + hashset1.containsAll(hashset));
		System.out.println();
		
		System.out.println("Accessing object in hashset using iterator() method.");
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
		
		Iterator i = hashset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println();
		System.out.println("Accessing object in hashset using for each loop.");
		System.out.println();
		for(Object obj : hashset) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Checking the size of hashset using size() method.");
		System.out.println("HashSet : " + hashset1.size());
		System.out.println();
		System.out.println("Removing objects from  hashset using remove(object), remove(int index), removeAll(collection), clear()");
		
		System.out.println("Removing Mello object from hashset1 using remove(object) : " + hashset1.remove("Mello"));
		System.out.println("hashset1 after perfoming above operations.");
		System.out.println("HashSet : " + hashset1);
		
		System.out.println("Removing object from at index in hashset using remove(int index) : " + hashset.remove(0));
		System.out.println("hashset after perfoming above operations.");
		System.out.println("HashSet : " + hashset);
		
		System.out.println("Removing collection from hashset using removeAll(collection) : " + hashset.removeAll(hashset1));
		System.out.println("hashset after perfoming above operations.");
		System.out.println("HashSet : " + hashset);
		
		System.out.println("Clearing hashset collection using clear() method.");
		System.out.println("hashset1 after performing above operations.");
		hashset1.clear();
		System.out.println("ArrayList : " + hashset1);
	}
}
