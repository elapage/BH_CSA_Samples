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

        int numBlackSuits = 0;

        card1.flipCard();
        numBlackSuits = countBlackSuitedCards(card1, numBlackSuits);

        card2.flipCard();
        numBlackSuits = countBlackSuitedCards(card2, numBlackSuits);

        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println("There are  " + numBlackSuits + " black suited cards");
        System.out.println("We have created " + Card.getCardCount() + " cards");
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

    public static int countBlackSuitedCards(Card card, int currCount)
    {
        if(card.isBlackSuit())
            currCount++;

        return currCount;
    }
}
