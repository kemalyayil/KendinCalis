package Day10Nisan19;

import java.util.Scanner;

public class _02_SubtractionTask {
    public static void main(String[] args) {

        //create a program that subtracts a number from 100
        // this number must come from user

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number :");
        int userNumber = scanner.nextInt();

        System.out.println("Subtraction of your number from 100 is ---> " + (100 - userNumber));
    }
}
