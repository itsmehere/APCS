package sorting.heapsort;
import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		int[] arr = {9, 2, 4, 5, 1, 34};
		heapsort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void heapsort(int[] arr) {
		int arrLength = arr.length;
		
		for(int i = arr.length - 1; i > 0; i--) {
			
			for(int j = (arr.length / 2) - 1; j >= 0; j--) {
				heapify(arr, arrLength, j);
			}
			
			swap(arr, 0, i);
			arrLength--;
		}
	}
	
	/*
	 * Version 2: Another way to write the heapsort method
	 * 
	public static void heapsort(int[] arr) {
		int arrLength = arr.length;
		
		for(int j = 0; j < arr.length; j++) {
			for(int i = arrLength; i >= 0; i--) {
				heapify(arr, arrLength, i);
			}
			arrLength--;
			if(arrLength >= 1) {
				swap(arr, 0, arrLength);
			}
		}
	}
	*/
	public static void heapify(int[] arr, int heapSize, int i) {
		int largest = i; // Initialize largest as root 
        int left = 2 * i + 1; // left = 2*i + 1 
        int right = 2 * i + 2; // right = 2*i + 2
        
        if(left < heapSize && arr[left] > arr[largest]) {
        	swap(arr, left, largest);
        	heapify(arr, heapSize, left);
        }
        	
        if(right < heapSize && arr[right] > arr[largest]) {
        	swap(arr, right, largest);
        	heapify(arr, heapSize, right);
        }
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
