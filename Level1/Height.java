/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/
import java.util.Scanner;
class Height{
	public static void main(String [] args){
		//creating Sacanner class object for taking input
		Scanner input = new Scanner(System.in);
		
		//taking input
		double heightCm = input.nextDouble();
		
		//calculting height in feet
		double heightFt = heightCm / 30.48;
		
		//calculting height in inches
		double heightIn = heightCm / 2.54;
		
		//printing output
		System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFt + " and inches is " + heightIn );
	}
}