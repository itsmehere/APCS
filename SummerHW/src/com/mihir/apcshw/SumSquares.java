package com.mihir.apcshw;
import java.util.Arrays;

public class SumSquares {
    public static void main(String[] args) {
        if(args.length == 2) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println(sumSquares(x, y));
        }
    }

    public static int sumSquares(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            sum = sum + (i * i);
        }
        return sum;
    }
}
