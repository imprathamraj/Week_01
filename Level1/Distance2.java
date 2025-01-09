/*Create a program to convert distance in kilometers to miles.
Hint => 
Create a variable km and assign type as double as in double km;
Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
Use Scanner Object to take user input for km as in km = input.nextInt();
Use 1 mile = 1.6 km formulae to calculate miles and show the output
I/P => km
O/P => The total miles is ___ mile for the given ___ km
*/
import java.util.Scanner;
class Distance2{
	public static void main(String[] args){
		//creating Scanner class object for taking input
		Scanner input = new Scanner(System.in);

		//taking input
	    System.out.print("Enter distance: ");
		double distanceKm = input.nextDouble();
		
		//calculating distance in miles
		double distanceMiles = distanceKm * 0.621371;
		
		//printing output
		System.out.println("The total miles is " + distanceMiles + " mile for the given " +distanceKm + " km ");
	}
}
