/**
 * An example of using the String split function
 * Problem 3 - Pivoting
 */

import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class SplittingExample
{
    public static void main(String[] args)
    {
        try
        {
            Scanner scanner = new Scanner(new File("input.txt"));
            String input = scanner.nextLine();
            int numberOfCases = Integer.praseInt(input);

            for(int caseNum = 1; caseNum <= numberOfCases; caseNum++)
            {
                runCase(caseNum, scanner);
            }

            scanner.close();
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong :( ");
            e.printStackTrace();
        }

        System.out.println("Program terminated normally");
    }

    /**
     * Code to run each case
     * @param caseNum   the case number (for the print)
     * @param scanner   //the scanner that we use
     */
    public static void runCase(int caseNum, Scanner scanner)
    {
    }

    /**
     * Prints an ArrayList
     * @param list  the list to print
     */
    public static void printList(ArrayList<Integer> list)
    {
        String output = "";
        for(int value : list)
        {
            output += value + " ";
        }
        output.trim();
        System.out.println(output);
    }

    /**
     * converts the line of data from the file to an array of integers
     * @param line  the line read in from the file
     * @param size  the size of the list
     * @return
     */
    public static int[] getData(String line, int size)
    {

        return null;
    }

    /**
     * Splits the list into the two sides of the pivot then prints it
     * @param values
     * @param pivot
     */
    public static void splitList(int[] values, int pivot)
    {
    }
    
}
