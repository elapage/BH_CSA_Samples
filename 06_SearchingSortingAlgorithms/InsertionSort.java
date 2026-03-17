/**
 * An example of the insertion sort. The sorting algorithm is done for you. Make comments in the sorting algorithm
 * to explain how the code fits with the algorithm
 * @author YOUR NAME HERE
 */

 public class InsertionSort
 {
     public static void main(String [] args)
     {
         //create a new set of data and initialize
        int [] data = new int[20];  
        for(int i = 0; i<data.length; i++)
        {
            data[i] = (int)(Math.random() * 100 + 1);
        }
        
        //print out the unsorted list
        System.out.println("Unsorted list: ");
        print(data);

        //perform sort and print
        sort(data);
        System.out.println("Sorted list: ");
        print(data);

        System.out.println("Program ended normally");
     }

     /**
      * prints a list
      * @param list
      */

     public static void print(int [] list)
     {
        for(int i = 0; i<list.length - 1; i++)
        {
            System.out.print(list[i] + ", ");
        }
        
        System.out.println(list[list.length-1]);
     }

    /**
     * Sorts the data list using an insertion sort
     * @param data list to be sorted
     */

     public static void sort(int [] data)
     {
        for(int i = 1; i<data.length; i++)
        {
            int curr = data[i];

            int j = i -1;

            while(j >= 0 && data[j] > curr)
            {
                data[j+1] = data[j];
                j--;
            }
            
            data[j+1] = curr;
        }
     }
 }