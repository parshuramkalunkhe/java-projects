package dms;

public class IfElse {
	public void ifElse() {
		System.out.println("The Java if-else statement also tests the condition. It executes the if block if condition is true otherwise else block is executed.");
		System.out.println("\tSyntax : if(condition) { //code if condition is true } else { //code if condition is false } ");
		System.out.println();
		System.out.println("e.g., Check whether 'y' character is vowel or consonant.");
		char character = 'y';
		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println("The character " + character + " is vowel.");
		} else {
			System.out.println("The character " + character + " is consonant.");
		}
	}
}
