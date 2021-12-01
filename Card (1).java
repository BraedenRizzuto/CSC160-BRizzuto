public class Card
{
	static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	static String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };

	private String suit;
	private String rank;


	public Card(String suit, String rank)
	{
		super();
		this.suit = suit;
		this.rank = rank;
	
	}

	public String getSuit()
	{
		return suit;
	}

	public void setSuit(String suit)
	{
		this.suit = suit;
	}
	public void setRank(String rank2)
	{
		this.rank = rank2;
	}
	public String getRank()
	{
		return rank;
	}

	public void compare( String suit, String rank)
	{
		if (rank.compareTo(rank)<0)
		{
			System.out.println("Card is the same");
		}
	}
	@Override
	public String toString()
	{
		String card;
		card = rank + suit;
		System.out.println(card);
		return card;
	}

	


	
	
 
}
