/* 
Create a program to take two numbers and print their quotient and remainder.
Hint => 
Create variables for the two numbers as int, e.g., int num1 and int num2.
Create a Scanner object to take user input from the keyboard, e.g., Scanner input = new Scanner(System.in);
Use division operator (/) to calculate the quotient and modulus operator (%) to calculate the remainder.
Print the quotient and remainder using a formatted output statement.
I/P => number1, number2
O/P => The Quotient is ___ and Remainder is ___ of two numbers ___ and ___.
*/

import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        // Creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);

        // Taking input for two numbers
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Calculating quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Printing the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                " of two numbers " + num1 + " and " + num2);
    }
}
