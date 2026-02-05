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
            int numberOfCases = Integer.parseInt(input);

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
        String input;
        String [] splitValues;
        int numberElements, pivot;
        int [] data;

        //get the first line - # of elements in list followed by the pivot
        input = scanner.nextLine();

        splitValues = input.trim().split(" ");
        //splitValues = input.split("\\s+");    //all spaces
        numberElements = Integer.parseInt(splitValues[0]);
        pivot = Integer.parseInt(splitValues[1]);

        //get second line - data
        input = scanner.nextLine();
        data = getData(input, numberElements);

        System.out.println("-CASE " + caseNum + "-");
        //split and print the list
        splitList(data, pivot);
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
        String [] dataValues;
        int [] data = new int[size];
        int index = 0;

        dataValues = line.trim().split(" ");

        for(String value : dataValues)
        {
            if(index < data.length)
            {
                data[index] = Integer.parseInt(value);
            }
            index++;
        }

        return data;
    }

    /**
     * Splits the list into the two sides of the pivot then prints it
     * @param values
     * @param pivot
     */
    public static void splitList(int[] values, int pivot)
    {
        ArrayList<Integer> smallerThanPivot = new ArrayList<Integer>();
        ArrayList<Integer> largerThanPivot = new ArrayList<Integer>();

        for(int i = 0; i < values.length; i++)
        {
            if(values[i] <= pivot)
            {
                smallerThanPivot.add(values[i]);
            }
            else
            {
                largerThanPivot.add(values[i]);
            }
        }

        printList(smallerThanPivot);
        printList(largerThanPivot);

    }
    
}
