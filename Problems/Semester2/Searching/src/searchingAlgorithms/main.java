package searchingAlgorithms;

public class main {

	public static void main(String[] args) {
		int[] numArray = {7, 14, 22, 29, 34, 172, 212};
		//System.out.println(sequentialSearch(numArray, 34));
		System.out.println(binarySearch(numArray, 23));
	}
	
	public static int sequentialSearch(int[] arr, int element) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int element) {
		int right = arr.length - 1;
		int left = 0;
		int middle = (right + left) / 2;
		
		while(left <= right) {
			if(element == arr[middle]) {
				return middle;
			} else if (element < arr[middle]) {
				right = middle - 1;
			} else if (element > arr[middle]) {
				left = middle + 1;
			}
			middle = (right + left) / 2;
		}
		return -1;
	}

}
