
/* Braeden Rizzuto */
/* This project is the Mancala Game project. This will help us draw the borders to the game using printed stars */
/* Due date: 10/19 */

public class BRmancala1
{
	static final int NUMBINS = 14;

	public static void main( String[ ] args )
	{

		int[ ] beadArray;
		beadArray = new int[ NUMBINS ];
		//startingArray(beadArray);
		startingArray ( beadArray );
		printArray ( beadArray );
		System.out.println ( );
		int numStars; // number of stars that will be printed in a line
		numStars = 3; //
		makeSolidLine ( numStars );
		System.out.println ( );
		makeSolidLine ( numStars );
	} // end of method

	public static void startingTestArray( int[ ] beadArray )
	{
		beadArray[ 0 ] = 1;
		beadArray[ 1 ] = 2;
		beadArray[ 0 ] = 3;
		beadArray[ 1 ] = 4;
		beadArray[ 0 ] = 5;
		beadArray[ 1 ] = 6;
		beadArray[ 0 ] = 7;
		beadArray[ 1 ] = 8;
		beadArray[ 0 ] = 9;
		beadArray[ 1 ] = 10;
		beadArray[ 0 ] = 11;
		beadArray[ 1 ] = 12;
		beadArray[ 0 ] = 13;
		beadArray[ 1 ] = 14;
		beadArray[ 0 ] = 15;
		beadArray[ 1 ] = 16;
		beadArray[ 0 ] = 17;

	}

	public static void printArray( int[ ] beadArray )
	{
		int index;
		for ( index = 0; index < NUMBINS; index++ )
		{
			System.out.printf ( "%3d", beadArray[ index ] );
			if ( index == 6 )
			{
				System.out.printf ( "	|" );
			}

		}
	}

	public static void startingArray( int[ ] beadArray )
	{
		int index;
		for ( index = 0; index < NUMBINS; index++ )
		{
			beadArray[ index ] = 4;
		}
		beadArray[ 6 ] = 0;
		beadArray[ 13 ] = 0;

	}

	public static void makeSolidLine( int numStars ) // This method makes a solid line mode out of a row of stars. Number of stars that will be printed in a line. Returns void.
	{
		int starCount; // loop control variable
		starCount = 0;
		while ( starCount < numStars )
		{
			System.out.print ( '*' );
			starCount++;
		} // end of while loop
	} // end of method

	public static void makeDottedLine( int numStars, int numSpaces )
	{

	}

}
/* what is going on? */