package sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {3, 14, 3, 0, 4, 1, 7, 2, 5, 6};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int smallestNum = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[smallestNum]){
                    smallestNum = j;
                }
            }
            swap(arr, i, smallestNum);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
