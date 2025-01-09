/*Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___  */
class Age{
    public static void main(String[] args) {
		//assigning values to variables
        int currentAge;
        int currentYear = 2024;
        int birthYear = 2000;
		
		//calculating currentAge
        currentAge = currentYear - birthYear;
		
		//printing output
        System.out.println("Harry's age in 2024 is " + currentAge);
    }
}