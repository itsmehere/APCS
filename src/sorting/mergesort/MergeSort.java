package sorting.mergesort;

public class MergeSort {
	
	public static void sort(int[] a) {
		int middle = (a.length / 2) - 1;
		int[] first = new int[middle + 1];
		int[] second = new int[a.length - first.length];
		
		if(a.length <= 1) {
			return;
		}
		
		for(int i = 0; i < first.length; i++) {
			first[i] = a[i];
		}
		for(int j = 0; j < second.length; j++) {
			second[j] = a[first.length + j];
		}
		
		sort(first);
		sort(second);
		merge(first, second, a);
	}
	
	public static void merge(int[] arrA, int[] arrB, int[] orgArr) {
		int a = 0;
		int b = 0;
		int index = 0;
		
		while(a < arrA.length && b < arrB.length) {
			if(arrA[a] < arrB[b]) {
				orgArr[index] = arrA[a];
				a++;
			} else {
				orgArr[index] = arrB[b];
				b++;
			}
			index++;
		}
		
		while(a < arrA.length) {
			orgArr[index] = arrA[a];
			a++;
			index++;
		}
		while(b < arrB.length) {
			orgArr[index] = arrB[b];
			b++;
			index++;
		}
		
	}
	
}
