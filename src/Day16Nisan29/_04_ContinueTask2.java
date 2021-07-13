package Day16Nisan29;

import java.util.Scanner;

public class _04_ContinueTask2 {
    // get text from the user, print each letter in a new line
    // skip space or semi-column characters
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your words = ");
        String input = scanner.nextLine();

        char karakter ;
        for (int i = 0; i < input.length(); i++) {
            karakter = input.charAt(i);
            if (karakter == ' ' || karakter == ';') {
                continue;
            }
            System.out.println(karakter);
        }

    }
}
