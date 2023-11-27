package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class QueueLinkedListClass {
	public void queueLinkedListClass() {
		System.out.println("LinkedList is an impelementing class fo Queue interface as well as List interafce.");
		System.out.println("* Queue specific methods for LinkedList.");
		System.out.println("\t a) offer(object) - To add object");
		System.out.println("\t b) poll() - To remove only first object.");
		System.out.println();
		
		System.out.println("e.g., LinkedList collections.");
		LinkedList linkedlist = new LinkedList();
		linkedlist.offer("Hello");
		linkedlist.offer(10);
		linkedlist.offer(10.5);
		linkedlist.offer('A');
		linkedlist.offer(null);
		linkedlist.offer(false);
		linkedlist.offer(true);
		
		System.out.println("LinkedList Collection using offer(object) method adding objects in linkedlist.");
		System.out.println("LinkedList : " + linkedlist);
		System.out.println();
		
		LinkedList linkedlist1 = new LinkedList();
		linkedlist1.offer("Mello");
		linkedlist1.offer("Hello");
		linkedlist1.offer(10);
		linkedlist1.offer(10.5);
		linkedlist1.offer('A');
		linkedlist1.offer(null);
		linkedlist1.offer(false);
		linkedlist1.offer(true);
		
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
		System.out.println("Removing objects from  linkedlist using poll(), removeAll(collection), clear()");
		
		System.out.println("Removing Mello object from linkedlist using remove(object) : " + linkedlist.poll());
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
