package operators;

public class IncrementOperator {
	public void incrementOperator() {
		System.out.println("It is used to increase the value by 1.");
		System.out.println("Based on the position of the operator it is divided into 2 types.");
		System.out.println("\t1. Post Increment Operator.");
		System.out.println("\t2. Pre Increment Operator.");
		System.out.println();
		System.out.println("1. Post Increment Operator.");
		System.out.println("\tSyntax : variable++; ");
		System.out.println();
		System.out.println("Steps of Post Increment operator.");
		System.out.println("1. If there any operation use the current value.");
		System.out.println("2. Increase the value by 1.");
		System.out.println("3. Update the incremented value.");
		System.out.println();
		System.out.println("e.g.,");
		int a = 5;
		System.out.println("Variable a = " + a + ";");
		System.out.println("Varialbe a is while using post increment operator : " + a++);
		System.out.println("Varialbe a is after using post increment operator : " + a);
		System.out.println();
		System.out.println("2. Pre Increment Operator.");
		System.out.println("\tSyntax : ++variable;");
		System.out.println();
		System.out.println("Steps of Pre Increment Operator.");
		System.out.println("1. Increment the value by 1.");
		System.out.println("2. Update the increment value.");
		System.out.println("3. If there is any operation use the increment value.");
		System.out.println();
		System.out.println("e.g.,");
		a = 5;
		System.out.println("Variable a = " + a + ";");
		System.out.println("Varialbe a is while using pre increment operator : " + ++a);
		System.out.println("Varialbe a is after using pre increment operator : " + a);
	}
}
