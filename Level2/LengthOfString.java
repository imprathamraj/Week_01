/*Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result
*/
import java.util.Scanner;

public class LengthOfString {

    // Creating method to find the length of a string
    public static int StringLength(String str) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String Input = sc.next();

        // Calling the user defined method to find string length
        int UserDefinedLength = StringLength(Input);

        // Comparing with built-in length() method
        int builtInLength = Input.length();

        // Displaying the results
        System.out.println("Length of the string (user defined method): " + UserDefinedLength);
        System.out.println("Length of the string (built-in method): " + builtInLength);

        sc.close();
    }
}
