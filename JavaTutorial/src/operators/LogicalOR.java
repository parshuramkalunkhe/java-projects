package operators;

public class LogicalOR {
	public void logicalOR() {
		System.out.println("In logical OR operator the result will be true if any one of the operatoris true.");
		System.out.println();
		System.out.println("Operand1\tOperand2\tResult");
		System.out.println("true\t\ttrue\t\ttrue");
		System.out.println("true\t\tfalse\t\ttrue");
		System.out.println("false\t\ttrue\t\ttrue");
		System.out.println("false\t\tfalse\t\tfalse");
		System.out.println();
		System.out.println("*NOTE");
		System.out.println("\tIn Logical OR Operator, if Operand 1 is false then output depends on Operand 2");
		System.out.println("\tIf Operand 1 is true then Operand 2 will not be executed.");
	}
}
