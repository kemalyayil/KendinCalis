package Day18Mayis3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        // get text from the user, print only unique characters
        // blah blah blah = blah should be printed

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word");
        String input = scanner.nextLine();

        String uniqueCharacters = "";

        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (!uniqueCharacters.contains(charAt + "")) { // "" amaci String e cevirmemiz. buradaki olay "distinct" karakterleri
                uniqueCharacters += charAt; // burada toplayip, line 15 tekine gondermek
            }
        }
        System.out.println(uniqueCharacters);
    }
}