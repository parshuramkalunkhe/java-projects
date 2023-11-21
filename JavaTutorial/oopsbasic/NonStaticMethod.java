package oopsbasic;

public class NonStaticMethod {
	public void nonStaticMethod() {
		System.out.println("Any method declared inside global are have not prefix with static keyword is known as non-static method.");
		System.out.println();
		System.out.println("* NOTE :");
		System.out.println("  1. All the method blocks are stored inside method area.");
		System.out.println("  2. Non static method is also known as Non-static context.");
		System.out.println("  3. Address of non static method will be stored inside object.");
		System.out.println("  4. Every non static context will be painting towards object.");
		System.out.println();
		System.out.println("* this keyword.");
		System.out.println("\t1. this is keyword.");
		System.out.println("\t2. this is non-staic reference variable.");
		System.out.println("\t3. this will have address of current object.");
		System.out.println();
		System.out.println("* NOTE :");
		System.out.println("\t this keyword/reference variable cannot be used in static context.");
		System.out.println();
		System.out.println("e.g., non static method calling inside static context.");
		System.out.println("** Main method begins **");
		NonStaticMethod nonStaticMethod = new NonStaticMethod();
		nonStaticMethod.demo();
		System.out.println("** Main method ends **");
		System.out.println();
		System.out.println("* Q. How many ways can be used static members inside non static context ?");
		System.out.println("  A: 3 Ways --> 1. Directly, 2. ClassName, 3. this");
		System.out.println();
		System.out.println("* Q. How many ways can be used non-static members inside non-static context?");
		System.out.println("  A: 2 Ways --> 1. Directly, 2. this");
		System.out.println();
		System.out.println("* Q. Why do we need this keyword/variable?");
		System.out.println("  A: Whenever we have local variable and non-static variable with same name : ");
		System.out.println("\t1. If we use directly high priority given to local variable.");
		System.out.println("\t2. To use non-static variable we need this.");
		System.out.println();
		System.out.println("* Q. Differences between static method and non-static method?");
		System.out.println("* Static method");
		System.out.println("\t1. Any method declared inside global area prefix with static keyword is known as static method.");
		System.out.println("\t2. Static method also known as static context.");
		System.out.println("\t3. It is not mandatory to create object.");
		System.out.println("\t4. Static method can be access by 3 ways.");
		System.out.println();
		System.out.println("* Non Static method.");
		System.out.println("\t1. Any method declared inside global area not prefix with static keyword is known as non static method.");
		System.out.println("\t2. Non static method also known as non static context.");
		System.out.println("\t3. Non static method stored inside object (Heap Area).");
		System.out.println("\t4. To access non-static method it is mandatory to create object.");
		System.out.println("\t5. Non static method can be access by only 1 way in static context. i.e., Object reference.");
	}
	static int i;
	public void demo() {
//		i = 10;
//		NonStaticMethod.i = 20;
//		this.i = 30;
		System.out.println("Demo method called.");
	}
}
