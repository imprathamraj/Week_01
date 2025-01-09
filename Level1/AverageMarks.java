/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
 */
class AverageMarks{
    public static void main(String[] args) {
		//assigng values to the variables
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
		
		//calculating average mark
        int average = ( mathsMark + physicsMark + chemistryMark ) / 3 ;
		
		//printing output
		System.out.println( "Sam's average mark in PCM is " + average );
    }
}