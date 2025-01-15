/*Write a program to convert the complete text to lowercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toUpperCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
Write a program to split the text into words and return the words along with their lengths in a 2D array

*/

import java.util.Scanner;

public class ConvertToLowerCase{
	
	//Creating method to convert string to lower case
	public static String toLowerCase(String str){
		String lcase = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
				lcase +=(char) (str.charAt(i)+32);
			}else{
				lcase +=str.charAt(i);
			}
		}
		return lcase;
	}
	//using equals method to compare string s1 and s2
	public static boolean toCompare(String s1 , String s2){
		return s1.equals(s2);
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the text : ");
		String str = input.nextLine();
		String lowercase = str.toLowerCase();
		String lowercaseUsingMethod = ConvertToLowerCase.toLowerCase(str);
		
		//showing output to the user
		System.out.println("Converted to lower case using user-defined method : " + lowercase);
		System.out.println("Converted to lower case using built-in method : " + lowercaseUsingMethod);
		
		//boolean check
		boolean check =  ConvertToLowerCase.toCompare(lowercase,lowercaseUsingMethod);
		if(check){
			System.out.println("Both conversion by using built-in method or by using charAt approch is correct");
		}else{
			System.out.println("Both conversion by using built-in method or by using charAt approch is not correct");
		
		}
	}
}