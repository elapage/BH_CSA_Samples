/**
 * Basic array example - creating a new array, changing values and the print
 * the array. Will work on traversals in class
 */

public class ArrayExample
{
    public static void main(String[] args)
    {
        int [] numbers = createArray();
        int changeNumber = 22;

        printArray(numbers);

        changeArrayValues(numbers, changeNumber);
        System.out.println("----------");
        printArray(numbers);
        System.out.println(changeNumber);
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

    /**
     * Change each value by adding the changeVal
     * @param numbers   the array to change
     * @param changeVal the number to add to all the values
     */
    public static void changeArrayValues(int [] numbers, int changeVal)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] += changeVal;
        }
        changeVal *= 100;
    }

    public static void printArray(int [] numbers)
    {
       for(int value : numbers)
        {
            System.out.println(value);
        }
    }
}