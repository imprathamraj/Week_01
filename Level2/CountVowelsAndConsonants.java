/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 

*/
import java.util.Scanner;

class CountVowelsAndConsonants{
       public static void main(String[] args){
		    // Creating Scanner class object sc to take input
            Scanner sc =  new Scanner(System.in);
            String string = sc.next();
            int count = 0;
            string = string.toLowerCase();
			//Using for loop 
            for(int i=0;i<string.length();i++){
                  char ch = string.charAt(i);
                  if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ){
                       count++;}
            }
			//Displaying output to user
            System.out.println("count of vowels is : "+count);
            System.out.println("count of consonants is : "+ (string.length()-count));
       }
}   