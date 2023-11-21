package methods;

public class ReturnStatement {
	public void returnStatement() {
		System.out.println("It is control transfer statement.");
		System.out.println("It is used to return maximum one data from called method to calling method.");
		System.out.println();
		System.out.println("* RULES");
		System.out.println("\t1. return statement must be the last statement in method.");
		System.out.println("\t2. one method can have only one return statement.");
		System.out.println();
		System.out.println("* VOID");
		System.out.println("\t void is a return type. It is represents nothing.");
		System.out.println();
		System.out.println("* NOTE :");
		System.out.println("\t Any method is having void as return type then it is not mandatory to write return statement.");	
		System.out.println("\t It is any method is having other than void as a return type then it is mandatory to write return type.");
		System.out.println();
		System.out.println("* Q. What is return type?");
		System.out.println("\t When a method is returning any data then it is mandatory to specify what type of data the method is returning it is known as return type of a method.");
		System.out.println();
		System.out.println("e.g., add(int a, int b) method is returning addition of two formal arguments.");
		System.out.println("add(10, 20); = " + add(10, 20));
		System.out.println("* NOTE :");
		System.out.println("\t return type depends upon what kind of data/value or variable declared with datatype is return statement returning.");
		System.out.println("\t If return statement returning 10 (Number) Integer data so the return type of method must be int.");
	}
	
	public int add(int a, int b) {
		return a + b;
	}
}
