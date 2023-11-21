package dms;

public class LadderIfElse {
	public void ladderIfElse() {
		System.out.println("The if-else-if ladder statement executes one condition from multiple statements.");
		System.out.println("\tSyntax : if (condition) { // if block } else if (condition) { // else if block } else { // else block }");
		System.out.println();
		System.out.println("e.g.,It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+. Check whether the 81.60 % falls in which grade.");
		float percentage = 81.60f;
		
		if (percentage <= 100 && percentage >= 90) {
			System.out.println("Grade A+.");
		} else if (percentage <= 90 && percentage >= 80) {
			System.out.println("Grade A.");
		} else if (percentage <= 80 && percentage >= 70) {
			System.out.println("Grade B.");
		} else if (percentage <= 70 && percentage >= 60) {
			System.out.println("Grade C.");
		} else if (percentage <= 60 && percentage >= 35) {
			System.out.println("Grade D.");
		} else {
			System.out.println("Fail.");
		}
	}
}
