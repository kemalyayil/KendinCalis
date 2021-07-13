package Day9Nisan17;

import java.util.Scanner;

public class _03_GettingBoolean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you a fat person?");
        boolean fatPerson = scanner.nextBoolean();

        System.out.println("You are a fat person ---> " + fatPerson);
    }
}
