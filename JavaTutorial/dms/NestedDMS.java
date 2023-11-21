package dms;

public class NestedDMS {
	public void nestedDMS() {
		System.out.println(
				"The nested if statement represents the if block within another if block. Here, the inner if block condition executes only when outer if block condition is true.");
		System.out.println("\tSyntax : if (condition) { if (condition) { //code } }");
		System.out.println();
		System.out.println("e.g., check whether your eligible to donate blood or not.");
		// Creating two variables for age and weight
		int age = 25;
		int weight = 48;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}
}
