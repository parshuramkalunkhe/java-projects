package inbuiltclasses;

public class ObjectClass {
	public void objectClass() {
		System.out.println("Object class is a super class for all the classes in java.");
		System.out.println("Object class is defined in java.lang package.");
		System.out.println("Object class consists of 11 non-static methods?");
		System.out.println();
		System.out.println("* 11 non static methods.");
		System.out.println("  1. toString()");
		System.out.println("  2. hashCode()");
		System.out.println("  3. equals(Object obj)");
		System.out.println("  4. getClass()");
		System.out.println("  5. finalize()");
		System.out.println("  6. clone()");
		System.out.println("  7. wait()");
		System.out.println("  8. waint(long)");
		System.out.println("  9. waint(long, int)");
		System.out.println("  10. notify()");
		System.out.println("  11. notifyAll()");
		System.out.println();
		System.out.println("1. toString() method");
		System.out.println("\t 1. It is non-static method defined in java.lang.Object; class");
		System.out.println("\t 2. toString() methods returnType is String.");
		System.out.println("\t 3. toString() methods returns address of an object in string format.");
		System.out.println();
		System.out.println("e.g., toString() method example.");
		System.out.println("toString() : " + toString());
		System.out.println();
		System.out.println("* NOTE ");
		System.out.println("\t Whenever we try to print reference variable of an object always internally it calls toString() method of object class.");
		System.out.println();
		System.out.println("* Q. Why do we need method Overriding?");
		System.out.println("\t To change the logic of existing method.");
		System.out.println();
		System.out.println("* Q. Why do we need to override toString() method?");
		System.out.println("\t To print data of an object rather than printing address of an object.");
		System.out.println();
		System.out.println("2. hashCode() class method");
		System.out.println("\t 1. It is non static method defined in object");
		System.out.println("\t 2. hashCode() methods returnType is int");
		System.out.println("\t 3. hashCode() methods return unique integer number for every object.");
		System.out.println();
		System.out.println("e.g., hashCode() method example return 1 value.");
		System.out.println("hashCode() : " + hashCode());
		System.out.println();
		System.out.println("* Q Why do we need to override hashCode() method?");
		System.out.println("\t To generate unique integer number based on data for every object.");
		System.out.println();
		System.out.println("3. equals(Object obj) method");
		System.out.println("\t 1. It is non static method defined inside object class");
		System.out.println("\t 2. Return Type of equals method is boolean");
		System.out.println("\t 3. equals(object obj) method is similar to equals operator.");
		System.out.println();
		System.out.println("e.g., equals(Object obj) method example");
		ObjectClass objCls = new ObjectClass();
		System.out.println("equals(Object obj) : " + equals(objCls));
		System.out.println();
		System.out.println("* Q. Why do we need to override equsla(Object obj) method?");
		System.out.println("\t To comapre data of two objects rather than comparing address of two objects.");
		System.out.println();
		System.out.println("* Q. Difference between equals(Object obj) method and == equals operator?");
		System.out.println("* equlas(Object obj)");
		System.out.println("\t 1. compared the content/data/values of the objects");
		System.out.println("\t 2. specifically designed for comapring objects, including strings.");
		System.out.println("\t 3. suitable for comparing string content.");
		System.out.println("\t 4. equals() is considered a method in Java.");
		System.out.println();
		System.out.println("* == equlas operator");
		System.out.println("\t 1. checks if the memory addresses of the objects are equals");
		System.out.println("\t 2. Applicable to all data types.");
		System.out.println("\t 3. Not suitable for comparing String content.");
		System.out.println("\t 4. == is conisdered an operator in Java.");
	}
	
	@Override
	public String toString() {
		return "toString() method is overrided.";
	}
	@Override
	public int hashCode() {
		int hello = 1;
		return hello;
	}
	@Override
	public boolean equals(Object obj) {
		return this == obj;
	}
}
