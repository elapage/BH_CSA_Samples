import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        //create a new list
        ArrayList<String> names = new ArrayList<String>();

        //print the list using the .toString() method
        //EXPECTING an empty list shown by []
        System.out.println(names);
        
        //add names to the list and print the resulting list
        //addNames(names);
        addNamesViaFile(names);
        System.out.println(names);  //displayed as [element1, element2, ...]
        
        if(names.size() > 0)    //check to make sure not empty
        {
            //add a new value to the list and print
            names.add(3, "LP");
            System.out.println(names);


            //get an item from the list
            System.out.println(names.get(4));

            //remove an item. The removal method returns the item that was
            //returned from the list. Print the resulting full list
            System.out.println(names.remove(3));
            System.out.println(names);
        }

        //print the names, 1 per line
        removalAlgorithmMoreBetter(names);

        System.out.println(names);
    }

    /**
     * Adds names via the file names.txt (located in the same directory)
     * @param names
     */
    public static void addNamesViaFile(ArrayList<String> names)
    {
        try
        {
            File namesInput = new File("names.txt");
            Scanner scanner = new Scanner(namesInput);

            //continue to read the file so long as there are lines to be read!
            while(scanner.hasNextLine())
            {
                //read the next line
                String input = scanner.nextLine();

                names.add(input);
            }

            scanner.close();
        }
        catch(IOException ioe)
        {
            System.out.println("Issue with file");
            addNames(names);
        }
    }

    /**
     * Adds a variety of names one at a time. Default set of names
     * @param names
     */
    public static void addNames(ArrayList<String> names)
    {
        //a quick reminder - remember that this names and the above
        //names are not the same list, but rather a shallow copy. However
        //I can still change the contents of the list using the dot operator
        //(however, I could not change the reference - I couldn't create a new
        //list)
        names.add("Borus");
        names.add("Greta");
        names.add("Cecilia");
        names.add("Suzie");
        names.add("Emily");
        names.add("Princess");        
    }

    /**
     * Removes names that have lengths that are smaller than 7. This iteration
     * uses a while-loop so that we don't alter the value of a for-loop counter
     * @param names The list of names
     */
    public static void removalAlgorithmMoreBetter(ArrayList<String> names)
    {
        //start our index at the beginning of the list
        int index = 0;
        
        //continue throughout the entire list
        while(index < names.size())
        {
            String currentElement = names.get(index);
            //only print names that are smaller than 7 characters
            if(currentElement.length() < 7)
            {
                names.remove(index);
            }            
            else
            {
                //if we don't remove, go to next index position
                index++;
            }
        }
    }
    
    /**
     * Removing names from the list with lengths smaller than 7. Please note that this is the algorithm
     * typically used by the college board but is not considered good coding.
     * @param names
     */
    public static void removalAlgorithmLessGood(ArrayList<String> names)
    {
        for(int index = 0; index < names.size(); index++)
        {
            String currentElement = names.get(index);
            //only print names that are smaller than 7 characters
            if(currentElement.length() < 7)
            {
                names.remove(index);
                //good programming dictates that we never changes
                //the counter variable in a for-loop (some languages don't allow it due to how
                //loop variables are stored; readability) BUT common algorithm used on CSP exam
                index--;
            }
        }        
    }
}