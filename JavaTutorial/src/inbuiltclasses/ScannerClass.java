package inbuiltclasses;

import java.util.Scanner;

public class ScannerClass {
	public void scannerClass() {
		System.out.println("Scanner is a class present insdide java.util package.");
		System.out.println("Scanner class is a final class in other owrd we cannot have any sub class.");	
		System.out.println("Scanner class is used to take input from the user.");
		System.out.println("Scanner class consists of many non-static methods like:");
		System.out.println(" 1).byte - nextByte()");
		System.out.println(" 2) short - nextShort()");
		System.out.println(" 3) int - nextInt()");
		System.out.println(" 4) long - nextLong()");
		System.out.println(" 5) float - nextFloat()");
		System.out.println(" 6) double - nextDouble()");
		System.out.println(" 7) boolean - nextBoolean()");
		System.out.println(" 8) String - next(), nextLine()");
		System.out.println();
		System.out.println("e.g., Taking input from user and print it.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Data : ");
		String data = sc.nextLine();
		System.out.println("User Input Data : " + data);
	}
}
