package loops;

public class DoWhileLoop {
	public void doWhileLoop() {
		System.out.println("It is used to iterate a part of the program repeatedly until the specified condition is true.");
		System.out.println("If the number of iteration is not fixed and you must have to execute loop at least once, it is recommended to use a do-while loop.");
		System.out.println("Do-While loop is called an exit control loop.");
		System.out.println("Unlike while loop and for loop, the do-while loop check the condition at the end of loop body.");
		System.out.println("Syntax : Initialization; do { // statements  Updation; } while(condition); ");
		System.out.println();
		System.out.println("e.g., program that prints 5 to 1 using do while loop.");
		int n = 5;
		do {
			System.out.println(n);
			n--;
		} while (n >= 1);
		
		System.out.println();
		System.out.println("*NOTE : Do-While loop is execute at least once because condition is checked after loop body.");
	}
}
