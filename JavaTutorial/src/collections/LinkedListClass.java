package collections;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedListClass {
	public void linkedListClass() {
		System.out.println("LinkedList is class which implements List interface as well as Queue interface.");
		System.out.println("LinkedList follows doubly linked data structure.");
		System.out.println("Object will be stored in the format of node.");
		System.out.println("LinkedList does not have Initial as well as Incremental capacities.");
		System.out.println("LinkedList does not involves shifting operations.");
		System.out.println("LinkedList is good for adding & removing objects.");
		System.out.println("LinkedList is not best for searching and accessing objects.");
		System.out.println();
		System.out.println("** Characteristics of LinkedList.");
		System.out.println("  1. List is Heterogeneous.");
		System.out.println("  2. List size is not fixed (Growable type) means List can be increase in size and decrease as well as.");
		System.out.println("  3. List maintains Index.");
		System.out.println("  4. List maintains insertion order [FIFO/LILO](First In First Order / Last In Last Order)");
		System.out.println("  5. Random access allowed.");
		System.out.println("  6. Null Object is allowed.");
		System.out.println("  7. Duplicate Object is allowed.");
		System.out.println();
		System.out.println("e.g., LinkedList collections.");
		LinkedList linkedlist = new LinkedList();
		linkedlist.add("Hello");
		linkedlist.add(10);
		linkedlist.add(10.5);
		linkedlist.add('A');
		linkedlist.add(null);
		linkedlist.add(false);
		linkedlist.add(true);
		
		System.out.println("LinkedList Collection using add(object) method adding objects in linkedlist.");
		System.out.println("LinkedList : " + linkedlist);
		System.out.println();
		
		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.add(0, "Mello");
		linkedlist1.add(1, "Hello");
		linkedlist1.add(2, 10);
		linkedlist1.add(3, 10.5);
		linkedlist1.add(4, 'A');
		linkedlist1.add(5, null);
		linkedlist1.add(6, false);
		linkedlist1.add(7, true);
		
		System.out.println("LinkedList Collection using add(int index, object) method adding objects at indexs in linkedlist.");
		System.out.println("LinkedList : " + linkedlist1);
		System.out.println();
		
		linkedlist.addAll(linkedlist1);
		System.out.println("LinkedList Collection using add(collection) method to add linkedlist1 collection to linkedlist collection.");
		System.out.println("LinkedList : " + linkedlist);
		System.out.println();
		
		linkedlist1.addAll(0, linkedlist);
		System.out.println("LinkedList Collection using add(int index, collection) method to add arraylist collection to arraylist1 collection at index.");
		System.out.println("LinkedList : " + linkedlist1);
		System.out.println();
		
		System.out.println("Searching object in collections using contains(object).");
		System.out.println("null object is present in linkedlist collection or not : " + linkedlist.contains(null));
		System.out.println("linkedlist collection is present in linkedlist1 collection or not : " + linkedlist1.containsAll(linkedlist));
		System.out.println();
		
		System.out.println("Accessing object in linkedlist using get(int index) method.");
		System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.get(1));
		System.out.println(linkedlist.get(2));
		System.out.println(linkedlist.get(3));
		System.out.println();
		
		System.out.println("Accessing object in linkedlist using iterator() method.");
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
		
		Iterator i = linkedlist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		System.out.println("Accessing object in linkedlist using listIterator() method.");
		System.out.println("ListIterator is interface which has four non-static methods such as:");
		System.out.println(" 1. next()");
		System.out.println(" 2. hasNext()");
		System.out.println(" 3. previous()");
		System.out.println(" 4. hasPrevious()");
		System.out.println();
		System.out.println("1. next() method.");
		System.out.println("\t It returns current object and moves curser to the next object in forward direction.");
		System.out.println();
		System.out.println("2. hasNext() method.");
		System.out.println("\t a) It is used to check whether the collection has next object or not.");
		System.out.println("\t b) If next object is present it returns true else it returns false.");
		System.out.println();
		System.out.println("3. previous() method.");
		System.out.println("\t It returns last object moves cruser to the previous object in backward direction.");
		System.out.println();
		System.out.println("4. hasPrevious() method.");
		System.out.println("\t It used to check whether the collection has previous object or not.");
		System.out.println("\t If previous object is present it returns true else it returns false.");
		System.out.println();
		ListIterator l = linkedlist1.listIterator();
		System.out.println("Using forward direction that is hasNext() and next() methods.");
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println();
		System.out.println("Using backward direction that is hasPrevious() and previous() methods..");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
		System.out.println();
		System.out.println("Accessing object in linkedlist using for each loop.");
		System.out.println();
		for(Object obj : linkedlist) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Checking the size of linkedlist using size() method.");
		System.out.println("LinkedList : " + linkedlist1.size());
		System.out.println();
		System.out.println("Removing objects from  linkedlist using remove(object), remove(int index), removeAll(collection), clear()");
		
		System.out.println("Removing Mello object from linkedlist using remove(object) : " + linkedlist.remove("Mello"));
		System.out.println("linkedlist after perfoming above operations.");
		System.out.println("LinkedList : " + linkedlist);
		
		System.out.println("Removing object from at index in linkedlist using remove(int index) : " + linkedlist.remove(0));
		System.out.println("linkedlist after perfoming above operations.");
		System.out.println("LinkedList : " + linkedlist);
		
		System.out.println("Removing collection from linkedlist using removeAll(collection) : " + linkedlist.removeAll(linkedlist1));
		System.out.println("linkedlist after perfoming above operations.");
		System.out.println("LinkedList : " + linkedlist);
		
		System.out.println("Clearing linkedlist1 collection using clear() method.");
		System.out.println("linkedlist1 after performing above operations.");
		linkedlist1.clear();
		System.out.println("LinkedList : " + linkedlist1);
	}
}
