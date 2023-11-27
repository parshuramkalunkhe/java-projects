package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;

public class PriorityQueueClass {
	public void priorityQueueClass() {
		System.out.println("PriorityQueue is an implementing class of Queue interface.");
		System.out.println("PriorityQueue is defined in java.util package priority workds on priority");
		System.out.println();
		System.out.println("* NOTE : ");
		System.out.println("\t In PriorityQueue priority is assign base on ascending order.");
		System.out.println();
		System.out.println("e.g, PriorityQueue Collection");
		System.out.println();
		
		PriorityQueue priorityQueue = new PriorityQueue();
		priorityQueue.offer("Hello");
		priorityQueue.offer(10);
		priorityQueue.offer(10.5);
		priorityQueue.offer('A');
		priorityQueue.offer(null);
		priorityQueue.offer(false);
		priorityQueue.offer(true);
		
		System.out.println("PriorityQueue Collection using offer(object) method adding objects in priorityQueue.");
		System.out.println("PriorityQueue : " + priorityQueue);
		System.out.println();
		
		PriorityQueue priorityQueue1 = new PriorityQueue();
		priorityQueue1.offer("Mello");
		priorityQueue1.offer("Hello");
		priorityQueue1.offer(10);
		priorityQueue1.offer(10.5);
		priorityQueue1.offer('A');
		priorityQueue1.offer(null);
		priorityQueue1.offer(false);
		priorityQueue1.offer(true);
		
		priorityQueue.addAll(priorityQueue1);
		System.out.println("PriorityQueue Collection using add(collection) method to add priorityQueue1 collection to priorityQueue collection.");
		System.out.println("PriorityQueue : " + priorityQueue);
		System.out.println();
		
		System.out.println("Searching object in collections using contains(object).");
		System.out.println("null object is present in priorityQueue collection or not : " + priorityQueue.contains(null));
		System.out.println("priorityQueue collection is present in priorityQueue1 collection or not : " + priorityQueue1.containsAll(priorityQueue));
		System.out.println();
		
		System.out.println("Accessing object in priorityQueue using iterator() method.");
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
		
		Iterator i = priorityQueue.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		
		System.out.println("Accessing object in priorityQueue using for each loop.");
		System.out.println();
		for(Object obj : priorityQueue) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("Checking the size of priorityQueue1 using size() method.");
		System.out.println("PriorityQueue : " + priorityQueue1.size());
		System.out.println();
		System.out.println("Removing objects from  priorityQueue using poll(), removeAll(collection), clear()");
		
		System.out.println("Removing Mello object from priorityQueue using remove(object) : " + priorityQueue.poll());
		System.out.println("priorityQueue after perfoming above operations.");
		System.out.println("PriorityQueue : " + priorityQueue);
		
		System.out.println("Removing collection from priorityQueue using removeAll(collection) : " + priorityQueue.removeAll(priorityQueue1));
		System.out.println("priorityQueue after perfoming above operations.");
		System.out.println("PriorityQueue : " + priorityQueue);
		
		System.out.println("Clearing linkedlist1 collection using clear() method.");
		System.out.println("priorityQueue1 after performing above operations.");
		priorityQueue.clear();
		System.out.println("LinkedList : " + priorityQueue1);

		
	}
}
