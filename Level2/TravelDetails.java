/*
Create a program to take user inputs for name, cities (fromCity, viaCity, toCity), distances (fromToVia, viaToFinalCity),
and time taken for travel. Then, print the result.

Hint => 
1. Create variables for name, fromCity, viaCity, and toCity.
2. Create variables for distances (fromToVia and viaToFinalCity) in miles.
3. Take user input for the time taken for the journey.
4. Calculate and print the results, understanding the operator precedence.
I/P => name, fromCity, viaCity, toCity, fromToVia, viaToFinalCity, timeTaken
O/P => The journey details are: [name], from [fromCity] to [viaCity] to [toCity], with distances [fromToVia] miles, [viaToFinalCity] miles, and time taken [timeTaken] hours.
*/

import java.util.Scanner;

class TravelDetails {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for name and cities
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the starting city (fromCity): ");
        String fromCity = input.nextLine();

        System.out.print("Enter the via city (viaCity): ");
        String viaCity = input.nextLine();

        System.out.print("Enter the destination city (toCity): ");
        String toCity = input.nextLine();

        // Taking user input for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = input.nextDouble();

        // Taking user input for time taken
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = input.nextDouble();

        // Calculating total distance and speed
        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / timeTaken;

        // Printing the result with formatted output
        System.out.println("\nThe journey details are:");
        System.out.println(name + ", from " + fromCity + " to " + viaCity + " to " + toCity + ",");
        System.out.println("With distances: " + fromToVia + " miles, " + viaToFinalCity + " miles.");
        System.out.println("Total distance: " + totalDistance + " miles.");
        System.out.println("Time taken: " + timeTaken + " hours.");
        System.out.println("Average speed: " + speed + " miles per hour.");
    }
}
