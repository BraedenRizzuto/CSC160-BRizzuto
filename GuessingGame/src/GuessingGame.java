
//Braeden Rizzuto 
//Guessing Game 1
//Due 9/30/21/
//Description:learn program. User guesses number 1-20 and program guesses it 



import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
	static Scanner input;
	public static void main(String[] args) {
		input= new Scanner(System.in);
		int guess; // User's guess
		Random randGen; //Random generator object
		randGen = new Random();
		System.out.println("what is your guess?");
			// getting users guess
		guess = input.nextInt(); 
		System.out.println("the guess is" + guess);
		guess = input.nextInt();
		
		int answer; // random computer generated number
		
		
			// formula is (high minus low + 1) + low
		answer = randGen.nextInt(20 - 10 + 1) + 10;
		System.out.println("the answer is"+ answer);
		
	}

}
//I did not really know what I was doing and was just copying it off the board.