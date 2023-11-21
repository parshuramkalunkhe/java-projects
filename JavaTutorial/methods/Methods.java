package methods;

public class Methods {
	public void methods() {
		System.out.println("A block of statement used to perform a specific task.");
		System.out.println("Symbolic representaion of method is ();");
		System.out.println();
		System.out.println("e.g., powerbutton method has two task on or off");
		powerbutton();
		System.out.println();
		System.out.println("*NOTE : ");
		System.out.println("\t1. A method gets executed only when it is called.");
		System.out.println("\t2. One method can be called any number of times.");
		System.out.println("\t3. We cannot create a method inside another method.");
		System.out.println("\t4. We can create N number of methods inside global area.");
		System.out.println();
		System.out.println("*Q. How to called a method?");
		System.out.println(" A: By its name.");
		System.out.println();
		jre();
	}
	
	public void jre() {
		System.out.println("* JRE has few types of memory areas.");
		System.out.println("1. class static area");
		System.out.println("2. method area");
		System.out.println("3. stack area");
		System.out.println("4. heap area");
		System.out.println();
		System.out.println("1. Class Static Area");
		System.out.println(" It is a shared memory space that holds all the static variables, methods.");
		System.out.println(" In class static area there will be stored methods name and method address.");
		System.out.println(" Static variables are shared among all instances of the class, and static methods can be called without creating an object of the class.");
		System.out.println(" This area holds data and behaviour that is common to the class rather than specific to individual objects.");
		System.out.println();
		System.out.println("2. Method Area");
		System.out.println(" It stores things like the code for all the mehtods(functions) in your program the names of classes and some other data needed to run your program.");
		System.out.println(" Basically method are is a special storage space where the Java Virtual Machine (JVM) keeps information about your program.");
		System.out.println();
		System.out.println("3. Stack Area");
		System.out.println(" It is a small orgranized space in memory where the computer stores information about the funtions or methods your program is currently using/running.");
		System.out.println(" The Stack Area is like a notepad that the computer uses to keep track of what's happening while your program running.");
		System.out.println();
		System.out.println("4. Heap Area");
		System.out.println(" In java, the heap refes to a region of a computer's memory where things(object) are dynamically allocated and managed during the execution of program.");
		System.out.println(" The heap allow for dynamically memory allocation, meaning you can create and remove objects at runtime, which is essential for flexibility in programming.");
		System.out.println(" Objects in the heap have a longer lifespan, making them suitable for storing data that needs to persist throughout the execution of program.");
		System.out.println();
		System.out.println("MCS - Method Calling Statement.");
	}
	
	
	public void powerbutton() {
			System.out.println("ON");
			System.out.println("OFF");
	}
}
