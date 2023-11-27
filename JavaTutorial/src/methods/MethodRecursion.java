package methods;

public class MethodRecursion {
	public void methodRecursion() {
		System.out.println("The method is calling it self is known as method recursion.");
		System.out.println("The process of executing same statements repeatadly is known as method recursion.");
		System.out.println();
		System.out.println("* Recursive Calling Statement");
		System.out.println("\t The statement which is responsible for recursion.");
		System.out.println();
		System.out.println("e.g., printing 5 to 1 without using loop but using method.");
		demo(5);
	}
	
	public void demo(int n) {
		if (n > 0) {
			System.out.println(n);
			demo(n-1);
		}
	}
}
