package operators;

public class ConditionalOperator {
	public void conditionalOperator() {
		System.out.println("It is used to take a decision between two values.");
		System.out.println("\tSyntax : Operand1 ? Operand2 : Operand3");
		System.out.println();
		System.out.println("*NOTE");
		System.out.println("Operand2 & Operand3 does not accept any statement hence, it is also known as semi-decision making statement.");
		System.out.println();
		System.out.println("e.g., a = 3; b = 21;");
		int a = 3, b = 21;
		System.out.println("Print true or false is a > b : " + (a > b ? true : false));
	}
}
