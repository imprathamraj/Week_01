/*Write a program to find vowels and consonants in a string and display the character type - Vowel, Consonant, or Not a Letter
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to find vowels and consonants in a string using charAt() method and return the character and vowel or consonant in a 2D array
Create a Method to display the 2D Array of Strings in a Tabular Format
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/

import java.util.Scanner;

public class CheckVowelConsonant {

    // Creating method to check the character
    public static String checkCharacter(char ch) {
        // Converting to lowercase
        char lowerCh = Character.toLowerCase(ch);

        // Checking if the character is a letter
        if (lowerCh >= 'a' && lowerCh <= 'z') {
            // Check if the character is a vowel
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Creating method to find vowels and consonants in a string and return a 2D array
    public static String[][] findVowelsAndConsonants(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch); 
            result[i][1] = checkCharacter(ch);
        }
        return result;
    }

    // Creating method to display the 2D array 
    public static void displayResult(String[][] result) {
        System.out.print("Character             Type\n");
        System.out.println("------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i][0]+ "   "+ result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        // Finding vowels and consonants in the string
        String[][] result = findVowelsAndConsonants(Input);

        // Displaying the result in a tabular format
        displayResult(result);

       sc.close();
    }
}
