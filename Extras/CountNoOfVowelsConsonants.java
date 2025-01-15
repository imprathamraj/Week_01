/*
1. Count Vowels and Consonants
Problem:
Write a Java program to count the number of vowels and consonants in a given string.
*/
import java.util.Scanner;

public class CountNoOfVowelsConsonants {
    // method to count no of vowels and consonants
    public int[] returnVowelsAndConsonantsCount(String s) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input from user for string
        System.out.print("Enter the string: ");
        String s = input.nextLine();

        s = s.toLowerCase();
        CountNoOfVowelsConsonants obj = new CountNoOfVowelsConsonants();
        int[] counts = obj.returnVowelsAndConsonantsCount(s);
		
		//returing values
        System.out.println("Number of vowels are: " + counts[0]);
        System.out.println("Number of consonants are: " + counts[1]);
    }
}
