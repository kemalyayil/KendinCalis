package Day17Nisan30;

import java.util.Locale;
import java.util.Scanner;

public class LoopsQuestion4 {
    public static void main(String[] args) {

/*
        Write a method that uses a while loop. This method would replace every vowel in the String with X.
        (You should use while loop with if-else)

        e.g., the String
        Java is Fun
        should become
        JXvX Xs FXn

         */

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase(Locale.ROOT);

        String replacedString = "";

        int i = 0;
        while (i < input.length()) {

            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' ||
                    input.charAt(i) == 'o' || input.charAt(i) == 'u') {

                replacedString += 'X'; // w + X = wX

            } else {
                replacedString += input.charAt(i); // "" + w = w
            }

            i++;
        }

        System.out.println(replacedString);
    }
}