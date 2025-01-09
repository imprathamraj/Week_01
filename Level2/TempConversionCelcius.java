/* 
Create a program to convert temperature from Fahrenheit to Celsius.
Hint => 
1. Create a variable `fahrenheit` of double data type to store the input temperature in Fahrenheit.
2. Use a Scanner object to take user input for the Fahrenheit temperature.
3. Use the formula to convert Fahrenheit to Celsius:
   Celsius = (Fahrenheit - 32) * 5/9
4. Assign the result to a variable `celsiusResult` and print it.
I/P => fahrenheit
O/P => The ___ Fahrenheit is ___ Celsius.
*/

import java.util.Scanner;

class TempConversionCelcius {
    public static void main(String[] args) {
        // Creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);

        // Taking input for temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Printing the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
