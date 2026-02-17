/**
 * Practice using 2D arrays
 * @author YOUR NAME HERE
 * @version Nov 21 2018
 */

 public class Main
 {
     public static void main(String [] args)
     {
         int [][] matrix1 = new int[2][3];
         int [][] matrix2 = new int[5][6];
         int [][] matrix3 = new int[5][6];
         int [][] m23;

         initialize(matrix1);
         //print(matrix1);
         System.out.println("Matrix 1");
         initialize(matrix1);
         print(matrix1);

         System.out.println("\nMatrix 2");
         initialize(matrix2);
         print(matrix2);
         System.out.println("\nMatrix 3");
         initialize(matrix3);
         print(matrix3);
        
        System.out.println("\nSum of Matrices");
        m23 = addMatrices(matrix2, matrix3);
        if(m23 != null)
            print(m23);

        System.out.println("\nMultiply a matrix by 2");
        int [][] product = scalarMultiplication(matrix1, 2);
        if(product != null)
            print(product);
            
        System.out.println("end of program");

     }

     /**
      * populate array with random values between 1 and 20
      * @param array    the array that needs to be initialized
      */

    public static void initialize(int [][] array)
    {
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c < array[r].length; c++)
            {
                array[r][c] = (int)(Math.random() * 20 + 1);
            }
        }
    }

    /**
     * print method for the array
     */

    public static void print(int [][] array)
    {
        for(int [] row : array) //each array (row)
        {
            for(int element : row)  //each element in each row
            {
                System.out.print(element + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * add two matrices of the same width and height
     * PRE-CONDITION - both a and b are rectangular arrays
     * @param a first array
     * @param b second array
     */

    public static int [][] addMatrices(int [][] a, int [][]b)
    {
        int [][] newArray = null;
        //check to see if the matrices are the same width
        //and height
        if(a.length == b.length && a[0].length == b[0].length)
        {
            newArray = new int[a.length][a[0].length];

            for(int r = 0; r < a.length; r++)
            {
                for(int c = 0; c < a[r].length; c++)
                {
                    newArray[r][c] = a[r][c] + b[r][c];
                }
            }

            
        }
        
        return newArray;
        
    }

    /**
     * Creates a copy of the given array
     * @param matrix    the 2D rectangular matrix
     * @return  a new rectangular matrix of the same size
     */

    public static int [][] copy(int [][] matrix)
    {
        //complete!
        return null;
    }

    /**
     * Performs scalar multiplication (each element multiplied
     * by a scalar value)
     * @param matrix    original matrix
     * @param scalar    scalar value
     * @return  a new array after the operation is completed
     */

     public static int [][] scalarMultiplication(int [][] matrix, int scalar)
     {
        //complete!
        return null;
     }

    /**
     * Transposes an array. width and length switched
     * @param matrix    original matrix
     * @return  transposed matrix
     */

    public static int [][] transpose(int [][] a)
    {
        //complete!
        return null;
    }
 }