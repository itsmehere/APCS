package com.mihir.apcshw;

import java.util.ArrayList;

public class ConwaysGame {

    public static void main(String[] args){
        int[][] startingGrid = { { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 1, 1, 1, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 }
        };

        //Creates newGrid for the next generation.
        int[][] newGrid = conwaysGame(startingGrid);

        //prints out the next generation.
        for(int i = 0; i < newGrid.length; i++){
            for(int j = 0; j < newGrid[0].length; j++){
                if(newGrid[i][j] == 0){
                    System.out.print("○" + " ");
                } else {
                    System.out.print("●" + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] conwaysGame(int[][] arr){

        //new 2d array created.
        int[][] nextGen = new int[arr.length][arr[0].length];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){

                int aliveCells = 0;

                //finds number of alive cells.
                for(int i = (row - 1); i <= (row + 1); i ++){
                    for(int j = (col - 1); j <= (col + 1); j++){
                        if(!((i < 0) || (j < 0) || (i >= arr.length) || (j >= arr[0].length))){
                            if((arr[i][j]) == 1){
                                aliveCells += 1;
                            } else {
                                aliveCells += 0;
                            }
                        }
                    }
                }
                //Subtracts itself from the equation so that aliveCells is purely based on neighbors.
                aliveCells = aliveCells - arr[row][col];

                //RULES:

                // 1) Each cell with one or no neighbors dies, as if by solitude.
                // 2) Each cell with four or more neighbors dies, as if by overpopulation.
                // 3) Each cell with two or three neighbors survives.
                // 4) Else, a new cell is born.
                if((arr[row][col] == 1) && (aliveCells <= 1)){
                    nextGen[row][col] = 0;
                } else if((arr[row][col] == 1) && (aliveCells >= 4)){
                    nextGen[row][col] = 0;
                }else if((arr[row][col] == 1) && ((aliveCells == 2) || (aliveCells == 3))){
                    nextGen[row][col] = 1;
                } else if((arr[row][col] == 0) && (aliveCells == 3)){
                    nextGen[row][col] = 1;
                } else {
                    nextGen[row][col] = arr[row][col];
                }
            }
        }
        return nextGen;
    }
}
