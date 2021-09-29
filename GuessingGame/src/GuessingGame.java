import java.util.Scanner;

public class GuessingGame {
	static Scanner input;
	public static void main(String[] args) {
		input= new Scanner(System.in);
		int guess; 
		// TODO Auto-generated method stub
		System.out.println("what is your guess?");
		guess = input.nextInt();
		
		System.out.println("the guess is" + guess);
	}

}
