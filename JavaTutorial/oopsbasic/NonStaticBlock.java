package oopsbasic;

public class NonStaticBlock {
	public void nonStaticBlock() {
		System.out.println("Any block declared inside global area not prefix with static keyword is known as non static block.");
		System.out.println("Non Static Block also known as IIB - Instance Initializer Block or Anonymous Block.");
		System.out.println();
		System.out.println("* Characteristics");
		System.out.println("\t1. Non Static Block doesn't have any name.");
		System.out.println("\t2. Non Static Block doesn't have any formal argument.");
		System.out.println("\t3. Non Static Block doesn't have any return type.");
		System.out.println("\t4. Programmer cannot call non static block explicitly (forcefully)");
		System.out.println("\t5. Non static block get executed after the execution of main method.");
		System.out.println("\t6. Non static block gets executed only when we create object.");
		System.out.println("\t7. Non static block gets executed only once for one object.");
		System.out.println();
		System.out.println("* Q. Why do we need non static block?");
		System.out.println("  A: To execute some statements mandatorily whenever we create object only once for one object.");
		System.out.println();
		System.out.println("* NOTE :");
		System.out.println("\t1. When we have multiple IIB's (Instance Initializer Block) then they will get executed from top to bottom order or line by line.");
		System.out.println("Syntax : { // statements. }");
	}
	
}
