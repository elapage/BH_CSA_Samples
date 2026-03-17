/**
 * An example of implementing a recursive merge sort. We will do the recursive part together.
 * You complete the merge algorithm!
 * @author YOUR NAME HERE 
 */

public class MergeSortStarter
{
    public static void main(String [] args)
    {
        int [] left = {1, 2, 3, 4, 5};
        int [] right = {6, 7, 8, 9, 10};
        int [] list = createList(20);

        //merge the two lists together
        int [] merged = mergeSort(list);

        //System.out.println("Left: ");
        //print(left);

        //System.out.println("Right: ");
        //print(right);

        System.out.println("Unsorted: ");
        print(list);

        System.out.println("Merged: ");
        print(merged);

    }

    /**
     * Creates a list of length len and populates with random numbers between 1 and 100
     * @param len
     * @return the new list
     */
    public static int [] createList(int len)
    {
        int [] data = new int[len];  
        for(int i = 0; i<data.length; i++)
        {
            data[i] = (int)(Math.random() * 100 + 1);
        }    
        
        return data;
    }

    public static int [] mergeSort(int [] data)
    {
        int [] sorted = null;

        if(data.length < 2)    //base case
        {
            sorted = data;
        }
        else
        {
            //first step - split list in 2
            int middle = data.length / 2;
            int [] left = new int[middle];
            int [] right = new int[data.length - middle];

            //populate left and right list
            for(int i = 0; i < left.length; i++)
            {
                left[i] = data[i];
            }

            for(int i = middle; i < data.length; i++)
            {
                right[i - middle] = data[i];
            }

            //recursive call
            left = mergeSort(left);
            right = mergeSort(right);

            sorted = merge(left, right);
        }
        
        return sorted;
    }
    
    /**
     * Takes two sorted lists and merges them together into one sorted list
     * @param list1 The first sorted list to merge
     * @param list2 The second sorted list to merge
     * @return A combined sorted list
     */
    public static int [] merge(int [] list1, int [] list2)
    {
        int [] newList = new int[list1.length + list2.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;  //index for full list

        //go through each list until one is fully added
        while(leftIndex < list1.length && rightIndex < list2.length)
        {
            if(list1[leftIndex] < list2[rightIndex])
            {
                newList[index] = list1[leftIndex];
                leftIndex++;
            }
            else
            {
                newList[index] = list2[rightIndex];
                rightIndex++;
            }

            index++;
        }

        //add the remaining elements in the incomplete list
        while(leftIndex < list1.length)
        {
            newList[index] = list1[leftIndex];
            index++;
            leftIndex++;
        }

        while(rightIndex < list2.length)
        {
            newList[index] = list2[rightIndex];
            index++;
            rightIndex++;
        }

        return newList;
    }

    /**
     * Displays the list, each element seperated by a ", "
     * @param list
     */
    public static void print(int [] list)
    {
        String message = "";

        //add each element from the list to our message, followed by a comma
        for(int n : list)
        {
            message += n + ", ";
        }

        //take off trailing ","
        message = message.substring(0, message.length()-2);

        System.out.println(message);
    }



}