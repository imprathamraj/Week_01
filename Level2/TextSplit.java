/*Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result

*/
import java.util.Scanner;
import java.util.Arrays;

public class TextSplit {

    // Method to find the length of the string
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

    // Method to split the text into words 
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

    // Using method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a text: ");
        String Input = sc.nextLine();

        // Spliting using the user defined method
        String[] userSplitWords = splitText(Input);

        // Spliting using the built-in split() method
        String[] builtInSplitWords =Input.split(" ");

        // Comparing the two arrays
        boolean Equal = compareArrays(userSplitWords, builtInSplitWords);

        // Displaying the results
        System.out.println("Words split by user defined method: " + Arrays.toString(userSplitWords));
        System.out.println("Words split by built-in split method: " + Arrays.toString(builtInSplitWords));
        System.out.println(" same result " + Equal);

        sc.close();
    }
}
