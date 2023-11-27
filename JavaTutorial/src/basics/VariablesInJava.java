package basics;

public class VariablesInJava {
    public void variablesInJava(){
		System.out.println("Variables : It is name given by the programmer to a block of memory which is used to store the data.");
		System.out.println();
		System.out.println("*Q. How to create a variable?");
		System.out.println("To create a variable we have to follow few steps.");
		System.out.println("1. Declaration");
		System.out.println("2. Initialization");
		System.out.println("3. Utilization");
		System.out.println();
		System.out.println("1. Declaration");
		System.out.println("\tIn this process we declare a block of memory with the help of datatype & variableName. e.g., a, hell_");
		System.out.println("\t Syntax: datatype variableName;");
		System.out.println();
		System.out.println("2. Initialization");
		System.out.println("\tWith the help of assignment operator we assign the values to the declared block.");
		System.out.println("\t Syntax: datatype variableName = literals; (= --> Assignment Operator.)");
		System.out.println();
		System.out.println("3. Utilization");
		System.out.println("\tWe utilizes the declared & initilize block.");
		System.out.println("\t Syntax: System.out.println(variableName);");
		System.out.println();
		System.out.println("There are two types of varibles.");
		System.out.println("1. Global Variable.");
		System.out.println("2. Local Variable.");
		System.out.println();
		System.out.println("1. Global Variable");
		System.out.println("\t Variable declared inside global area is known as global variable.");
		System.out.println("\t Global variable by default assign with default values.");
		System.out.println("\t NOTE : Global variables can be used in global area as well as in local area.");
		System.out.println("2. Local Variable.");
		System.out.println("\t Variable declared inside local area is known as local variable.");
		System.out.println("\t RULES : ");
		System.out.println("\t\t 1. We cannot use local variables without initialization.");
		System.out.println("\t\t 2. We cannot create local variables with same name.");
		System.out.println("\t\t 3. Local Variables by default cannot assign with default values.");
		System.out.println("\t\t 4. Local Variables cannot use inside gloabl area it can only used inside local area.");
    }
}
