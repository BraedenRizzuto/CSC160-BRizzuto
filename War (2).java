import java.util.Scanner;

public class War
{
	static Scanner input;

	public static void main(String[] arg)
	{
		input = new Scanner(System.in);
		Card card = new Card(null, null);
		setCardInfo(card);
	
	
	}

	public static void setCardInfo(Card card)
	{
		String suit;
		String rank;
		
		System.out.println("enter rank");
		rank = input.nextLine();
		card.setRank(rank);
		
		System.out.println("enter suit");
		suit = input.nextLine();
		card.setSuit(suit);
		
		
		System.out.println(rank+" of "+suit);
		
		
	}
}