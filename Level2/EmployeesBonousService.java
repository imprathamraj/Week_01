/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/
import java.util.Scanner;

public class EmployeesBonousService{
	public static void main(String[] args){
		//Taking input from the user
		Scanner input = new Scanner(System.in);
		
		double employeeYearOfService[] = new double[11];	//ip employeeYearOfService array
		for(int i = 1; i<11; i++){
			System.out.print("Enter the employee's service year " + i + " : ");
			employeeYearOfService[i] = input.nextDouble();
			System.out.println();
		}
		
		double employeeOldSalary[] = new double[11];	//ip employeeOldSalary array
		for(int i = 1; i<11; i++){
			System.out.print("Enter the employee's old salary" + i + " : ");
			employeeOldSalary[i] = input.nextDouble();
			System.out.println();
		}
		
		//defined double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary

		double calculatedBonous[] = new double[11];
		double employeeNewSalary[] = new double[11];
		
		
		//calculating bonous and new salary
		for(int i = 1; i < 11 ; i++ ){
				if(employeeYearOfService[i] > 5){
					calculatedBonous[i] = ( employeeOldSalary[i]*5 )/100;
					employeeNewSalary[i] = calculatedBonous[i] + employeeOldSalary [i];
				}
				else if (employeeYearOfService[i] <= 5){
					calculatedBonous[i] = ( employeeOldSalary[i]*2 )/100;
					employeeNewSalary[i] = calculatedBonous[i] + employeeOldSalary [i];
				}	
		}
					
		for(int i=1;i<=11;i++){
		System.out.println("Employee Number : " +i+ "\nTotal Bonus Payout: " +calculatedBonous[i]+ " Total Old Salary: "+ employeeOldSalary[i]+ " Total New Salary: " + employeeNewSalary[i]);			
		}
	}
}