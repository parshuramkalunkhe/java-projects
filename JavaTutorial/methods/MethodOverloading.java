package methods;

public class MethodOverloading {
	public void methodOverloading() {
		System.out.println("*Q. What is method overloading?");
		System.out.println("\t A class is having more than one method with same name byt different formal argument either differing length or either deffering datatype is known as method overloading.");
		System.out.println();
		System.out.println("* RULES ");
		System.out.println("\t1. The length of actual arguments & formal arguments must be same.");
		System.out.println("\t2. The corronsponding datatype of actual arguments & formal argument must be same");
		System.out.println("\t\t a. If same datatype is not available then compiler will try to do windening.");
		System.out.println("\t\t b. Suppose widening is also not possible then we get CTE (Compile Time Error.)");
		System.out.println("Widening : smaller --> bigger");
		System.out.println();
		System.out.println("e.g., Example of method overloading.");
		System.out.print(" Calling test() parameterized method by passing value 10 : ");
		test(10);
	}
	
	public void test(double d) {
		System.out.println("Double.");
	}
	
	public void test(char c) {
		System.out.println("Character.");
	}
}
