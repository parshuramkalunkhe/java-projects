package dms;

public class Switch {
	public void switchCase() {
		System.out.println(
				"It is used to take a decision to execute a set of statements among multiple set of statement based on different values.");
		System.out.println(
				"\tSyntax : switch(expression){ case value1: //code to be executed;  break;  //optional case value2: //code to be executed;  break;  //optional  ......  default:  code to be executed if all cases are not matched; }");
		System.out.println();
		System.out.println("e.g.,Where we are printing month name for the given number that is 7.");
		// Specifying month number
		int month = 7;

		// Switch statement
		switch (month) {
		// case statements within the switch block
		case 1:
			System.out.println("1 - January");
			break;
		case 2:
			System.out.println("2 - February");
			break;
		case 3:
			System.out.println("3 - March");
			break;
		case 4:
			System.out.println("4 - April");
			break;
		case 5:
			System.out.println("5 - May");
			break;
		case 6:
			System.out.println("6 - June");
			break;
		case 7:
			System.out.println("7 - July");
			break;
		case 8:
			System.out.println("8 - August");
			break;
		case 9:
			System.out.println("9 - September");
			break;
		case 10:
			System.out.println("10 - October");
			break;
		case 11:
			System.out.println("11 - November");
			break;
		case 12:
			System.out.println("12 - December");
			break;
		default:
			System.out.println("Invalid Month!");
		}
	
		System.out.println();
		System.out.println("*NOTE");
		System.out.println("\t1. In switch input cannot be boolean, long, float & double.");
		System.out.println("\t2. break is not mandatory, we will use break when we want to execute a particular action ofor a particular option.");
		System.out.println("\t3. default is not mandatory, we will go for default when none of the option matches to the input.");
		System.out.println("\t4. Input & option can be of different type, but it should be convertible.");
		System.out.println("\t5. We cannot have duplicate options/values in case.");
	}
}
