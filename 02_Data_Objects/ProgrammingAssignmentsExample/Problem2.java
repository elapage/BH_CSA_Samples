import java.io.*;
import java.util.Scanner;

public class Problem2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int x;  //inputted value to find number of steps

        for(int i = 1; i <= numLines; i++)
        {
            x = scanner.nextInt();
            applyCollatzAlgorithm(i, x);
        }

        scanner.close();        
    }

    /**
     * Applies the Collatz algorithm to the value x to see how many steps
     * it needed to complete
     * @param lineCount the run number for the output
     * @param x the value to apply the algorithm to
     */
    public static void applyCollatzAlgorithm(int lineCount, int x)
    {
        int evenCounter = 0;
        int oddCounter = 0;
        int temp = x;   //so that we don't change x

        while(temp > 1)    //apply algorithm until 1
        {
            if(temp % 2 == 0)   //check for even or odd
            {
                evenCounter++;
                temp /= 2;
            }
            else
            {
                oddCounter++;
                temp = 3 * temp + 1;
            }
        }

        //final output
        System.out.println(lineCount + ". The number " + x + " needs " + oddCounter + "  odd steps and " + evenCounter + " even steps.");

    }
    
}
