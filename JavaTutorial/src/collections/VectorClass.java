package collections;

import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;

public class VectorClass {
	public void vectorClass() {
		System.out.println("Vector is an inbuilt class defined in java.util package.");
		System.out.println("Vector class is an implementing class of List interface.");
		System.out.println();
		System.out.println("** Characteristics of Vector.");
		System.out.println("  1. List is Heterogeneous.");
		System.out.println("  2. List size is not fixed (Growable type) means List can be increase in size and decrease as well as.");
		System.out.println("  3. List maintains Index.");
		System.out.println("  4. List maintains insertion order [FIFO/LILO](First In First Order / Last In Last Order)");
		System.out.println("  5. Random access allowed.");
		System.out.println("  6. Null Object is allowed.");
		System.out.println("  7. Duplicate Object is allowed.");
		System.out.println();
		System.out.println("e.g., vector list.");
		Vector vectlist = new Vector();
		vectlist.add(15);
		vectlist.add(5.4);
		vectlist.add(null);
		vectlist.add("sheela");
		vectlist.add(false);
		vectlist.add(true);
		vectlist.add('a');
		System.out.println("Vector Collection using add(object) method adding object in vectorlist.");
		System.out.println("Vector : " + vectlist);
		System.out.println();
		
		Vector vectlist1 = new Vector();
		vectlist1.add(0, "Mello");
		vectlist1.add(1, "Hello");
		vectlist1.add(2, 10);
		vectlist1.add(3, 10.5);
		vectlist1.add(4, 'A');
		vectlist1.add(5, null);
		vectlist1.add(6, false);
		vectlist1.add(7, true);
		
		System.out.println("Vector Collection using add(int index, object) method adding objects at indexs in vector list.");
		System.out.println("Vector : " + vectlist1);
		System.out.println();
		
		vectlist.addAll(vectlist1);
		System.out.println("Vector Collection using add(collection) method to add vectlist1 collection to vectlist collection.");
		System.out.println("Vector : " + vectlist);
		System.out.println();
		
		vectlist1.addAll(0, vectlist);
		System.out.println("Vector Collection using add(int index, collection) method to add vectlist collection to vectlist1 collection at index.");
		System.out.println("Vector : " + vectlist1);
		System.out.println();
		
		System.out.println("Searching object/collection in collections using contains(object)/containsAll(collection).");
		System.out.println("null object is present in vectlist collection or not : " + vectlist.contains(null));
		System.out.println("vectlist collection is present in vectlist1 collection or not : " + vectlist1.containsAll(vectlist));
		System.out.println();
		
		System.out.println("Accessing object in vector list using get(int index) method.");
		System.out.println(vectlist.get(0));
		System.out.println(vectlist.get(1));
		System.out.println(vectlist.get(2));
		System.out.println(vectlist.get(3));
		System.out.println();
		
		System.out.println("Accessing object in vector list using iterator() method.");
		System.out.println("Iterator is interface which has two methods.");
		System.out.println("  1. next()");
		System.out.println("  2. hasNext()");
		System.out.println();
		
		System.out.println("1. next() method.");
		System.out.println("\t It retunrs current object and moves curser to the next object in forward direction.");
		System.out.println();
		System.out.println("2. hasNext() method.");
		System.out.println("\t a) It is used to check whether the collection has next object or not.");
		System.out.println("\t b) If the next object is present it retunrs true else it returns false.");
		System.out.println();
		System.out.println("e.g., vector list");
		
		Iterator i = vectlist.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println();
	
		System.out.println("Accessing object in vector list using listIterator() method.");
		System.out.println("ListIterator is interface which has four non-static methods such as :");
		System.out.println("  1. next()");
		System.out.println("  2. hasNext()");
		System.out.println("  3. previous()");
		System.out.println("  4. hasPrevious()");
		System.out.println();
		System.out.println("1. next() method.");
		System.out.println("\t It returns current object and move curser to the next object in forward direction.");
		System.out.println();
		System.out.println("2. hasNext() method.");
		System.out.println("\t a) It is used to check whether the collection has next object or not.");
		System.out.println("\t b) If the next object is present it returns true else it returns false.");
		System.out.println();
		System.out.println("3. previous() method.");
		System.out.println("\t It returns last object moves curser to the previous object in backwared direction.");
		System.out.println();
		System.out.println("4. hasPrevious() method.");
		System.out.println("\t a) It used to check whether the collection has previous object or not.");
		System.out.println("\t b) If previous object is present it returns it returns true else it returns false.");
		System.out.println();
		System.out.println("e.g., vector list");
		
		ListIterator l = vectlist.listIterator();
		
		System.out.println("Using forward direction that is hasNext() and next() methods.");
		
		while(l.hasNext()){
			System.out.println(l.next());
		}
		System.out.println();
		
		System.out.println("Using backwared direction that is hasPrevious() and previous() methods.");
		
		while(l.hasPrevious()){
			System.out.println(l.previous());
		}
		System.out.println();
		System.out.println("Accessing object in vector list using for each loop.");
		System.out.println();
		for (Object obj : vectlist){
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("Checking the size of vector list using size() method.");
		System.out.println("Vector collection size : " + vectlist.size());
		System.out.println();
		
		System.out.println("Removing objects from vector.");
		System.out.println();
		System.out.println("Removing Mello object from vector list using remove(object) method : " + vectlist.remove("Mello"));
		System.out.println("Vector after perfoming above operations.");
		System.out.println("Vector : " + vectlist);
		System.out.println();
		
		System.out.println("Removing object at index 0 in vector using remove(int index) method : " + vectlist.remove(0));
		System.out.println("Vector after performing above operation.");
		System.out.println("Vector : " + vectlist);
		System.out.println();
		
		System.out.println("Removing collection from collection using removeAll(collection) : " + vectlist.removeAll(vectlist1));
		System.out.println("Vector after perfoming above operations.");
		System.out.println("Vector : " + vectlist);
	
		System.out.println("Clearing vector list collection using clear() method.");
		vectlist1.clear();
		System.out.println("Vector after perfoming above operations.");
		System.out.println("Vector : " + vectlist);
		
	}
}
