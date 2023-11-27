package dms;

public class SimpleIf {
	public void simpleIf() {
		System.out.println("The Java Simple if statement tests the condition. It executes the if block if condition is true.");
		System.out.println("\tSyntax : if (condition) { // code or statements }");
		System.out.println();
		System.out.println("e.g., Check weather 7 is odd or not using simple if.");
		int number = 7;
		System.out.println("The Number : " + number);
		if (number % 2 != 0) {
			System.out.println("Ther Number is ODD.");
		} 
		if (number % 2 == 0) {
			System.out.println("The Number is EVEN.");
		}
	}
}
