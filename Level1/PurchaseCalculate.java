/*Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/
import java.util.Scanner;

public class PurchaseCalculate {
    public static void main(String[] args) {
		//creating Scanner class object for taking input
        Scanner input = new Scanner(System.in);
		
		//taking input
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter the quantity to be bought: ");
        int quantity = input.nextInt();
		
		//calculating totalPrice
        double totalPrice = unitPrice * quantity;
        
		//printing output
        System.out.println("The total purchase price is INR " +(float) totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
	}
}