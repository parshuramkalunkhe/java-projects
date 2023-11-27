package operators;

public class DecrementOperator {
	public void decrementOperator() {
		System.out.println("It is used to increase the value by 1.");
		System.out.println("Based on the position of the operator it is divided into 2 types.");
		System.out.println("\t1. Post Decrement Operator.");
		System.out.println("\t2. Pre Decrement Operator.");
		System.out.println();
		System.out.println("1. Post Decrement Operator.");
		System.out.println("\tSyntax : variable--; ");
		System.out.println();
		System.out.println("Steps of Post Decrement operator.");
		System.out.println("1. If there any operation use the current value.");
		System.out.println("2. Decrease the value by 1.");
		System.out.println("3. Update the decremented value.");
		System.out.println();
		System.out.println("e.g.,");
		int a = 5;
		System.out.println("Variable a = " + a + ";");
		System.out.println("Varialbe a is while using post decrement operator : " + a--);
		System.out.println("Varialbe a is after using post decrement operator : " + a);
		System.out.println();
		System.out.println("2. Pre Decrement Operator.");
		System.out.println("\tSyntax : --variable;");
		System.out.println();
		System.out.println("Steps of Pre Decrement Operator.");
		System.out.println("1. Decrement the value by 1.");
		System.out.println("2. Update the decremented value.");
		System.out.println("3. If there is any operation use the decrement value.");
		System.out.println();
		System.out.println("e.g.,");
		a = 5;
		System.out.println("Variable a = " + a + ";");
		System.out.println("Varialbe a is while using pre decrement operator : " + --a);
		System.out.println("Varialbe a is after using pre decrement operator : " + a);
	}
}
