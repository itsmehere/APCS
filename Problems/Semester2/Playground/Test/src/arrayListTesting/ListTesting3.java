package arrayListTesting;
import java.util.ArrayList;

public class ListTesting3 {
    public static void main(String[] args) {
        // For each loop using ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++) {
            arr.add(i);
        }
        for(Integer element : arr) {
            System.out.println(element + " and the type is: " + element.getClass());
        }

        // For each loop using Arrays
        int[] arr2 = new int[5];
        for(int i = 0; i < 5; i++){
            arr2[i] = i;
        }

        for(int element : arr2) {
            System.out.println(element);
        }
    }
}
