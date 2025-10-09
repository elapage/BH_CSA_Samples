/**
 * Driver class (executable class) for the Card object
 * 
 * @author YOUR_NAME
 * @version October 7 2025
 */

public class CardDriver
{
    public static void main(String[] args)
    {
        Card card1 = new Card(11, 'H');
        Card card2 = new Card(1, 'S');

        card1.flipCard();
        card2.flipCard();

        card1.printCardInformation();
        card2.printCardInformation();

        //practice: make another instance of Card
        // compare the two cards in the executable
        //suit preference - (highest to lowest) S, H, D, C
        //then  by rank
        //which one wins?

        //check
        if(card1.compareTo(card2))
        {
            System.out.println("Card 1 wins");
        }
        else
        {
            System.out.println("Card 2 wins");
        }
        
    }
}
