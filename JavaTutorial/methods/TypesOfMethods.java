package methods;

public class TypesOfMethods {
	public void typesOfMethods() {
		System.out.println("There are two types of methods.");
		System.out.println(" 1. No Arguments Method");
		System.out.println(" 2. Parameterized Method (Arguments Method)");
		System.out.println();
		System.out.println("1. No Arguments Method");
		System.out.println(" A method which does not have any formal arguments are knows as no arguments method.");
		System.out.println(" Syntax : methodName(){} ");
		System.out.println(" e.g., add() method printing sum of two number that is num1 = 10, num2 = 20");
		add();
		System.out.println();
		System.out.println("2. Parameterized Method (Argument Method)");
		System.out.println(" A method which has formal arguments are know as parameterized methods also known as arguments methods.");
		System.out.println(" Syntax : methodName(datatype variableName){}");
		System.out.println(" e.g., sub(int num1, int num2) method printing subtraction of two numbers that is num1 = 20, num2 = 10");
		sub(20, 10);
		System.out.println();
		System.out.println("* Formal Arguments");
		System.out.println("\t Variable declared inside method are known as formal arguments");
		System.out.println("\t Syntax : methodName(datatype variableName) {}");
		System.out.println();
		System.out.println("* Actual Arguments");
		System.out.println("\t Data/Value pass inside method calling statement are known as actual arguments.");
		System.out.println("\t Syntax : methodName(data/value); // MCS - Method Calling Statements.");
	}
	
	public void add() {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
	}
	
	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}

}
