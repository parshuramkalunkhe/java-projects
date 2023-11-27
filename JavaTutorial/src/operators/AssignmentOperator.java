package operators;

public class AssignmentOperator {
	public void assignmentOperator() {
		System.out.println(
				"It is a binary operator which is used to perform an arithmetic operation in a data that is stored inside a variables of assign the reuslt of the operation in the same variable.");
		System.out.println();
		System.out.println("Operators\tOperations");
		System.out.println("=\t\tAssignment");
		System.out.println("+=\t\tAddition & Assignment");
		System.out.println("-=\t\tSubtraction & Assignment");
		System.out.println("*=\t\tMultiplication & Assignment");
		System.out.println("/=\t\tDivision & Assignment");
		System.out.println("%=\t\tModulo & Assignment");
		System.out.println();
		System.out.println("e.g., Variable a is assigne with 10 literal.");
		int a = 10;
		System.out.println("Value of a variable after assignment : " + a);
		a += 10;
		System.out.println("Value of a variable after addition & assignment : " + a);
		a -= 10;
		System.out.println("Value of a vairable after subtraction & assignment : " + a);
		a *= 10;
		System.out.println("Value of a variable after Multiplication & assignment : " + a);
		a /= 10;
		System.out.println("Value of a variable after Division & assignment : " + a);
		a %= 10;
		System.out.println("Value of a variable after Modul0 & assignment : " + a);
		System.out.println();
		System.out.println(
				"Q. Supreet has 20000 balance in his account, he gave 200 to his friend, 1000 was added to his account as the whole year interest, Now calculate 10% of supreet available balance ?");
		System.out.println();
		double balance = 20000; // supreet balance

		balance -= 2000; // supreet gave to his friend
		System.out.println("balance -= 2000; " + balance + " // supreet gave to his friend");

		balance += 1000; // added as whole year interest
		System.out.println("balance += 1000; " + balance + " // added as whole year interest");

		balance *= 0.10; // 10% of available balance.
		System.out.println("balance *= 0.10; " + balance + " // 10% of available balance.");
		System.out.println();
		System.out.println("Available 10% balance in supreet account : " + balance);
	}
}
