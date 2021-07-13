package Day10Nisan19;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // Take a number from user and increment it twice

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls enter your number : ");
        int number = scanner.nextInt();
        ++number;
        ++number;

        System.out.println(number);
    }
}
