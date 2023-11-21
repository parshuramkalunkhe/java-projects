package basics;

public class TypeCastingInJava {
	public void typeCastingInJava() {
		System.out.println("The process of conveting one datatype into another datatype is known as typecasting.");
		System.out.println("There are 3 Types of typecasting.");
		System.out.println("1. Primitive Typecasting.  P --> P");
		System.out.println("2. Non-Primitive Typecasting. NP --> NP");
		System.out.println("3. Wrapper. P --> NP, NP --> p");
		System.out.println();
		System.out.println("In the basics of Java we will only see Primitive Tyepcasting then remaining.");
		System.out.println();
		System.out.println("1. Primitive Typecasting.");
		System.out.println("It is a process of converting primitive datatype into another primitive datatype.");
		System.out.println("Primitive typecasting is divided into two type.");
		System.out.println(" 1. Widening.");
		System.out.println(" 2. Narrowing.");
		System.out.println();
		System.out.println("1. Widening.");
		System.out.println("\tIt is process of converting smaller size primitive datatype into bigger size primitive datatype, it is also known as Implicit Typecasting.");
		System.out.println("\tNOTE : In widening there is no data loss will happen.");
		System.out.println("\te.g.,");
		System.out.println("\t\tbyte b = 100;\n\t\tshort s = b;\n\t\tSystem.out.println(s);");
		System.out.println();
		System.out.println("2. Narrowing.");
		System.out.println("\tIt is a process of converting bigger size primitive datatype into smaller size primitive datatype.");
		System.out.println("\tIt is also known as Explicit Typecasting.");
		System.out.println("\tNOTE : In narrowing there is a data loss will happen.");
		System.out.println("\tWe need to used typecast operator ().");
		System.out.println("\tTypecast Operator : It is an operator which is used to convert data from one type into another type.");
		System.out.println("\tSyntax : datatype variableName = (datatype) literal;");
		System.out.println("\te.g.,");
		System.out.println("\t\tshort s = 10000;\n\t\tbyte b = (byte) s;\n\t\tSystem.out.println(b);");
	}
}
