package Day14Nisan26;

import java.util.Scanner;

public class _01_Task3 {
    public static void main(String[] args) {
        // write a java program which calculates the sum;
        // using for loop
        // get toSum number from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("number pls = ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i <= number ; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
