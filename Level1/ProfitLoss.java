/*Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___

*/
class ProfitLoss{
	public static void main(String[] args){
		//assiging values to variables
		int costPrice = 129;
		int sellingPrice = 191;
		
		//calculating profit
		int profit = sellingPrice - costPrice ;
		
		//calculating profitPercentage
		double profitPercentage = profit *100 / costPrice ;
		
		//printing output
		System.out.println("The profit is INR " + profit + "\nThe profit percentage is " + profitPercentage );
	}
}