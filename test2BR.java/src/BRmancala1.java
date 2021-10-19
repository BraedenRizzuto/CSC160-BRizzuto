
/* Braeden Rizzuto */
/* This project is the Mancala Game project. This will help us draw the borders to the game using printed stars */
/* Due date: 10/19 */

public class BRmancala1 {

public static void main(String[]args) {
	int numStars; // number of stars that will be printed in a line
	numStars=3; //
	makeSolidLine(numStars);
	System.out.println();
	makeSolidLine(numStars);
}
	public static void makeSolidLine(int numStars) // This method makes a solid line mode out of a row of stars. Number of stars that will be printed in a line. Returns void.
{
	int starCount; // loop control variable
	starCount=0;
	while(starCount<numStars)
	{
		System.out.print('*');
		starCount++;
	} // end of while loop




}
}
/* what is going on?*/