/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => Simple Interest = Principal * Rate * Time / 100
I/P => principal, rate, time
O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___
*/
import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Creating Scanner object for taking user input
        Scanner input = new Scanner(System.in);

        // Taking user input for Principal, Rate of Interest, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time period in years: ");
        double time = input.nextDouble();

        // Calculating Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("The Simple Interest is " + simpleInterest 
                           + " for Principal " + principal 
                           + ", Rate of Interest " + rate 
                           + " and Time " + time);
    }
}
