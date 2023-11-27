package loops;

public class WhileLoop {
	public void whileLoop() {
		System.out.println(
				"It is used to iterate a part of the program repeatedly until the specified boolean condition is true.");
		System.out.println("As soon as the boolean condition becomes false, the loop automatically stops.");
		System.out.println("The while loop is considere as a repeating if statement.");
		System.out.println("If the number of iteration is not fixed, it is recommended to use the while loop.");
		System.out.println("Syntax : Initialization; while(condition) { // statements  updation; }");
		System.out.println();
		System.out.println("e.g., program that print 1 to 5 numbers");
		int n = 1;
		while (n <= 5) {
			System.out.println(n);
			n++;
		}
	}
}
