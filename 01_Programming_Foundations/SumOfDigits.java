public class SumOfDigits
{
    public static void main(String[] args)
    {
        //declare our input number
        int input = 123;
        int sum = 0;

        sum = sumDigits(input);

        System.out.println("Input: " + input);
        System.out.println("Sum: " + sum);  
    }

    public static int sumDigits(int originalNumber)
    {
        int sum = 0;
        //to get each digit, we need to find the remainder
        //when divided by 10 (10 = place values)
        //to get the remaining digits, divide by 10 (integer math)

        while(originalNumber > 0)    //keep finding digits so long as the number is not 0
        {
            //add the sum by the last digit
            sum += originalNumber % 10;

            //get the remaining digits
            originalNumber = originalNumber / 10; //input /= 10;
        }
        return sum;
    }
}
