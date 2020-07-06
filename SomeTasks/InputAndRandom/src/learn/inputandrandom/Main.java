package learn.inputandrandom;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scanner = new Scanner (System.in);
        int answer = scanner.nextInt();
        System.out.println("Answer was: " + answer);

        System.out.println("-----------------------");

        Random random = new Random();
        int number = random.nextInt(20);
        System.out.println("Random number: " + number);
    }
}
