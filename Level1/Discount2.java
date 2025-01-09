/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/
import java.util.Scanner;
class Discount{
	public static void main(String[] args){
		//creating Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		
		//taking input
		double studentFee = input.nextDouble();
		double discountPercent = input.nextDouble();
		
		//calculating discountAmount
		double discountAmount = studentFee * discountPercent / 100 ;
		
		//calculating finalDiscountedFee
		double finalDiscountedFee = studentFee - discountAmount;
		
		//printing output
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalDiscountedFee );
	}
}