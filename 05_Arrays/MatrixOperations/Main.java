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
        //complete!
    }

    /**
     * print method for the array
     */

    public static void print(int [][] array)
    {
        //complete!
    }

    /**
     * add two matrices of the same width and height
     * @param a first array
     * @param b second array
     */

    public static int [][] addMatrices(int [][] a, int [][]b)
    {
        //complete!
    }

    /**
     * Creates a copy of the given array
     * @param matrix    the 2D rectangular matrix
     * @return  a new rectangular matrix of the same size
     */

    public static int [][] copy(int [][] matrix)
    {
        //complete!
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
     }

    /**
     * Transposes an array. width and length switched
     * @param matrix    original matrix
     * @return  transposed matrix
     */

    public static int [][] transpose(int [][] a)
    {
        //complete!
    }
 }