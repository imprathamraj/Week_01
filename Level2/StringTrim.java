/*Write a program to trim the leading and trailing spaces from a string using the charAt() method 
Hint => 
Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result
*/
import java.util.Scanner;

public class StringTrim {

    // Creating method to trim the leading and trailing spaces
    public static int[] trimSpaces(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Finding the start index of the string
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Finding the end index of the string 
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Returning the start and end indexes
        return new int[]{start, end};
    }

    // Creating method to create a substring
    public static String Substring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i)); 
        }
        return result.toString();
    }

    // Creating method to compare two strings
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Takeing user input
        System.out.print("Enter a string: ");
        String Input = sc.nextLine();

        // Triming the leading and trailing spaces
        int[] trimIndex = trimSpaces(Input);
        String trimString = Substring(Input, trimIndex[0], trimIndex[1]);

        // Triming the string using the built-in trim() method
        String builtInTrimmedString = Input.trim();

        // Comparing the two strings
        boolean Equal = compareStrings(trimString, builtInTrimmedString);

        // Displaying the results
        System.out.println("Trimmed String using charAt(): " + "\"" + trimString + "\"");
        System.out.println("Trimmed String using built-in trim(): " + "\"" + builtInTrimmedString + "\"");
        System.out.println("trimmed strings equal " + Equal);

        sc.close();
    }
}
