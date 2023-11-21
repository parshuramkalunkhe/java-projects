package loops;

public class ForLoop {
	public void forLoop() {
		System.out.println("It is used to iterate a part of the program several times.");
		System.out.println("If the number of iteration is fixed, it is recommended to use for loop.");
		System.out.println("It consists of four parts:");
		System.out.println("1. Initialization");
		System.out.println("2. Condition");
		System.out.println("3. Increment/Decrement");
		System.out.println("4. Statement");
		System.out.println();
		System.out.println("Syntax : for (Initialization; Condition; Updation) { // statements } ");
		System.out.println();
		System.out.println("e.g., program which prints table of 1.");
		for (int i = 1; i <= 10; i++) {
			System.out.println("1 X " + i + " = " + i);
		}
	}
}
