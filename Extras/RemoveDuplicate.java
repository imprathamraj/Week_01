/*4. Remove Duplicates from a String
Problem:
Write a Java program to remove all duplicate characters from a given string and return
the modified string.
*/
import java.util.Scanner;

public class RemoveDuplicate{
	//creating method removing Duplicates from Characters
	public static String removingDuplicatesCharacters(String s){
		String stringWithoutDuplicates = "";
		for (int i = 0 ; i<s.length() ; i++){
			if(s.charAt(i) != s.charAt(i+1){
				stringWithoutDuplicates += s.charAt(i);
			}
			else{
				
			}
		}
		return stringWithoutDuplicates;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//taking input from the user for sring
		System.out.println("Enter the string : ");
		String s = input.nextLine();
		
		RemoveDuplicate obj = new RemoveDuplicate();
		
		//displaying output to user
		System.out.print("String without duplicacy : " + obj.removingDuplicatesCharacters(s));
	}
}