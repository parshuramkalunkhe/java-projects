package oopsbasic;

public class StaticBlock {
	public void staticBlock() {
		System.out.println("Any block declared inside global area prefix with static keyword is known as static block.");
		System.out.println(" * Charactistics of static block.");
		System.out.println("\t 1. Static block doesn't have any name.");
		System.out.println("\t 2. Static block doesn't have any returntype.");
		System.out.println("\t 3. Static block doesn't have any formal argument.");
		System.out.println("\t 4. Programmer can not call static block explicitily (forcefully).");
		System.out.println("\t 5. Static block get executed before the execution of main method.");
		System.out.println("\t 6. Static block is executed implicitely (automatically) by the compiler but only once.");
		System.out.println();
		System.out.println("* NOTE :");
		System.out.println("When we have multiple SIB's then they will get executed from top to bottom order.");
		System.out.println();
		System.out.println("Syntax :  static { // statements }");
		System.out.println();
		System.out.println("* Q. Why do we need static block ?");
		System.out.println("\tTo execute some statements before the execution of main method.");
		System.out.println();
		System.out.println("* Q. Difference between static method & static block ?");
		System.out.println("\t Static Block.");
		System.out.println("\t 1. Any block declared inside global area prefix with static keyword is called static block.");
		System.out.println("\t 2. Static block doesnt have any name.");
		System.out.println("\t 3. Static block doesnt have any return type.");
		System.out.println("\t 4. Static block doesnt have any formal argument.");
		System.out.println();
		System.out.println("\t Static Method.");
		System.out.println("\t Any method declared inside global area prefix with static keyword is called static method.");
		System.out.println("\t Static method have a name.");
		System.out.println("\t Static mehtod have return type depends on what kind of datatype returning by method.");
		System.out.println("\t Static method have formal argument.");
	}
}
