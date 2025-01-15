/*2. Reverse a String
Problem:
Write a Java program to reverse a given string without using any built-in reverse
functions.
*/
import java.util.Scanner;

public class ReverseString {
	//creating method for reversing string
    public static String reversedString(String s) {
		//creating temperoary string temp
        String temp = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            temp += s.charAt(i);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//Taking input form the user
        System.out.print("Enter the string: ");
        String s = input.nextLine();

        ReverseString obj = new ReverseString();
		//Returing output to the user
        System.out.println("Reversed string: " + obj.reversedString(s));
    }
}