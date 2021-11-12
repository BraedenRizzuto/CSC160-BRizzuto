import java.util.Scanner;

public class stringCheckSheetBR
{
	static Scanner input;
	

public static void main(String[ ] args)
{
	input = new Scanner ( System.in );
	String sWord;
	 String shortSentence;
	 String bigSentence;
	 String letters;
	 String word2;
	 String index;
	 int []counts= new int [4];
	 System.out.println("enter a word");
	sWord = input.nextLine ( );
	System.out.println(sWord.length());
	System.out.println("enter a sentence");
	shortSentence=input.nextLine ( );
	System.out.println(shortSentence.length());
	bigSentence= shortSentence.concat  (sWord+sWord );
	System.out.println(bigSentence);
	System.out.println(bigSentence.length());
	if(sWord.length()<counts.length )
	{
	System.out.println(3+"letter Words"+counts[3]);
	}
	System.out.println("enter a second word");
	word2=input.nextLine();
shortSentence.codePointAt ( index );
}
}