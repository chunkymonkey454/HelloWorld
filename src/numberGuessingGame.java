import java.util.Scanner;
import java.util.Random;

public class numberGuessingGame {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int secret = rand.nextInt(1, 11);
        int guess = 0;
        System.out.println("Make a guess [1-10]");
        guess = in.nextInt();
        in.nextLine(); //clear the buffer

        if(guess==secret){
            System.out.println("You guessed right");
        }
        else if(guess > secret){
            System.out.println("You guessed too high");
        }
        else{
            System.out.println("You guessed too low");
        }
        System.out.println("The secret number is "+secret);




    }
}
