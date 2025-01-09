/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/

import java.util.Scanner;

public class MaxHandshake {
    public static void main(String[] args) {
		//creating Scanner class object for taking input
        Scanner input= new Scanner(System.in);

		//taking input from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
		
		//calculating number of handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		//printing output
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);
	}
}