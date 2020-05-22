package summerhw;

import java.util.Random;

public class InitArray {
    public static void main(String[] args){
        if(args.length == 2){
            int rows = Integer.parseInt(args[0]);
            int cols = Integer.parseInt(args[1]);
            int[][] arr = new int[rows][cols];
            initArray(arr);

            Random rand = new Random();

            System.out.println(arr[rand.nextInt(rows)][rand.nextInt(cols)]);
        }
    }

    public static void initArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = i * j;
            }
        }
    }
}
