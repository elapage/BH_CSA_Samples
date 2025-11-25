/**
 * An example of calculating Factorial values
 */

 import java.util.Scanner;

public class Factorial
{
    public static void main(String [] args)
    {
        Scanner scanner;
        int input;

        scanner = new Scanner(System.in);
        System.out.print("Enter a whole number for the Factorial function: ");
        input = scanner.nextInt();

        runTimedMethods(input);

        System.out.println("Program ended");
        scanner.close();
    }

    /**
     * Method that will run both the iterative and recursive functions
     * while timing them. The results will be printed 
     * @param num   Inputted number
     */
    public static void runTimedMethods(int num)
    {
        double startIt, endIt;
        double startRe, endRe;
        long itResult, reResult;

        //run and print iterative version
        startIt = System.currentTimeMillis();
        itResult = itFact(num);
        endIt = System.currentTimeMillis();
        System.out.println("Iterative Factorial: " + itResult);
        System.out.println("Time (ms):" + (endIt - startIt));

        //run and print recursive version
        startRe = System.currentTimeMillis();
        reResult = reFact(num);
        endRe = System.currentTimeMillis();
        System.out.println("Recursive Factorial: " + reResult);
        System.out.println("Time (ms):" + (endRe - startRe));
    }


    /**
     * An iterative factorial function (!)
     * @param num   A whole number; 
     * @return The factorial of a whole number is 1 * 2 * ... * (n-1) * n
     *         0! is 1
     */
    public static long itFact(int num)
    {

    }

    /**
     * A recursive version of the factorial algorithm
     * @param num   a natural number
     * @return the factorial is found by multiplying
     *         1 * 2 * 3 * ... * (n-1) * n, where n
     *         n is num
     */
    public static long reFact(int num)
    {

    }

}