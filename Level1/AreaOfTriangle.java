/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/
import java.util.Scanner;
class AreaOfTriangle{
	public static void main(String[] args){
		//creating Scanner class object for taking input
		Scanner input = new Scanner(System.in);
		
		//taking input
		System.out.println("Enter base in = ");
		double base  = input.nextDouble();
		System.out.println("Enter height in = ");
		double height = input.nextDouble();
		
		//calculating areaOfTriangle in inches
		double areaOfTriangleInch = 0.5 * base * height;
		
		//calculating areaOfTriangle in centimeters
		double areaOfTriangleCm = areaOfTriangleInch / (2.54 * 2.54) ;
		
		//printng output
		System.out.println("Area of triangle in square inches " + areaOfTriangleInch + " and in centimeters " + areaOfTriangleCm);
	}
}