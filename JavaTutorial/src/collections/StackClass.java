package collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackClass {
		public void stackClass() {
			System.out.println("Stack is a subclass of vector class.");	
			System.out.println("Stack class is defined in java.util. package.");
			System.out.println("Stack works on [FILO / LIFO](First In Last Out / Last In First Out) ");
			System.out.println("Stack specific methods.");
			System.out.println(" a) push(Object) is used to add objects.");
			System.out.println(" b) pop() is used to remove last object and return last object.");
			System.out.println(" c) peek() is used to return last object but if does not remove any object.");
			System.out.println();
			System.out.println("e.g., Stack Collection");
			System.out.println();
			
			Stack stacklist = new Stack();
			stacklist.push("hello");
			stacklist.push(10);
			stacklist.push(19.0);
			stacklist.push(false);
			stacklist.push(null);
			stacklist.push(true);
			
			System.out.println("Stack Collection using push(object) method adding objects in stacklist.");
			System.out.println("Stack : " + stacklist);
			System.out.println();
			
			Stack stacklist1 = new Stack();
			stacklist1.push("hello");
			stacklist1.push(10);
			stacklist1.push(19.0);
			stacklist1.push(false);
			stacklist1.push(null);
			stacklist1.push(true);
			
			System.out.println("Stack Collection using push(object) method adding objects in stacklist1.");
			System.out.println("Stack : " + stacklist1);
			System.out.println();
			
		
			stacklist.addAll(stacklist1);
			System.out.println("Stack Collection using addAll(collection) method to add stacklist1 collection to stacklist collection.");
			System.out.println("Stack : " + stacklist);
			System.out.println();
			
			stacklist1.addAll(0, stacklist);
			System.out.println("Stack Collection using addAll(int index, collection) method to add stacklist collection to stacklist1 collection at index.");
			System.out.println("Stack : " + stacklist1);
			System.out.println();
			
			System.out.println("Searching object/collection in collections using contains(object)/containsAll(collection).");
			System.out.println("null object is present in stacklist collection or not : " + stacklist.contains(null));
			System.out.println("stacklist collection is present in stacklist1 collection or not : " + stacklist1.containsAll(stacklist));
			System.out.println();
			
			System.out.println("Accessing object in stacklist using get(int index) method.");
			System.out.println(stacklist.get(0));
			System.out.println(stacklist.get(1));
			System.out.println(stacklist.get(2));
			System.out.println(stacklist.get(3));
			System.out.println();
			
			System.out.println("Accessing object in stacklist using iterator() method.");
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
			
			Iterator i = stacklist.iterator();
			while(i.hasNext()){
				System.out.println(i.next());
			}
			System.out.println();
		
			System.out.println("Accessing object in stacklist using listIterator() method.");
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
			
			ListIterator l = stacklist.listIterator();
			
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
			System.out.println("Accessing object in stacklist using for each loop.");
			System.out.println();
			for (Object obj : stacklist){
				System.out.println(obj);
			}
			System.out.println();
			
			System.out.println("Checking the size of stacklist using size() method.");
			System.out.println("Stack collection size : " + stacklist.size());
			System.out.println();
			
			System.out.println("Removing objects from vector.");
			System.out.println();
			System.out.println("Removing Mello object from stacklist using remove(object) method : " + stacklist.remove("Mello"));
			System.out.println("Stack after perfoming above operations.");
			System.out.println("Stack : " + stacklist);
			System.out.println();
			
			System.out.println("Removing object at index 0 in vector using remove(int index) method : " + stacklist.remove(0));
			System.out.println("Stack after performing above operation.");
			System.out.println("Stack : " + stacklist);
			System.out.println();
			
			System.out.println("Removing collection from collection using removeAll(collection) : " + stacklist.removeAll(stacklist1));
			System.out.println("Stack after perfoming above operations.");
			System.out.println("Stack : " + stacklist);
		
			System.out.println("Clearing vector list collection using clear() method.");
			stacklist1.clear();
			System.out.println("Stack after perfoming above operations.");
			System.out.println("Stack : " + stacklist1);		
			
		}
}
