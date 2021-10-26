
import java.util.Random;
import java.util.Scanner;
public class CS3
{
// Braeden Rizzuto

	static Scanner input;


public static void main(String[] args)
{
input=new Scanner(System.in);
	int answer;
	int count=0;
	Random randGen;
	randGen = new Random();
	while( count<=70)
	{
	answer = randGen.nextInt (1003 - 9 + 1) + 9;
	System.out.print(answer);
	count++;
	
	}
}}


}
