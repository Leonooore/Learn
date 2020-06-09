package learn.example.randomshuffle;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            numbers.add(i);
        }

        Collections.shuffle(numbers);
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
