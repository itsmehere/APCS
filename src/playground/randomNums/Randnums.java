package playground.randomNums;

public class Randnums {
    public static void main(String args[]){
        for(int i = 0; i < 20; i++){
            int randNum = (int)(Math.random() * 5);
            System.out.print(randNum + ", ");
        }

        System.out.println();

        for(int i = 0; i < 20; i++){
            int randNum = (int)((Math.random() * 5) + 1);
            System.out.print(randNum + ", ");
        }

        System.out.println();

        int a = 10;
        int b = 20;
        for(int i = 0; i < 20; i++){
            int randNum = (int)((Math.random() * (1 + (b - a))) + a);
            System.out.print(randNum + ", ");
        }
    }
}
