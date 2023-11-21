package basics;

import java.io.*;

/**
 * <h2>Calculation of numbers</h2> This program implements an application to
 * perform operation such as addition of numbers and print the result
 * <p>
 * <b>Note:</b> Comments make the code readable and easy to understand.
 * 
 * @author Anurati
 * @version 16.0
 * @since 2021-07-06
 */

public class Comments {
	public void comments() {
		System.out.println(
				"The Java comments are the statements in a program that are not executed by the compiler and interpreter.");
		System.out.println();
		System.out.println("Why do we use comments in a code?");
		System.out
				.println(" 1. Comments are used to make the program more readable by adding the details of the code.");
		System.out.println(" 2. It makes easy to maintain the code and to find the errors easily.");
		System.out.println(
				" 3. The comments can be used to provide information or explanation about the variable, method, class, or any statement.");
		System.out.println(
				" 4. It can also be used to prevent the execution of program code while testing the alternative code.");
		System.out.println();
		System.out.println("Types of Java Comments");
		System.out.println("There are three types of comments in Java.");
		System.out.println("1. Single Line Comment");
		System.out.println("2. Multi Line Comment");
		System.out.println("3. Documentation Comment");
		System.out.println();
		System.out.println("1. Java Single Line Comment");
		System.out.println(
				" The single-line comment is used to comment only one line of the code. It is the widely used and easiest way of commenting the statements.");
		System.out.println(
				" Single line comments starts with two forward slashes (//). Any text in front of // is not executed by Java.");
		System.out.println();
		System.out.println("2. Java Multi Line Comment");
		System.out.println(
				" The multi-line comment is used to comment multiple lines of code. It can be used to explain a complex code snippet or to comment multiple lines of code at a time (as it will be difficult to use single-line comments there).");
		System.out.println(
				" Multi-line comments are placed between /* and */. Any text between /* and */ is not executed by Java.");
		System.out.println();
		System.out.println("3. Java Documentation Comment");
		System.out.println(
				" Documentation comments are usually used to write large programs for a project or software application as it helps to create documentation API. These APIs are needed for reference, i.e., which classes, methods, arguments, etc., are used in the code.");
		System.out.println(
				" To create documentation API, we need to use the javadoc tool. The documentation comments are placed between /** and */.");
		System.out.println();
		System.out.println("javadoc tags");
		System.out.println("Some of the commonly used tags in documentation comments:");
		System.out.println();
		System.out.println("Tag : Syntax : Description");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"{@docRoot} : {@docRoot} : To depict relative path to root directory of generated document from any page.");
		System.out.println("@author : @author name - text : To add the author of the class.");
		System.out.println(
				"@code : {@code text} : To show the text in code font without interpreting it as html markup or nested javadoc tag.");
		System.out.println(
				"@version : @version version-text : To specify \"Version\" subheading and version-text when -version option is used.");
		System.out.println(
				"@since : @since release : To add \"Since\" heading with since text to generated documentation.");
		System.out.println(
				"@param : @param parameter-name description : To add a parameter with given name and description to 'Parameters' section.");
		System.out.println(
				"@return : @return description : Required for every method that returns something (except void)");
		System.out.println();
		System.out.println("e.g., calculate with documentation comments.");
		calculate();
	}

	/**
	 * This method calculates the summation of two integers.
	 * 
	 * @param input1 This is the first parameter to sum() method
	 * @param input2 This is the second parameter to the sum() method.
	 * @return int This returns the addition of input1 and input2
	 */
	public int sum(int input1, int input2) {
		return input1 + input2;
	}

	/**
	 * This is the main method uses of sum() method.
	 * 
	 * @param args Unused
	 * @see IOException
	 */

	public void calculate() {
 
        int result = sum(40, 20);  
  
        System.out.println("Addition of numbers: " + result); 
	}
}
