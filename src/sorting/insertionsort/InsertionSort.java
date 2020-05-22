package sorting.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {3, 14, 3, 0, 4, 1, 7, 2, 5, 6};
        int[] arr = {1, 7, 8, 2, 4, 6, 3};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionsort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int current = i + 1;
            for(int j = current; j >= 0; j--){
                if(arr[current] < arr[j]){
                    swap(arr, current, j);
                    current--;
                }
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
