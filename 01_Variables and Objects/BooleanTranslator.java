import java.util.Scanner;

public class BooleanTranslator
{
    public static void main(String[] args)
    {
        //creating a new instance of that object
        Scanner input = new Scanner(System.in);

        getInput(input);
        
        input.close();
    }

    /**
     * gets the input and evaluates based on that input
     * @param input the scanner used
     */
    public static void getInput(Scanner input)
    {
        boolean p, q, r;
        boolean result;

        //get input from the user
        System.out.print("p = ");
        p = input.nextBoolean();

        System.out.print("q = ");
        q = input.nextBoolean();
        
        System.out.print("r = ");
        r = input.nextBoolean();

        result = getResult(p, q, r);
        System.out.println("Resulting boolean: " + result);
    }

    /**
     * gets the result of a specified boolean expression using
     * three arguments
     * @param p first argument
     * @param q second argument
     * @param r third argument
     * @return
     */
    public static boolean getResult(boolean p, boolean q, boolean r)
    {
        return (p || q) && (p || r);
    }
}
