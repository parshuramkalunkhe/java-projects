package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
	public void treeSetClass() {
		System.out.println("TreeSet is class which is iplementing Set interface.");
		System.out.println("TreeSet by default sort object in ascending order.");
		System.out.println("TreeSet only allows homogeneous objects.");
		System.out.println("Null object is not allowed.");
		System.out.println("To sort objects in descending order we have descendingSet() method.");
		System.out.println("Null Objects throws NullPointerException.");
		System.out.println("Heterogeneous Objects throws ClassCastException.");
		System.out.println();
		System.out.println("e.g., TreeSet Collection");
		System.out.println();
		
		TreeSet treeset = new TreeSet();
		treeset.add(14);
		treeset.add(10);
		treeset.add(-10);
		treeset.add(11);
		treeset.add(12);
		treeset.add(32);
		treeset.add(22);
		
		System.out.println("TreeSet Collection using add(object) method adding objects in hashset.");
		System.out.println("TreeSet : " + treeset);
		System.out.println();
		
		TreeSet treeset1 = new TreeSet();
		treeset1.add(1);
		treeset1.add(2);
		treeset1.add(3);
		treeset1.add(4);
		treeset1.add(5);
		treeset1.add(6);
		treeset1.add(7);
		
		treeset.addAll(treeset1);
		System.out.println("TreeSet Collection using add(collection) method to add treeset1 collection to treeset collection.");
		System.out.println("TreeSet : " + treeset);
		System.out.println();
		
		System.out.println("Searching object in collections using contains(object).");
		System.out.println("1 object is present in treeset collection or not : " + treeset.contains(1));
		System.out.println("treeset collection is present in treeset1 collection or not : " + treeset1.containsAll(treeset));
		System.out.println();
		
		System.out.println("Accessing object in TreeSet using iterator() method.");
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
		
		Iterator i = treeset.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println();
		System.out.println("Accessing object in TreeSet using for each loop.");
		System.out.println();
		for(Object obj : treeset) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Checking the size of TreeSet using size() method.");
		System.out.println("HashSet : " + treeset1.size());
		System.out.println();
		System.out.println("Removing objects from  TreeSet using remove(object), remove(int index), removeAll(collection), clear()");
		
		System.out.println("Removing Mello object from treeset1 using remove(object) : " + treeset1.remove("Mello"));
		System.out.println("treeset1 after perfoming above operations.");
		System.out.println("LinkedHashSet : " + treeset1);
		
		System.out.println("Removing object from at index in TreeSet using remove(int index) : " + treeset.remove(0));
		System.out.println("TreeSet after perfoming above operations.");
		System.out.println("TreeSet : " + treeset);
		
		System.out.println("Removing collection from TreeSet using removeAll(collection) : " + treeset1.removeAll(treeset));
		System.out.println("TreeSet after perfoming above operations.");
		System.out.println("TreeSet : " + treeset1);
		
		System.out.println("Clearing TreeSet collection using clear() method.");
		System.out.println("TreeSet after performing above operations.");
		treeset.clear();
		System.out.println("LinkedHashSet : " + treeset);
	}
}
