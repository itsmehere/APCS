package aptestpratice.arrayTesterProblem;

import com.sun.xml.internal.bind.v2.TODO;

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

    public static boolean hasAllValues(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(!contains(arr1[i], arr2)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean contains(int value, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicates(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if((j != i) && (arr[j] == arr[i])){
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean isLatin(int[][] square){
        if(!containsDuplicates(square[0])){
            for(int i = 0; i < square.length; i++){
                if(!hasAllValues(square[0], square[i]) || !hasAllValues(square[0], getColumn(square, i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // To test getColumn method
        int [][] arr2D = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };
        int[] result = ArrayTester.getColumn(arr2D, 1);

        System.out.println("It should print the values from the second column: 1 4 7 5.");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        // To test isLatin method
        int [] [] arr2D2 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 }};
        boolean test = isLatin(arr2D2);

        System.out.println("If isLatin is implemented correctly, then test should be true.");
        if (!test) {
            System.out.print("Uh oh! isLatin(test) was false, but it should be true.");
        } else {
            System.out.println("YAY, isLatin works!");
        }
    }
}
