public class ArrayTester
{

    /** Returns an array containing the elements of column c of arr2D in the same order as
     *  they appear in arr2D.
     *  Precondition: c is a valid column index in arr2D.
     *  Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[] [] arr2D, int c)
    {
        int[] arr = new int[arr2D.length];
        for(int i = 0; i < arr2D.length; i++){
            arr[i] = arr2D[i][c];
        }
        return arr;
    }

    // Main method to test getColumn method
    public static void main(String[] args)
    {
        int [][] arr2D = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };
        int[] result = ArrayTester.getColumn(arr2D, 1);
        System.out.println("It should print the values from the second column: 1 4 7 5.");
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    } // end of main

} // end of class
