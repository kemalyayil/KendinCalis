package Day10Nisan19;

import java.util.Scanner;

public class _03_MultiplicationTask {
    public static void main(String[] args) {
        // create a program that takes 2 numbers from the user
        // print their products


        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls enter your first number : ");
        int firstNum = scanner.nextInt();

        System.out.print("Pls enter your second number : ");
        int secondNum = scanner.nextInt();

        System.out.println(firstNum * secondNum);
    }
}
