/*Write a program to split the text into words and return the words along with their lengths in a 2D array
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to find and return a string's length without using the length() method. 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/
import java.util.Scanner;

public class SplitText {

    // Creating method to split text into words
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

    // Creating method to find the length of a string
    public static int StringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    // Creating method to generate a 2D array of words and their lengths
    public static String[][] WordLengthArray(String[] words) {
        String[][] Array = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            Array[i][0] = words[i];
            Array[i][1] = String.valueOf(StringLength(words[i]));
        }

        return Array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String Text = sc.nextLine();

        // Spliting the text into words
        String[] words = splitText(Text);

        // Generating 2D array of words and their lengths
        String[][] Array = WordLengthArray(words);

        // printing the result
        System.out.printf( "Word            Length\n");
        System.out.println("-----------------------");

        for (int i = 0; i < Array.length; i++) {
            String word = Array[i][0];
            int length = Integer.parseInt(Array[i][1]);
            System.out.print(word+ "      "+length+" \n");
        }

        sc.close();
    }
}
