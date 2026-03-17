/**
 * A quick programming example that shows the selection sort at work
 * @author YOUR NAME HERE
 * @version Feb 11 2019
 */

 public class SelectionSort
 {
     public static void main(String [] args)
     {
         //create a new set of data and initialize
        int [] data = new int[20];  
        for(int i = 0; i<data.length; i++)
            data[i] = (int)(Math.random() * 100 + 1);
        
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
            System.out.print(list[i] + ", ");
        
        System.out.println(list[list.length-1]);
     }

    /**
     * Sorting method that uses the in-place selection sort method
     * @param data list to be sorted
     */

     public static void sort(int [] data)
     {
        int minimumPosition;    //position of the minimum value

        for(int i = 0; i < data.length - 1; i++)
        {
            minimumPosition = i;

            //go through the list as of the next item and
            //compare
            for(int j = i + 1; j < data.length; j++)
            {
                if(data[j] < data[minimumPosition])
                {
                    minimumPosition = j;
                }
            }

            //swap so long as minimumPosition is different from i
            if(i != minimumPosition)
            {
                int temp = data[i];
                data[i] = data[minimumPosition];
                data[minimumPosition] = temp;
            }
        }

     }
 }