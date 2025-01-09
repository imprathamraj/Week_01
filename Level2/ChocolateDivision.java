/*Create a program to divide N number of chocolates among M children.
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Find the number of chocolates each child gets and number of remaining chocolates
Display the results
I/P => numberOfchocolates, numberOfChildren
O/P => The number of chocolates each child gets is ___ and the number of remaining chocolates are ___ */
import java.util.Scanner;

class ChocolateDivision {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the total number of chocolates and the number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Checking if the number of children is zero to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Calculating the number of chocolates each child gets
            int chocolatesPerChild = numberOfChocolates / numberOfChildren;

            // Calculating the number of remaining chocolates
            int remainingChocolates = numberOfChocolates % numberOfChildren;

            // Displaying the result
            System.out.println("The number of chocolates each child gets is " + chocolatesPerChild 
                                + " and the number of remaining chocolates are " + remainingChocolates);
        }
    }
}
