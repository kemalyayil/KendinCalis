package Day16Nisan29;

import java.util.Scanner;

public class _04_ContinueTask {
    // get a number from user, print all the numbers from 0 to numbers from user.
    // skip even numbers using continue.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int userNumber = scanner.nextInt();


        for (int i = 0; i < userNumber; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
