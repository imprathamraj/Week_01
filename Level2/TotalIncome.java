/*
Create a program to find the total income of a person by taking salary and bonus from the user.
Hint => 
1. Create a variable `salary` of type int or double to store the salary amount.
2. Create another variable `bonus` of type int or double to store the bonus amount.
3. Compute the total income by adding salary and bonus.
4. Print the result in the required format.
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
*/

import java.util.Scanner;

class TotalIncome {
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Taking user input for salary
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        // Taking user input for bonus
        System.out.print("Enter your bonus: ");
        double bonus = input.nextDouble();

        // Calculating total income
        double totalIncome = salary + bonus;

        // Printing the result in the required format
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);
    }
}
