package Day11Nisan20;

import java.util.Scanner;

public class IfTask {
    public static void main(String[] args) {
        // get an int from user
        // if it is larger than 100, print passed.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Grade = ");
        int number = scanner.nextInt();
        if (number>100){
            System.out.println("Passed");
        }

    }
}
