/* Guess the Number GAME */

import java.util.*;
import java.lang.String;

public class guessgame {
    public static void main(String[] args) {
        Random Random_number = new Random();
        int right_guess = Random_number.nextInt(100);
        int turns = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**** Let's play a game ****\n");
        System.out.println("Guess a number between 1 to 100, You will have 7 turns!");
        System.out.println("Best of Luck!");
        System.out.println("\nWhat is your first guess?");

        int guess;
        int i = 0;
        boolean win = false;
        while (win == false) {
            guess = scan.nextInt();
            turns++;

            if (guess == right_guess) {
                win = true;
            } else if (i > 5) {
                System.out.println("You loose! The right answer was: " + right_guess);
                return;
            } else if (guess < right_guess) {
                i++;
                System.out.println("Your Guess is lower than the right guess! : Turns left: " + (7 - i));

            } else if (guess > right_guess) {
                i++;
                System.out.println("Your Guess is higher than the right Guess! : Turns left: " + (7 - i));

            }

        }
        double score = ((8 - turns) / 7.00) * 100;
        System.out.println("\nCongratulation : You win!");
        System.out.println("My number was " + right_guess);
        System.out.println("You used " + turns + " turns to guess the right number");
        System.out.println("Your score is " + String.format("%.2f", score) + " out of 100");

        System.out.println("\nDo you want to Play again? [ y/n ]");
        String play_again = scan.next();
        if (play_again.equals("y")) {
            main(args);
        } else {
            System.out.println("Thank you for playing!");
        }
    }
}