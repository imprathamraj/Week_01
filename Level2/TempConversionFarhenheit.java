/* 
Create a program to convert temperature from Celsius to Fahrenheit.
Hint => 
1. Create a variable `celsius` of double data type to store the input temperature in Celsius.
2. Use a Scanner object to take user input for the Celsius temperature.
3. Use the formula to convert Celsius to Fahrenheit:
   Fahrenheit = (Celsius * 9/5) + 32
4. Assign the result to a variable `fahrenheitResult` and print it.
I/P => celsius
O/P => The ___ Celsius is ___ Fahrenheit.
*/

import java.util.Scanner;

class TempConversionFarhenheit {
    public static void main(String[] args) {
        // Creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);

        // Taking input for temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Converting Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Printing the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
    }
}
