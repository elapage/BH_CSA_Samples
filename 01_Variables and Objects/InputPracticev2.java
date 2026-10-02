import java.util.Scanner;

public class InputPracticev2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int value1;
        double value2;
        boolean b;
        String s;   //just for getting number input
        String name;

	//Remember that order matters! Funny things happen when you
	//input ints and doubles before Strings. Here is one option
	//when you have to mix types (and you have a specific order)


        System.out.print("Enter an int: ");
        s = input.nextLine();	//get the value as a string
        value1 = Integer.parseInt(s);	//convert from a string to an int

        System.out.print("Enter a double: ");
        s = input.nextLine();
        value2 = Double.parseDouble(s);	//convert from a string to a double

        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.println("" + (value1 + value2));
        
        input.close();

    }
}
