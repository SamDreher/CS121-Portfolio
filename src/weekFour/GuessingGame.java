package weekFour;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create an instance of Scanner class
        Scanner scn = new Scanner(System.in);
       // System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up: ");
        int guess;
        int number = 35;
       // String userGuess = scn.nextLine(); // 1 - 100 or q
        boolean q = false;
        while(!q)
        { System.out.println("Guess a number between 1 and 100, or enter 'q' if you give up: ");
            String userGuess = scn.nextLine(); // 1 - 100 or q
            // Number of guesses counter
            if(userGuess.equals("q")){
                System.out.println("Quitter");
                q = true;
                break;

            }else{
                int uGuess = Integer.parseInt(userGuess);
                if(uGuess > number) {
                    // Guess is too high
                    System.out.println("Too high");
                }else if(uGuess < number) {
                    // Guess is too low
                    System.out.println("Too low");
                }
                else {
                    System.out.println("Just right");
                    q = true;
                    break;
                }
            }
        }
    }
}