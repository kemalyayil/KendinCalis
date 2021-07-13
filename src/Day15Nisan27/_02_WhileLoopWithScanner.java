package Day15Nisan27;

import java.util.Locale;
import java.util.Scanner;

public class _02_WhileLoopWithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";

//      while (!input.equals("quit")){  //ilk olarak bu vardi.
        while (true) {
            System.out.print("Enter input = ");
            input = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }

    }
}

