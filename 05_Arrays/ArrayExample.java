/**
 * Basic array example - creating a new array, changing values and the print
 * the array. Will work on traversals in class
 */

public class ArrayExample
{
    public static void main(String[] args)
    {
        int [] numbers = createArray();

        printArray(numbers);

        changeArrayValues(numbers, 22);

        printArray(numbers);
    }

    public static int [] createArray()
    {
        //declare and initialize a new array
        int [] numbers = new int[5];

        //populate values
        //equivalent statement: int [] numbers = {11, 714, 3, 13, 2};
        numbers[0] = 11;
        numbers[1] = 714;
        numbers[2] = 3;
        numbers[3] = 13;
        numbers[4] = 2;

        return numbers;
    }

    public static void changeArrayValues(int [] numbers, int changeVal)
    {

        // to be completed in class

    }

    public static void printArray(int [] numbers)
    {
        // to be completed in class
    }
}