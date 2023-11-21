package operators;

public class ArithmeticOperator {
	public void arithmeticOperator() {
		System.out.println("It is a binary operator which is used to perfom an arithmetic operation between two operands.");
		System.out.println("Operator\tOperation");
		System.out.println("+\t\tAddition");
		System.out.println("-\t\tSubtraction");
		System.out.println("*\t\tMultiplication");
		System.out.println("/\t\tDivision (Quotient)");
		System.out.println("%\t\tModulo");
		System.out.println();
		System.out.println("e.g.,");
		System.out.println("Addition of 10 + 20 : " + (10 + 20));
		System.out.println("Subtraction of 10 - 20 : " + (10 - 20));
		System.out.println("Multiplication of 10 * 20 : " + (10 * 20));
		System.out.println("Division of 10 / 20 : " + (10 / 20));
		System.out.println("Modulo of 10 % 20 : " + (10 % 20));
		System.out.println();
		System.out.println("*Concatination");
		System.out.println("\tWhenever we add anything with a String literal with the help of '+' operator.");
		System.out.println("\tThen the whole part will generate a new String, this process is known as concatination.");
		System.out.println();
		System.out.println("\te.g., adding hello string with 10 integer");
		System.out.println("\tOutput : Hello " + 10);
		System.out.println();
		System.out.println("Whenever we add two datatypes the result will always be store inside the bigger datatype.");
		System.out.println();
		System.out.println("byte + byte = int/long/float/double");
		System.out.println("short + byte = int/long/float/double");
		System.out.println("short + short = int/long/float/double");
		System.out.println("int + short = int/long/float/double");
		System.out.println("int + int = int/long/float/double");
		System.out.println("long + int = long/float/double");
		System.out.println("long + long = long/float/double");
		System.out.println("float + long = float/double");
		System.out.println("float + float = float/double");
		System.out.println("double + float = double");
		System.out.println("double + double = double");
	}
}
