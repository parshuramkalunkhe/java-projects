
// Importing Statements.
import java.util.InputMismatchException;
import java.util.Scanner;

// Import Java Tutorial Folders
import basics.*;
import operators.*;
import dms.*;
import loops.*;
import methods.*;
import oopsbasic.*;

public class JavaTutorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(" ** Welcome to Java Tutorial. ** ");
		System.out.println("---------------------------------");
		System.out.println("1. Basics.");
		System.out.println("2. Operators.");
		System.out.println("3. DMS (Decision Making Statements).");
		System.out.println("4. Loops.");
		System.out.println("5. Methods.");
		System.out.println("6. Fundamentals of OOPs.");
		System.out.println("Press 0 for exit.");
		try {
			System.out.println("---------------------------------");
			System.out.print("Enter Your Choice : ");
			int choice = input.nextInt();
			System.out.println("---------------------------------");

			switch (choice) {
			case 1:
				basics();
				break;
			case 2:
				operators();
				break;
			case 3:
				dms();
				break;
			case 4:
				loops();
				break;
			case 5:
				methods();
				break;
			case 6:
				oopsbasic();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}

		} catch (InputMismatchException ie) {
			System.out.println("Input mis Match Exceptio : Please Enter Numbers Only.");
			main(null);
		}
		input.close();
	}

	public static void basics() {
		Scanner input = new Scanner(System.in);
		StructureOfJava structureOfJava = new StructureOfJava();
		StagesOfJava stagesOfJava = new StagesOfJava();
		TokensInJava tokensInJava = new TokensInJava();
		DataTypesInJava dataTypesInJava = new DataTypesInJava();
		VariablesInJava variablesInJava = new VariablesInJava();
		TypeCastingInJava typeCastingInJava = new TypeCastingInJava();
		CTS cts = new CTS();
		Comments comments = new Comments();
		UnicodeSystem unicodeSystem = new UnicodeSystem();

		System.out.println(" ** Welcome to Basics Of Java. ** ");
		System.out.println("----------------------------------");
		System.out.println("1. Structure Of Java.");
		System.out.println("2. Stages Of Java.");
		System.out.println("3. Tokens in Java.");
		System.out.println("4. Data Types in Java");
		System.out.println("5. Variables In Java.");
		System.out.println("6. Tyepcasting In Java.");
		System.out.println("7. Control Transfer Statement In Java.");
		System.out.println("8. Comments");
		System.out.println("9. Unicode System In Java.");
		System.out.println("Press 0 for exit.");
		System.out.println("Press 99 for previous menu.");
		System.out.println("----------------------------------");
		System.out.print("Enter Your Choice : ");
		int choice = input.nextInt();
		System.out.println("----------------------------------");

		switch (choice) {

		case 1:
			System.out.println(" ** Structure Of Java ** ");
			System.out.println("----------------------------------");
			structureOfJava.structureOfJava();
			exit();
			break;

		case 2:
			System.out.println(" ** Stages Of Java ** ");
			System.out.println("----------------------------------");
			stagesOfJava.stagesOfJava();
			exit();
			break;

		case 3:
			System.out.println(" ** Tokens In Java ** ");
			System.out.println("----------------------------------");
			tokensInJava.tokensInJava();
			exit();
			break;

		case 4:
			System.out.println(" ** Data Types In Java ** ");
			System.out.println("----------------------------------");
			dataTypesInJava.dataTypesInJava();
			exit();
			break;

		case 5:
			System.out.println(" ** Variables In Java ** ");
			System.out.println("----------------------------------");
			variablesInJava.variablesInJava();
			exit();
			break;

		case 6:
			System.out.println(" ** Type Casting In Java ** ");
			System.out.println("----------------------------------");
			typeCastingInJava.typeCastingInJava();
			exit();
			break;
			
		case 7:
			System.out.println(" ** Control Transfer Statements In Java ** ");
			System.out.println("----------------------------------");
			cts.cts();
			exit();
			break;
			
		case 8:
			System.out.println(" ** Control Transfer Statements In Java ** ");
			System.out.println("----------------------------------");
			comments.comments();
			exit();
			break;
			
		case 9:
			System.out.println(" ** Unicode Statements In Java ** ");
			System.out.println("----------------------------------");
			unicodeSystem.unicodeSystem();
			exit();
			break;

		case 0:
			System.exit(0);
			break;

		case 99:
			main(null);
			break;

		default:
			System.out.println("Invalid input.");
			basics();
			break;

		}
		input.close();
	}

	public static void operators() {
		Scanner input = new Scanner(System.in);
		Operators operators = new Operators();
		ArithmeticOperator arithmeticOperator = new ArithmeticOperator();
		AssignmentOperator assignmentOperator = new AssignmentOperator();
		IncrementOperator incrementOperator = new IncrementOperator();
		DecrementOperator decrementOperator = new DecrementOperator();
		LogicalNOT logicalNOT = new LogicalNOT();
		RelationalOperator relationalOperator = new RelationalOperator();
		LogicalAND logicalAND = new LogicalAND();
		LogicalOR logicalOR = new LogicalOR();
		ConditionalOperator conditionalOperator = new ConditionalOperator();

		System.out.println(" ** Welcome to Operators In Java. ** ");
		System.out.println("----------------------------------");
		System.out.println("1. Operators in Java.");
		System.out.println("2. Arithmetic Operator.");
		System.out.println("3. Assignment Operator.");
		System.out.println("4. Increment Operator.");
		System.out.println("5. Decrement Operator.");
		System.out.println("6. Logical NOT (!) Operator.");
		System.out.println("7. Relational Operator.");
		System.out.println("8. Logical AND (&&) Operator.");
		System.out.println("9. Logical OR (||) Operator.");
		System.out.println("10. Conditional Operator.");
		System.out.println("----------------------------------");
		System.out.println("Press 0 for exit.");
		System.out.println("Press 99 for previous menu.");
		System.out.println("----------------------------------");
		System.out.print("Enter Your Choice : ");
		int choice = input.nextInt();
		System.out.println("----------------------------------");

		switch (choice) {

		case 1:
			System.out.println(" ** Operators In Java ** ");
			System.out.println("----------------------------------");
			operators.operators();
			exit();
			break;

		case 2:
			System.out.println(" ** Arithmetic Operator In Java ** ");
			System.out.println("----------------------------------");
			arithmeticOperator.arithmeticOperator();
			exit();
			break;

		case 3:
			System.out.println(" ** Assignment Operator In Java ** ");
			System.out.println("----------------------------------");
			assignmentOperator.assignmentOperator();
			exit();
			break;

		case 4:
			System.out.println(" ** Increment Operator In Java ** ");
			System.out.println("----------------------------------");
			incrementOperator.incrementOperator();
			exit();
			break;

		case 5:
			System.out.println(" ** Decrement Operator In Java ** ");
			System.out.println("----------------------------------");
			decrementOperator.decrementOperator();
			exit();
			break;

		case 6:
			System.out.println(" ** Logical NOT (!) Operator In Java ** ");
			System.out.println("----------------------------------");
			logicalNOT.logicalNOT();
			exit();
			break;

		case 7:
			System.out.println(" ** Relational Operator In Java ** ");
			System.out.println("----------------------------------");
			relationalOperator.relationalOperator();
			exit();
			break;

		case 8:
			System.out.println(" ** Logical AND (&&) Operator In Java ** ");
			System.out.println("----------------------------------");
			logicalAND.logicalAND();
			exit();
			break;

		case 9:
			System.out.println(" ** Logical OR (||) Operator In Java ** ");
			System.out.println("----------------------------------");
			logicalOR.logicalOR();
			exit();
			break;

		case 10:
			System.out.println(" ** Conditional Operator In Java ** ");
			System.out.println("----------------------------------");
			conditionalOperator.conditionalOperator();
			exit();
			break;

		case 0:
			System.exit(0);
			break;

		case 99:
			main(null);
			break;

		default:
			System.out.println("Invalid Input.");
			operators();
			break;
		}

		input.close();
	}

	public static void dms() {

		Scanner input = new Scanner(System.in);
		DMS dms = new DMS();
		SimpleIf simpleIf = new SimpleIf();
		IfElse ifElse = new IfElse();
		LadderIfElse ladderIfElse = new LadderIfElse();
		NestedDMS nestedDMS = new NestedDMS();
		Switch switchCase = new Switch();

		System.out.println(" ** Welcome to DMS In Java. ** ");
		System.out.println("----------------------------------");
		System.out.println("1. Decision Making Statements (DMS) in Java.");
		System.out.println("2. Simple if in Java.");
		System.out.println("3. if else in Java.");
		System.out.println("4. Ladder if else in Java.");
		System.out.println("5. Nested Decision Making Statement in Java.");
		System.out.println("6. Switch in Java.");
		System.out.println("----------------------------------");
		System.out.println("Press 0 for exit.");
		System.out.println("Press 99 for previous menu.");
		System.out.println("----------------------------------");
		System.out.print("Enter Your Choice : ");
		int choice = input.nextInt();
		System.out.println("----------------------------------");

		switch (choice) {

		case 1:
			System.out.println(" ** Decision Making Statements (DMS) ** ");
			System.out.println("----------------------------------");
			dms.dms();
			exit();
			break;

		case 2:
			System.out.println(" ** Simple if in Java ** ");
			System.out.println("----------------------------------");
			simpleIf.simpleIf();
			exit();
			break;

		case 3:
			System.out.println(" ** if else in Java ** ");
			System.out.println("----------------------------------");
			ifElse.ifElse();
			exit();
			break;

		case 4:
			System.out.println(" ** Ladder if else in Java ** ");
			System.out.println("----------------------------------");
			ladderIfElse.ladderIfElse();
			exit();
			break;

		case 5:
			System.out.println(" ** Nested Decision Making Statement in Java ** ");
			System.out.println("----------------------------------");
			nestedDMS.nestedDMS();
			exit();
			break;

		case 6:
			System.out.println(" ** Switch in Java ** ");
			System.out.println("----------------------------------");
			switchCase.switchCase();
			exit();
			break;

		case 0:
			System.exit(0);
			break;

		case 99:
			main(null);
			break;

		default:
			System.out.println("Invalid Input.");
			dms();
			break;
		}

		input.close();
	}

	public static void loops() {
		Scanner input = new Scanner(System.in);
		Loops loops = new Loops();
		WhileLoop whileLoop = new WhileLoop();
		DoWhileLoop doWhileLoop = new DoWhileLoop();
		ForLoop forLoop = new ForLoop();
		
		System.out.println(" ** Welcome to Loops In Java. ** ");
		System.out.println("----------------------------------");
		System.out.println("1. Loops in Java.");
		System.out.println("2. While loop in Java.");
		System.out.println("3. Do While loop in Java.");
		System.out.println("4. For loop in Java.");
		System.out.println("----------------------------------");
		System.out.println("Press 0 for exit.");
		System.out.println("Press 99 for previous menu.");
		System.out.println("----------------------------------");
		System.out.print("Enter Your Choice : ");
		int choice = input.nextInt();
		System.out.println("----------------------------------");

		switch (choice) {
		case 1:
			System.out.println(" ** Loops in Java ** ");
			System.out.println("----------------------------------");
			loops.loops();
			exit();
			break;
			
		case 2:
			System.out.println(" ** While Loop in Java ** ");
			System.out.println("----------------------------------");
			whileLoop.whileLoop();
			exit();
			break;
			
		case 3:
			System.out.println(" ** Do While Loop in Java ** ");
			System.out.println("----------------------------------");
			doWhileLoop.doWhileLoop();
			exit();
			break;
			
		case 4:
			System.out.println(" ** For Loop in Java ** ");
			System.out.println("----------------------------------");
			forLoop.forLoop();
			exit();
			break;

		case 0:
			System.exit(0);
			break;

		case 99:
			main(null);
			break;

		default:
			System.out.println("Invalid Input.");
			loops();
			break;
		}

		input.close();
	}

	public static void methods() {
		
		Scanner input = new Scanner(System.in);
		Methods methods = new Methods();
		TypesOfMethods typesOfMethods = new TypesOfMethods();
		ReturnStatement returnStatement = new ReturnStatement();
		MethodOverloading methodOverloading = new MethodOverloading();
		MethodRecursion methodRecursion = new MethodRecursion();
		
		System.out.println(" ** Welcome to Methods In Java. ** ");
		System.out.println("----------------------------------");
		System.out.println("1. Methods in Java.");
		System.out.println("2. Types of Methods in Java.");
		System.out.println("3. Return Statement in Java.");
		System.out.println("4. Method Overloading in Java.");
		System.out.println("5. Method Recursion in Java.");
		System.out.println("----------------------------------");
		System.out.println("Press 0 for exit.");
		System.out.println("Press 99 for previous menu.");
		System.out.println("----------------------------------");
		System.out.print("Enter Your Choice : ");
		int choice = input.nextInt();
		System.out.println("----------------------------------");

		switch (choice) {
		case 1:
			System.out.println(" ** Methods in Java ** ");
			System.out.println("----------------------------------");
			methods.methods();
			exit();
			break;

		case 2:
			System.out.println(" ** Types Of Methods in Java ** ");
			System.out.println("----------------------------------");
			typesOfMethods.typesOfMethods();
			exit();
			break;
			
		case 3:
			System.out.println(" ** Types Of Methods in Java ** ");
			System.out.println("----------------------------------");
			returnStatement.returnStatement();
			exit();
			break;
			
		case 4:
			System.out.println(" ** Method Overloading in Java ** ");
			System.out.println("----------------------------------");
			methodOverloading.methodOverloading();
			exit();
			break;
			
		case 5:
			System.out.println(" ** Method Recursion in Java ** ");
			System.out.println("----------------------------------");
			methodRecursion.methodRecursion();
			exit();
			break;
			
		case 0:
			System.exit(0);
			break;

		case 99:
			main(null);
			break;

		default:
			System.out.println("Invalid Input.");
			methods();
			break;
		}

		input.close();			
		
	}
	
	public static void oopsbasic() {
		
		Scanner input = new Scanner(System.in);
		OOPSBasics oopsBasics = new OOPSBasics();
		StaticVariables staticVariables = new StaticVariables();
		StaticMethods staticMethods = new StaticMethods();
		StaticBlock staticBlock = new StaticBlock();
		NonStaticVariable nonStaticVariable = new  NonStaticVariable();
		NonStaticMethod nonStaticMethod = new NonStaticMethod();
		NonStaticBlock nonStaticBlock = new NonStaticBlock();
		Constructor constructor = new Constructor();
		
		System.out.println(" ** Welcome to Methods In Java. ** ");
		System.out.println("----------------------------------");
		System.out.println("1. Fundamentals Of OOPs in Java.");
		System.out.println("2. Static Variables in Java.");
		System.out.println("3. Static Methods in Java.");
		System.out.println("4. Static Block in Java.");
		System.out.println("5. Non Static Variable in Java.");
		System.out.println("6. Non Static Method in Java.");
		System.out.println("7. Non Static Block in Java.");
		System.out.println("8. Constructor in Java.");
		System.out.println("----------------------------------");
		System.out.println("Press 0 for exit.");
		System.out.println("Press 99 for previous menu.");
		System.out.println("----------------------------------");
		System.out.print("Enter Your Choice : ");
		int choice = input.nextInt();
		System.out.println("----------------------------------");

		switch (choice) {
		case 1:
			System.out.println(" ** Fundamentals Of OOPs in Java ** ");
			System.out.println("----------------------------------");	
			oopsBasics.oopsBasics();
			exit();
			break;
			
		case 2:
			System.out.println(" ** Static Variables in Java ** ");
			System.out.println("----------------------------------");	
			staticVariables.staticVariables();
			exit();
			break;
			
		case 3:
			System.out.println(" ** Static Methods in Java ** ");
			System.out.println("----------------------------------");	
			staticMethods.staticMethods();
			exit();
			break;
			
		case 4:
			System.out.println(" ** Static Block in Java ** ");
			System.out.println("----------------------------------");	
			staticBlock.staticBlock();
			exit();
			break;
			
		case 5:
			System.out.println(" ** Non Static Variable in Java ** ");
			System.out.println("----------------------------------");	
			nonStaticVariable.nonStaticVariable();
			exit();
			break;
			
		case 6:
			System.out.println(" ** Non Static Method in Java ** ");
			System.out.println("----------------------------------");	
			nonStaticMethod.nonStaticMethod();
			exit();
			break;
			
		case 7:
			System.out.println(" ** Non Static Block in Java ** ");
			System.out.println("----------------------------------");	
			nonStaticBlock.nonStaticBlock();
			exit();
			break;
			
		case 8:
			System.out.println(" ** Constructor in Java ** ");
			System.out.println("----------------------------------");	
			constructor.constructor();
			exit();
			break;
			
		case 0:
			System.exit(0);
			break;

		case 99:
			main(null);
			break;

		default:
			System.out.println("Invalid Input.");
			methods();
			break;
		}

		input.close();	
	}
	
	public static void exit() {
		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("----------------------------------");
		System.out.println("Press 0 for exit.");
		System.out.println("Press 99 for go to main menu.");
		System.out.println("----------------------------------");

		try {
			System.out.print("Enter Your Choice : ");
			choice = input.nextInt();
			System.out.println("----------------------------------");
			if (0 == choice) {
				System.exit(0);
			} else if (99 == choice) {
				main(null);
			} else {
				System.out.println("Invalid Input.");
			}
		} catch (InputMismatchException ie) {
			System.out.println("Input mis Match Exceptio : Please Enter Numbers Only.");
			exit();
		}

		input.close();
	}
}
