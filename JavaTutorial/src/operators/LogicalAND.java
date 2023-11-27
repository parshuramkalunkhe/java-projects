package operators;

public class LogicalAND {
	public void logicalAND() {
		System.out.println("It is used to combine two or more condition.");
		System.out.println("In Logical AND operator the result wil be true if the both operands are true.");
		System.out.println();
		System.out.println("Operand1\tOperand2\tResult");
		System.out.println("true\t\ttrue\t\ttrue");
		System.out.println("true\t\tfalse\t\tfalse");
		System.out.println("false\t\ttrue\t\tfalse");
		System.out.println("false\t\tfalse\t\tfalse");
		System.out.println();
		System.out.println("*NOTE");
		System.out.println("\tIn Logical AND Operator, if Operand 1 is true then output depends on Operand 2");
		System.out.println("\tIf Operand 1 is false then Operand 2 will not be executed.");
	}
}
