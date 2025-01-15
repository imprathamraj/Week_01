/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2 digit age of number of students provided as method parameters and return 1D array of age of n students
Create a method which takes in array of age as a parameter and returns 2D String array of age and boolean true or false to indicate can vote and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to settrue to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

*/
import java.util.Scanner;
import java.util.Random;

public class VotingEligible {

    // Creaing method to define the random 2-digit age of n students
    public static int[] RandomAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];

        // Generating random ages between 18 and 99 (2-digit ages)
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = 18 + random.nextInt(82); 
        }

        return ages;
    }

    // Creating method to check whether the student can vote
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];

            // checking age 
            if (age < 0) {
                result[i][0] = String.valueOf(age);
                result[i][1] = "Cannot Vote";
            } else {
                result[i][0] = String.valueOf(age);
                if (age >= 18) {
                    result[i][1] = "Can Vote";
                } else {
                    result[i][1] = "Cannot Vote";
                }
            }
        }

        return result;
    }

    // Creaing method to display the 2D array
    public static void displayEligibility(String[][] result) {
        System.out.println("Age           Voting Status");
        System.out.println("----------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i][0]+"        "+ result[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents < 1 || numberOfStudents > 10) {
            System.out.println("Invalid number of students.");
            return;
        }

        // Generating random ages for the students
        int[] Ages = RandomAges(numberOfStudents);

        // Checking voting eligibility
        String[][] eligibility = checkEligibility(Ages);

        // Displaying the results
        displayEligibility(eligibility);

        sc.close();
    }
}
