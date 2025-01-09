/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
I/P => side1, side2, side3
O/P => The total number of rounds the athlete will run is ___ to complete 5 km */
import java.util.Scanner;

class AthleteRun {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for the sides of the triangle (in meters)
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = input.nextDouble();

        // Calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Distance the athlete wants to run (5 km = 5000 meters)
        double totalDistance = 5000;  // 5 km in meters

        // Calculating the number of rounds needed
        double rounds = totalDistance / perimeter;

        // Printing the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);
    }
}
