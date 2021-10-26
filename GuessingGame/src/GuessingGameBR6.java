
/*BraedenRizzuto */
//GuessingGameBR1
//10/22/2021
/* this project is a guessing game for anyone to guess a number and then have an option to play again if their guess is correct.*/

import java.util.Random;
import java.util.Scanner;

public class GuessingGameBR6
{
	static Scanner input;

	public static void main( String[ ] args )
	{
		Random randGen; //Random generator object
		randGen = new Random ( );

		input = new Scanner ( System.in );
		int points=0; // the amount of points that were remaining
		int guess; // User's guess
		guess = 0;
		int answer; // random computer generated number
		
		int count; // how many times the loop runs
		count = 0;
		int totalAverage;// the average of the guesses
		totalAverage = 0;
		int numGamesPlayed; // number of times the game is played
		numGamesPlayed = 0;
		int min; /* minimum number in the guessing range */
		int max; // max number in the guessing range
		char playAgain; // represents a y if the user wants to play again
		answer = 0;
		System.out.println ( "would you like to play the guessing game?" );
		playAgain = input.next ( ).charAt ( 0 ); // setting the input to playAgain
		System.out.println ( "enter your desired guessing range" );
		System.out.println ( "enter minimum" );
		min = input.nextInt ( );	// users input the smallest number in range		
		System.out.println ( "enter maximum" );
		max = input.nextInt ( ); // users input the largest number in the range
		while ( min > max )
		{
			System.out.println ( "enter your desired guessing range" ); // this whole loop checks for invalid data 
			System.out.println ( "enter minimum" );
			min = input.nextInt ( );
			System.out.println ( "enter maximum" );
			max = input.nextInt ( );
		}
		while ( playAgain == 'y' )
		{
			points = 5;
			answer = randGen.nextInt ( max - min + 1 ) + min; // formula of the random generator

			while ( answer != guess )
			{
				System.out.println ( "what is your guess?" );
				// getting users guess
				guess = input.nextInt ( );
				System.out.println ( "the guess is" + guess ); // outputting the users guess

				if ( answer < guess )
				{
					System.out.println ( "Guess was too high. Guess again." );

				}
				else
				{
					System.out.println ( "Guess was too low. Guess again." );
				}
				
				System.out.println ( "Your amount of points is" + points );//outputting the number of points	
				count++;
				--points;
				if(points<0)
				{
					points=0;
				}
			}
			totalAverage = totalAverage + points;
			System.out.println ( "guess is correct." );
			System.out.println ( "would you like to play again?" );
			playAgain = input.next ( ).charAt ( 0 );
		}

		System.out.println ( "Your amount of points is" + points );
		
		numGamesPlayed = count++;
		System.out.println ( "The number of games you played is" + numGamesPlayed ); //stating how many times they played the game
		System.out.println ( "Total average of guesses equals" + totalAverage*1.0 / numGamesPlayed ); //outputting the average guess

	}
}

//I struggled with trying to figure out the right combinations of ifs and loops to make the program run the way I wanted it to