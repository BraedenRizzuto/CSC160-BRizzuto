import java.util.Scanner;

public class CheckSheetIf {
	static Scanner input;
	public static void main(String[] args) {
		input=new Scanner(System.in);
		int numOne;
		int numTwo;
		int numThree;
		System.out.print("Enter First Number");
		numOne=input.nextInt();
		System.out.print("Enter Second Number");
		numTwo=input.nextInt();
		System.out.print("Enter Third Number");
		numThree=input.nextInt();
		
		if (numOne<numTwo)
		{
			System.out.print("Highest Number Is"+numTwo);
		}
		else
		{
			System.out.print("Highest Number Is"+numOne);
		}
		if (numThree>numTwo || numThree>numOne)
			System.out.print("Highets number is"+numThree);
			
		}
		
		
			
		
		}
			
}


