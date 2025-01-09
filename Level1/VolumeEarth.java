/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/
class VolumeEarth{
	public static void main(String[] args){
		//assiging values to variables
		double radiusEarthKm = 6378;
		double radiusEarthMiles = 6378 * 0.621371;
		
		//calculating volumeEarthKm
		double volumeEarthKm = (4.0/3.0) * Math.PI * Math.pow(radiusEarthKm,3);
		
		//calculating volumeEarthMiles
		double volumeEarthMiles = (4.0/3.0) * Math.PI * Math.pow(radiusEarthMiles,3);
		
		//printing output
		System.out.println(" The volume of earth in cubic kilometers is " + volumeEarthKm + " and cubic miles is " + volumeEarthMiles );	
	}
}