/* 
Create a program to perform integer operations on inputs a, b, and c.
Hint => 
1. Create variables a, b, c of int data type.
2. Take user input for a, b, and c using a Scanner object.
3. Compute the following operations:
   a. a + b * c
   b. a * b + c
   c. c + a / b
   d. a % b + c
4. Assign the results to variables and print them.
Understand operator precedence:
- Multiplication (*) and division (/) have higher precedence than addition (+) and modulus (%).
- Parentheses can be used to modify the default precedence if required.
I/P => a, b, c
O/P => The results of Int Operations are ___, ___, ___, and ___.
*/

import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        // Creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);

        // Taking input for variables a, b, and c
        System.out.print("Enter value for a: ");
        int a = input.nextInt();

        System.out.print("Enter value for b: ");
        int b = input.nextInt();

        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Performing integer operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Printing the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
