package generalproblems.medianproblem;
import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
        int[] a = {3, 8, 4, 1, 7, 2, 5, 6, 9};
        int[] b = {3, 8, 4, 1, 7, 2, 5, 6, 9, 10};
        int[] c = {3};
        
        //  Test cases
		//  This should print 5.0        
		  	System.out.println("The median of array a is: " + median(a));
		//  This should print 5.5        
		  	System.out.println("The median of array b is: " + median(b));
		//  This should print 3.0        
		  	System.out.println("The median of array c is: " + median(c));    
    }
	
	// quickSort is now renamed to median
	
	public static double median(int[] a) {
        return quick(a, 0, a.length-1);
    }

    public static double quick(int[] a, int left, int right) {
        if (right > left) {
            int pivotPos = partition(a, left, right);
            int middle = a.length / 2;
            
            // Now let's test to see if the pivot position is the middle.
            // The first case is if the array length is odd with a single middle;
            if (a.length % 2 != 0) {
            	if(pivotPos == middle) {
            		return a[middle];
            	}
            } else {
                if (pivotPos == middle) {
                	return ((a[middle] + select(a, left, middle - 1, 1)) / 2.0);
                } else if (pivotPos == (middle - 1)){
                	return ((a[middle - 1] + select(a, middle, right, 0)) / 2.0);
                }
            }
            // If the pivot was not equal to the middle, we need to "sort" the elements so that we are 
            // moved towards the median
            // recursion is your friend here... recursion is your friend... recursion is your...
            if (pivotPos < middle) {
            	return quick(a, pivotPos + 1, right);
            } else {
            	return quick(a, left, pivotPos - 1);
            }
            // Finally, if we ever get to a situation where we are "sorting" a single element,
            // it must be the middle element!
        } else {
            return a[left];
        }
    }

	// These are all helper methods for quickSort.  You don't need to modify anything below!      
	
	public static int partition(int[] a, int left, int right) {
	    int splitPos = left;
	    for (int i = left; i < right; i++) {
	        if (a[i] < a[right]) {
	            swap(a, i, splitPos);
	            splitPos++;
	        }
	    }
	    swap(a,splitPos,right);
	    return splitPos;
	}
	
	public static void swap(int[] a, int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
	}

    // This is code for selectionSort: if minmax = 0, find the min; otherwise find the max
    // in the array between indices left and right
    public static int select(int[] a, int left, int right, int minmax) {
        int returnValue = a[left];
        if (minmax == 0) { // find minimum
            for (int i = left; i <= right; i++) {
                if (a[i] < returnValue) {
                    returnValue = a[i];
                }
            } 
        } else { // find maximum
            for (int i = left; i <= right; i++) {
                if (a[i] > returnValue) {
                    returnValue = a[i];
                }
            }                 
        }
        return returnValue;   
    }
    
    public static void printout(int[] arr) {
    	System.out.println();
    	for(int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i]);
    	}
    }
}



