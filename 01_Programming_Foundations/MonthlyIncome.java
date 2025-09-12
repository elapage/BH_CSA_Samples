/**
 * Calculates the monthly income based on a
 * certain salary
 * 
 * @author in class sample
 * @version Sept 12 2025
 */

public class MonthlyIncome
{
    public static void main(String[] args)
    {
        double income;  //calculated from rate and base 
        double rate, base; //determined from table
        //we'll preset the monthly sales
        double sales = 51000;

        //generate an if-statement from the given table
        if (sales >= 50000)
        {
            base = 375;
            rate = 0.16;
        }
        else if (sales >= 40000)
        {
            base = 350;
            rate = 0.14;
        }
        else if(sales >= 30000)
        {
            base = 325;
            rate = 0.12;
        }
        else if(sales >= 20000)
        {
            base = 300;
            rate = 0.09;
        }
        else if (sales >= 10000)
        {
            base = 250;
            rate = 0.05;
        }
        else
        {
            base = 200;
            rate = 0.03;
        }

        income = base + sales * rate;

        System.out.println("base: " + base);
        System.out.println("Rate: " + rate);

    }
    
}
