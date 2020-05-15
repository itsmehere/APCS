import java.util.Scanner;

public class GuessMyNum {
    public static void main(String[] args){
        Guess(1, 100);
    }

    public static void Guess(int low, int high){
        Scanner scan = new Scanner(System.in);
        int guess = high + 10;
        int numberToGuess = (int)((Math.random() * (high - low + 1)) + low);

        while(guess != numberToGuess){
            System.out.println("Guess a number between " + low + " and " + high);
            guess = scan.nextInt();

            if(guess < numberToGuess){
                System.out.println("Higher!");
            } else if(guess > numberToGuess){
                System.out.println("Lower!");
            } else {
                System.out.println(":) YOU GUESSED IT! (:");
            }
        }
    }
}
