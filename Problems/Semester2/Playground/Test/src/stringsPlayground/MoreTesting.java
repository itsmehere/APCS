package stringsPlayground;
import java.util.Arrays;

public class MoreTesting {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		editArr(a);
		System.out.println(Arrays.toString(a)); // Prints [1, 2, 6, 4, 5]
	}
	
	public static void editArr(int[] arr) {
		arr[2] = 6;
		System.out.println(Arrays.toString(arr)); // Prints [1, 2, 6, 4, 5]
	}

}
