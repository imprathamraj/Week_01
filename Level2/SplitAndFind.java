/*Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result.

*/
import java.util.Scanner;
import java.util.Arrays;

public class SplitAndFind {

    // Creating method to find the length of a string
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;     
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    // Creating method to split the text into words 
    public static String[] splitText(String text) {
         StringBuilder word = new StringBuilder();
        int space = 32; // ASCII value for space=32
        int index = 0;
        String[] words = new String[text.length()];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ((int) ch != space) {
                word.append(ch);
            } else if (word.length() > 0) {
                words[index++] = word.toString();
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            words[index++] = word.toString();
        }

        String[] result = new String[index];
        System.arraycopy(words, 0, result, 0, index);
        return result;

    }

   // Creating method to generate a 2D array of words and their lengths
    public static String[][] WordLengthArray(String[] words) {
        String[][] Array = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            Array[i][0] = words[i];
            Array[i][1] = String.valueOf(getLength(words[i]));
        }

        return Array;
    }


    // Method to find the shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int[] result = new int[2];
        int shortLength = Integer.MAX_VALUE;
        int longLength = Integer.MIN_VALUE;

        for (int i = 0; i < wordLengthArray.length; i++) {
            String[] wordLength = wordLengthArray[i];
            int length = Integer.parseInt(wordLength[1]);
            if (length < shortLength) {
                shortLength = length;
            }
            if (length > longLength) {
                longLength = length;
            }
        }

        result[0] = shortLength; 
        result[1] = longLength;  

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String Input = sc.nextLine();

        // Spliting the text into words using the custom method
        String[] words = splitText(Input);

        // Creating the 2D array of word and corresponding length
        String[][] wordLengthArray = WordLengthArray(words);

        // Finding the shortest and longest word lengths
        int[] shortestAndLongest = findShortestAndLongest(wordLengthArray);

        // Displaying the result
        System.out.println("Words: " + Arrays.toString(words));
        System.out.println("Shortest word length: " + shortestAndLongest[0]);
        System.out.println("Longest word length: " + shortestAndLongest[1]);

        sc.close();
    }
}
