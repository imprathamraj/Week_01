/*
1. Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.
*/
import java.util.Scanner;

public class CountNoOfVowelsConsonants{
	publc int returnVowelsCount(String s){
		for (int i = 0; i < s.length() ; i++){
			int count = 0;
			if(charAt[i] == 'a','e','i','o','u'){
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String s = input.nextLine();
		
		CountNoOfVowelsConsonants obj = new CountNoOfVowelsConsonants();
		System.out.print("Number of vowels are : " + obj.returnVowelsCount());
		System.out.print("Number of consonants are : " + s.length() - obj.returnVowelsCount);
	}
}