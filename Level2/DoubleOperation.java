/* 
Create a program to perform double precision operations on inputs a, b, and c.
Hint => 
1. Create variables a, b, c of double data type.
2. Take user input for a, b, and c using a Scanner object.
3. Compute the following operations:
   a. a + b * c
   b. a * b + c
   c. c + a / b
   d. a % b + c
4. Assign the results to variables and print them.
Understand operator precedence:
- Multiplication (*), division (/), and modulus (%) have higher precedence than addition (+).
- Parentheses can modify the default precedence if required.
I/P => a, b, c
O/P => The results of Double Operations are ___, ___, ___, and ___.
*/

import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        // Creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);

        // Taking input for variables a, b, and c
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Performing double precision operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Printing the results
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
