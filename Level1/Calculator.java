/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. 
The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/
import java.util.Scanner;
class Calculator{
	public static void main(String[] args){
		//creating Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		
		//taking input
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		
		//calculating addition, subtraction, multiplication and division
		double addition = number1 + number2;
		double subtraction = number1 - number2;
		double multiplication = number1 * number2;
		double division = number1 / number2;
		
		//printing output
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + "and " + division );
	}
}