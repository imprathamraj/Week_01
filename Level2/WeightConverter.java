/*Create a program to convert weight in pounds to kilograms.
Hint => 1 pound = 2.2 kg
I/P => weight
O/P => The weight of the person in pound is ___ and in kg is ___
*/
import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        // Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking user input for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        // Conversion factor: 1 pound = 2.2 kilograms
        double kilograms = pounds * 2.2;

        // Displaying the result
        System.out.println("The weight of the person in pounds is " + pounds + " and in kilograms is " + kilograms);
    }
}
