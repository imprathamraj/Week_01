/*
Create a program to swap two numbers.
Hint => 
1. Create a variable `number1` and take user input for it.
2. Create a variable `number2` and take user input for it.
3. Swap the values of `number1` and `number2` using a temporary variable or arithmetic operations.
4. Print the swapped values.
I/P => number1, number2
O/P => The swapped numbers are ___ and ___
*/

import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for number1
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Taking user input for number2
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Swapping the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Printing the swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
