/**
 * An example of creating and using objects
 * 
 * @author YOUR_NAME
 * @version Oct 7 2025
 */

public class Card
{
    //class variables
    private static final String BLACK_SUITS = "CS";
    private static int cardCount = 0;

    //define instance variables (properties) (global scope)
    private int rank;   //1-13, A's low
    private char suit;    //'H', 'D', 'S', 'C'
    private boolean isUp = false;   //facing up (true) means showing the suit and rank

    //special method called the CONSTRUCTOR
    //it sets all properties
    public Card(int rank, char suit)
    {
        isUp = false;   //all cards are dealt facing down

        //set all instance variables to their appropriate 
        //parameter
        this.rank = rank;
        this.suit = suit;

        cardCount++;
    }

    public static int getCardCount()
    {
        return cardCount;
    }

    /**
     * Prints the SUIT/RANK if facing up; will print
     * -- if facing down
     * This is kind of an accessor?
     */
    public void printCardInformation()
    {
        //check if the card is facing up
        if(isUp)
        {
            System.out.println(suit + "/" + rank);
        }
        else
        {
            System.out.println("--");
        }
    }//end printCardInformation

    /**
     * changes the state of the card from facing down to up
     * or vice versa
     * this is an example of a MUTATOR
     */
    public void flipCard()
    {
        isUp = !isUp;   //flips the value from T > F or F > T
    }

    /**
     * classic accessor for the suit
     * @return the suit of the card
     */
    public char getSuit()
    {
        return suit;
    }

    public int getRank()
    {
        return rank;
    }

    /**
     * Compares THIS to another Card and decides on suit
     * first (S, H, D, C) then rank to see which card "wins"
     * @param other the other card to compare to
     * @return based on the comparison algorithm above:
     *  - true if THIS "wins"
     *  - false if OTHER "wins"
     *  two decks can't exist together so no tie
     */
    public boolean compareTo(Card other)
    {
        boolean result;
        //compare suit first
        if(this.suit > other.suit)
        {
            result = true;
        }
        else if(other.suit > this.suit)
        {
            result = false;
        }
        else
        {
            if(this.rank > other.rank)
            {
                result = true;
            }
            else
            {
                result = false;
            }
        }

        return result;
    }

    /**
     * Returns true if black suit, false if red suit
     * @return see above
     */
    public boolean isBlackSuit()
    {
        String strSuit = "" + suit;
        // if(BLACK_SUITS.indexOf(strSuit) >= 0)
        // {
        //     return true;
        // }
        // else
        // {
        //     return false;
        // }

        return (BLACK_SUITS.indexOf(strSuit) >= 0);
    }

}
