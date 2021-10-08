import java.util.Scanner;

public class CheckSheet2 {
	static Scanner input;
	public static void main(String[] args) {
		
		int count;
		int numBacteria;
		int numSamples;
		count=0;
		System.out.println("Enter the number of samples.");
		numSamples=input.nextInt();
		System.out.println("The number of samples is"+ numSamples);
		
		while ( numSamples > count) {
			System.out.println("Enter the amount of Bacteria in first sample.");
			numBacteria=input.nextInt();
			System.out.println("The amount of bacteria is"+ numBacteria);
			count++;
	}

}
}