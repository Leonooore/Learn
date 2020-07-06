package learn.arrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Ann", "Nora", "Nick", "Josh", "Peter"};
        int[] numbers = {3212144, 5648585, 5584432, 7442802, 1443892};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.print("Please enter a Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println( name + " number is " + numbers[i]);
            }
        }
    }
}
