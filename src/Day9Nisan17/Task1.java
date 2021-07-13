package Day9Nisan17;

import java.util.Scanner;

public class Task1 {
    // 1 Where are you from ?
    // 2 Where do you live?
    // Print the result

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where are you from ?");
        String countryFrom = scanner.nextLine();

        System.out.println("Where do you live?");
        String countryLive = scanner.nextLine();

        System.out.println("You are from " + countryFrom);
        System.out.println("You live in " + countryLive);

    }
}
