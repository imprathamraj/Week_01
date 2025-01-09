/*Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/
class Distance{
	public static void main(String[] args){
		//assiging values to the variables
		double distanceKm = 10.8;
		
		//calculating distance in miles
		double distanceMiles = 10.8 * 1.6;
		
		//printing output
		System.out.println("The distance " + distanceKm + "km in miles is " + distanceMiles );
	}
}
