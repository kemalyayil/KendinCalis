package Day16Nisan29;

import java.util.Scanner;

public class _03_BreakTask2 {
    public static void main(String[] args) {
        //get a string from user
        // using for loop print each letter in a new line
        // part 2 = stop if you encounter space character

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write sth for fun... = ");
        String input = scanner.nextLine();

        char letter ;
        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            if (letter == ' '){
                break;
        }
            System.out.println(letter);
        }

    }

}
