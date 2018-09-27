
public class Cards {

	public static int getRandomNumber()
	{
		return (int)(Math.random()*10 + 1);
	}
	
	public static int calcTotal(int card1,int card2)
	{
		return(card1+card2);
	}
	
	public static boolean getResult(int total,int house)
	{
		if (total>house && total<=21)
			return(true);
		else
			return(false);
	}
	
	public static boolean busted(int total)
	{
		if (total>21)
			return(true);
		else
			return(false);
	}
	
	public static int houseTotal(int x)
	{
		int house=0;
		while (house < x)
			house = calcTotal(getRandomNumber(),getRandomNumber());	
	return(house);
	}
	
	public static void displayCards(int cardsDrawn[])
	{
		System.out.print("Cards drawn: ");
		for (int x = 1;x<10;x++)
		{
		if (cardsDrawn[x]!=0)
				if (x==1)
					System.out.print(cardsDrawn[x]);
				else
					System.out.print(","+cardsDrawn[x]);	
		}
		System.out.println();
	}
}
