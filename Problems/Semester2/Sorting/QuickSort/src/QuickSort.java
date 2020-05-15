import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] k = {3, 3, 0, 4, 1, 7, 2, 5, 6};
		quicksort(k);
		System.out.println(Arrays.toString(k));
	}
	
	public static void quicksort(int[] a) {
		quick(a, 0, a.length-1);
	}
	
	public static void quick(int[] a, int left, int right) {
		if (right > left) {
			int pivotPos = partition(a, left, right);
			quick(a, left, pivotPos-1);
			quick(a, pivotPos+1, right);
		}
	}
	
	public static int partition(int[] a, int left, int right) {
		int splitPos = left;
		for (int i = left; i < right; i++) {
			if (a[i] < a[right]) {
				swap(a, i, splitPos);
				splitPos++;
			}
		}
		swap(a,splitPos, right);
		return splitPos;
	}
	
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
