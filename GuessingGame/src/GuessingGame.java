import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
	static Scanner input;
	public static void main(String[] args) {
		input= new Scanner(System.in);
		int guess; 
		Random randGen;
		// TODO Auto-generated method stub
		System.out.println("what is your guess?");
		guess = input.nextInt();
		System.out.println("the guess is" + guess);
		guess = input.nextInt();
		randGen = new Random();
		int answer;
		answer = randGen.nextInt(20 - 10 + 1) + 10;
		System.out.println("the guess is" + guess);
	}

}
