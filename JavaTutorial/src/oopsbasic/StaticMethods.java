package oopsbasic;

public class StaticMethods {
	static int a = 25;
	public void staticMethods() {
		System.out.println("Any methods declared inside global area prefix with static keyword is known as static method also known as static context.");
		System.out.println("* NOTE : ");
		System.out.println("  1. All the methods block will be stored inside method area.");
		System.out.println("  2. Address of static method will be stored inside class static area.");
		System.out.println("  3. Static method is also known as static context.");
		System.out.println("  4. Every static context will be pointing towards class static area.");
		System.out.println("  5. Whenever we have local variable & static variable with same name.");
		System.out.println("\t\t 1. If we use directly high prirority given to local variable.");
		System.out.println("\t\t 2. If we want to use static variable then we need ClassName.");
		System.out.println("\t\t Syntax : ClassName.VariableName;");
		System.out.println();
		int a = 10;
		System.out.println("e.g., static int a = 25; // declared inside global area. int a = 10; // declared inside local area.");
		System.out.println("Directly printing will high prirority be given to local area. (a) : " + a);
		System.out.println("Using ClassName.VariableName; is given to global area. (a) : " + StaticMethods.a);
	}
}
