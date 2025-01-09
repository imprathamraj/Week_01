/*Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/
import java.util.Scanner;
class Perimeter{
	public static void main(String[] args){
		//creating Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter perimeter = ");
		int perimeterOfSquare = input.nextInt();
		
		//calculating sideOfSquare
		int sideOfSquare = perimeterOfSquare / 4;
		
		//printing output
		System.out.println("The length of the side is " + sideOfSquare + " whose perimeter is " + perimeterOfSquare);
	}
}