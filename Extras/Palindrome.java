/*3. Palindrome String Check
Problem:
Write a Java program to check if a given string is a palindrome (a string that reads the
same forward and backward).
*/
import java.util.Scanner;

public class Palindrome{
	//method to check a string is palindrome or not
	public boolean checkPalindrome(String s){
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		
		//Taking input from user for string
		System.out.print("Enter the string : ");
		String s =  input.nextLine();
		
		//Returing output
		Palindrome obj = new Palindrome();
		System.out.print(obj.checkPalindrome(s));
		
	}
}