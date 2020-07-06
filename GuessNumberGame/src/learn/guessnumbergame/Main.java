package learn.guessnumbergame;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
         * The concept of game:
         *
         * generate a random number and ask user to guess a number
         * continue asking until ypu receive the number
         * after 5 times of guessing show a game over massage
         *
         */

        System.out.println("Welcome to the Game!");
        System.out.print("Enter your name please: ");

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.print("Start the game? (enter y or n): ");
        String yes = "y";
        String no = "n";
        String answer = in.nextLine();

        while (answer.equals(no)) {
            System.out.print("Start the game? (enter y or n): ");
            answer = in.nextLine();
        }

        Random rand = new Random();
        int number = rand.nextInt(20) + 1;

        System.out.print("Please guess a number from 0 to 20: ");
        int guess = in.nextInt();

        int timesTries = 0;
        boolean hasWon = false;
        boolean finish = false;

        while (!finish) {
            timesTries++;

            if (timesTries < 5) {
                if (guess == number) {
                    hasWon = true;
                    finish = true;
                } else if (guess > number){
                    System.out.print("Please guess a lower number: ");
                    guess = in.nextInt();
                } else {
                    System.out.print("Please guess a higher number: ");
                    guess = in.nextInt();
                }
            } else {
                finish = true;
            }
        }

        if (hasWon) {
            System.out.println("Congrats! You have guessed the number " + number + " in your " + timesTries + " guess.");
        } else {
            System.out.println("Game Over!");
            System.out.println("The number was " + number);
        }
        System.out.println("Bye!");
    }
}
