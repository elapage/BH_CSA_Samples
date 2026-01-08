/**
 * Exploring ArrayLists and primitive data types
 * @version Jan 8 2026
 */

import java.util.ArrayList;

public class ArrayListNumberExample
{
    public static void main(String[] args)
    {
        //must create using the Integer wrapper class as ArrayLists only deal with objects
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        boolean sameNeighbours = true;

        for(int i = 0; i < 6; i++)
        {
            int value = (int)(Math.random() * (21) + 20);
            numbers.add(value); //autoboxing
            
        }
        numbers.add(0, numbers.get(0));
        
        System.out.println(numbers);

        //play around with the list!
        findSum(numbers);

        findLargestNumber(numbers);

        checkNeighbours(numbers);
    }

    /**
     * Finds the sum of the numbers in the list
     * @param numbers   list of numbers
     */
    public static void findSum(ArrayList<Integer> numbers)
    {
        int sum = 0;

        //unboxing
        for(int value : numbers)
        {
            sum += value;
        }

        System.out.println(sum);        
    }

    /**
     * checks the next neighbour of each element. Prints "true" if each neighbour is
     * unique, prints "false" if there is at least one set of neighbours that are the same
     * @param numbers
     */
    public static void checkNeighbours(ArrayList<Integer> numbers)
    {
        boolean sameNeighbours = true;

        //if we have neighbours that are the same value, print false
        //otherwise print true
        for(int i = 0; i < numbers.size() - 1; i++)
        {
            int curr = numbers.get(i);
            int neighbour = numbers.get(i + 1);

            if(curr == neighbour)
            {
                sameNeighbours = false;
            }
        }

        System.out.println(sameNeighbours);      
    }

    /**
     * Finds the largest number in the list of numbers
     * @param numbers
     */
    public static void findLargestNumber(ArrayList<Integer> numbers)
    {
        //assume that the first element in the list is the largest
        int numLargest = numbers.get(0);

        //go through numbers
        for(int i = 1; i < numbers.size(); i++)
        {
            int curr = numbers.get(i);  //get the current element

            //set this element as the largest value if it is larger
            //than the current largest (we don't care about equality in this scenario)
            if(numLargest < curr)
            {
                numLargest = curr;
            }
        }
        
        System.out.println(numLargest);
    }
    
}
