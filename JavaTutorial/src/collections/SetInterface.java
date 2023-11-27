package collections;

public class SetInterface {
	public void setInterface() {
		System.out.println("Set is interface implementing Collection interface.");
		System.out.println();
		System.out.println("* Characteristic of Set interface.");
		System.out.println("  1. Duplicate objects are not allowed.");
		System.out.println("  2. Set does not maintains insertion order [FIFO/LILO](First In First Out/ Last In Last Out)");
		System.out.println("  3. Random access is not allowed.");
		System.out.println("  4. Set does not maintains index");
		System.out.println("  5. Only one null object is allowed.");
		System.out.println("  6. In Set we can add & remove objects by using object not by using index.");
		System.out.println("  7. In Set there are 2 ways to access objects.");
		System.out.println("\t\t a) iterator()");
		System.out.println("\t\t b) for-each loop.");
		System.out.println();
		System.out.println("* There are 3 classes that implements Set interface.");
		System.out.println("\t 1. HashSet");
		System.out.println("\t 2. LinkedHashSet");
		System.out.println("\t 3. TreeSet");
	}
}
