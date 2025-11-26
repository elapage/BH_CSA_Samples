/**
 * Runs and compares Fibonacci algorithms (iterative and recursive)
 */

import java.util.Scanner;

public class Fibonacci
{

    public static void main(String [] args)
    {
        Scanner scanner;
        int input;

        //get input
        scanner = new Scanner(System.in);
        System.out.print("Enter the term number of the Fibonacci sequence that you would like to calculate: ");
        input = scanner.nextInt();

        //run the methods
        runTimedMethods(input);

        //close the program
        System.out.println("Program ended");
        scanner.close();
    }
    /**
     * Method that will run both the iterative and recursive functions
     * while timing them. The results will be printed 
     * @param termNumber
     */
    public static void runTimedMethods(int termNumber)
    {
        double startIt, endIt;
        double startRe, endRe;
        long itResult, reResult;

        //run and print iterative version
        startIt = System.currentTimeMillis();
        itResult = itFib(termNumber);
        endIt = System.currentTimeMillis();
        System.out.println("Iterative Fibonacci: " + itResult);
        System.out.println("Time (ms):" + (endIt - startIt));

        //run and print recursive version
        startRe = System.currentTimeMillis();
        reResult = reFib(termNumber);
        endRe = System.currentTimeMillis();
        System.out.println("Recursive Fibonacci: " + reResult);
        System.out.println("Time (ms):" + (endRe - startRe));
    }

    /**
     * Method that uses an iterative Fibonacci algorithm
     * @param term  the term number to find
     * @return  Fibonacci numbers are calculated by taking
     *          the sum of previous 2 terms. The first 
     *          and second terms are both 1
     */

    public static long itFib(int term)
    {
        long prev = 1;
        long curr = prev;

        for(int n = 3; n <= term; n++)
        {
            long temp = curr;
            curr += prev;
            prev = temp;
        }


        return curr;
    }


    /**
     * Calculates the Fibonacci number given the term value using a recursive
     * algorithm
     * @param term The given term number
     * @return  Fibonacci numbers are calculated by taking
     *          the sum of previous 2 terms. The first 
     *          and second terms are both 1
     */

    public static long reFib(int term)
    {
        long result;

        //first two terms are 1
        if(term <= 2)
        {
            result = 1;
        }
        else
        {
            //the result is the sum of the previous two terms
            result = reFib(term - 1) + reFib(term - 2);
        }

        return result;
    }
}
