package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {
	public void arrayListClass() {
		System.out.println("ArrayList is implementing class of List interface. ArrayList class is define in java.util package.");
		System.out.println();
		System.out.println("** Characteristics of Arraylist.");
		System.out.println("  1. List is Heterogeneous.");
		System.out.println("  2. List size is not fixed (Growable type) means List can be increase in size and decrease as well as.");
		System.out.println("  3. List maintains Index.");
		System.out.println("  4. List maintains insertion order [FIFO/LILO](First In First Order / Last In Last Order)");
		System.out.println("  5. Random access allowed.");
		System.out.println("  6. Null Object is allowed.");
		System.out.println("  7. Duplicate Object is allowed.");
		System.out.println();
		System.out.println("e.g., ArrayList collections.");
		ArrayList arrlist = new ArrayList();
		arrlist.add("Hello");
		arrlist.add(10);
		arrlist.add(10.5);
		arrlist.add('A');
		arrlist.add(null);
		arrlist.add(false);
		arrlist.add(true);
		
		System.out.println("ArrayList Collection using add(object) method adding objects in arraylist.");
		System.out.println("ArrayList : " + arrlist);
		System.out.println();
		
		ArrayList arrlist1 = new ArrayList();
		arrlist1.add(0, "Mello");
		arrlist1.add(1, "Hello");
		arrlist1.add(2, 10);
		arrlist1.add(3, 10.5);
		arrlist1.add(4, 'A');
		arrlist1.add(5, null);
		arrlist1.add(6, false);
		arrlist1.add(7, true);
		
		System.out.println("ArrayList Collection using add(int index, object) method adding objects at indexs in arraylist.");
		System.out.println("ArrayList : " + arrlist1);
		System.out.println();
		
		arrlist.addAll(arrlist1);
		System.out.println("ArrayList Collection using add(collection) method to add arraylist1 collection to arraylist collection.");
		System.out.println("ArrayList : " + arrlist);
		System.out.println();
		
		arrlist1.addAll(0, arrlist);
		System.out.println("ArrayList Collection using add(int index, collection) method to add arraylist collection to arraylist1 collection at index.");
		System.out.println("ArrayList : " + arrlist1);
		System.out.println();
		
		System.out.println("Searching object in collections using contains(object).");
		System.out.println("null object is present in arrlist collection or not : " + arrlist.contains(null));
		System.out.println("arrlist collection is present in arrlist1 collection or not : " + arrlist1.containsAll(arrlist));
		System.out.println();
		
		System.out.println("Accessing object in array list using get(int index) method.");
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.get(1));
		System.out.println(arrlist.get(2));
		System.out.println(arrlist.get(3));
		System.out.println();
		
		System.out.println("Accessing object in array list using iterator() method.");
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
		
		Iterator i = arrlist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		System.out.println("Accessing object in array list using listIterator() method.");
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
		ListIterator l = arrlist1.listIterator();
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
		System.out.println("Accessing object in array list using for each loop.");
		System.out.println();
		for(Object obj : arrlist) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Checking the size of arra list using size() method.");
		System.out.println("ArrayList : " + arrlist1.size());
		System.out.println();
		System.out.println("Removing objects from  array list using remove(object), remove(int index), removeAll(collection), clear()");
		
		System.out.println("Removing Mello object from arrlist using remove(object) : " + arrlist.remove("Mello"));
		System.out.println("arrlist after perfoming above operations.");
		System.out.println("ArrayList : " + arrlist);
		
		System.out.println("Removing object from at index in arrlist using remove(int index) : " + arrlist.remove(0));
		System.out.println("arrlist after perfoming above operations.");
		System.out.println("ArrayList : " + arrlist);
		
		System.out.println("Removing collection from arrlist using removeAll(collection) : " + arrlist.removeAll(arrlist1));
		System.out.println("arrlist after perfoming above operations.");
		System.out.println("ArrayList : " + arrlist);
		
		System.out.println("Clearing array list collection using clear() method.");
		System.out.println("arrlist1 after performing above operations.");
		arrlist1.clear();
		System.out.println("ArrayList : " + arrlist1);
	}
}
