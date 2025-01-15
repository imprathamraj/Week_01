/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 

*/
import java.util.Random;
import java.util.Scanner;

public class Scorecard {

    // Creating method to generate random 2-digit scores
    public static int[][] RandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 40 + random.nextInt(61); 
            scores[i][1] = 40 + random.nextInt(61);
            scores[i][2] = 40 + random.nextInt(61);
        }

        return scores;
    }

    // Calculating total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round(total / 3.0) ; 

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Creating method to calculate grade based on percentage
    public static String[][] calculateGradesAndRemarks(double[][] results) {
        int numberOfStudents = results.length;
        String[][] gradesAndRemarks = new String[numberOfStudents][2];
       
        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = results[i][2];

            if (percentage >= 80) {
                gradesAndRemarks[i][0] = "A";
                gradesAndRemarks[i][1] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                gradesAndRemarks[i][0] = "B";
                gradesAndRemarks[i][1] = "Level 3, agency-normalized standards";

            } else if (percentage >= 60) {
               gradesAndRemarks[i][0] = "C";
               gradesAndRemarks[i][1] = "Level 2, below, but approaching agency-normalized standards";

            } else if (percentage >= 50) {
                gradesAndRemarks[i][0] = "D";
                gradesAndRemarks[i][1] = "Level 1, well below agency-normalized standards";

            } else if (percentage >= 40) {
                gradesAndRemarks[i][0] = "E";
                gradesAndRemarks[i][1] = "Level 1-, too below agency-normalized standards";

            } else {
                gradesAndRemarks[i][0] = "R";
                gradesAndRemarks[i][1]= "remedial standards";

            }
        }

        return gradesAndRemarks;
    }

    // Creating method to display the scorecard in a tabular format
    public static void displayScore(int[][] scores, double[][] results, String[][] gradesAndRemarks) {
        System.out.println("Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade  Remarks");
        System.out.println("------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1)+" "+scores[i][0]+" "+ scores[i][1]+" "+ scores[i][2]+" "+ results[i][0]+" "+ results[i][1]+" "+results[i][2]+" "+gradesAndRemarks[i][0]+" "+ gradesAndRemarks[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents <= 0) {
            System.out.println("Invalid number of students");
            return;
        }

        // Generating random scores for students
        int[][] scores = RandomScores(numberOfStudents);

        // Calculating total, average, and percentage
        double[][] results = calculateResults(scores);

        // Calculating grades
        String[][] gradesAndRemarks = calculateGradesAndRemarks(results);

        // Displaying the scorecard
        displayScore(scores, results, gradesAndRemarks);

        sc.close();
    }
}
