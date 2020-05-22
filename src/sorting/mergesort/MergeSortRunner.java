package sorting.mergesort;
import java.util.Arrays;

public class MergeSortRunner {

	public static void main(String[] args) {
		//int[] a = ArrayUtil.randomIntArray(20, 100);
		int[] a = {9, 2, 4, 5, 1, 34};
		
		System.out.println("Array: " + Arrays.toString(a));
		
		MergeSort.sort(a);
		
		System.out.println("Sorted Array: " + Arrays.toString(a));
		
	}
}
