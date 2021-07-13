package Day17Nisan30;

import java.util.Scanner;

public class LoopsQuestion3 {
    public static void main(String[] args) {
/*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25

        Example 3:
        Input: 14
        Output: false

     */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int userNumber = scanner.nextInt();

       boolean isPerfectSquare = false;
        for (int i = 0; i * i <= userNumber; i++) {
            if (i * i == userNumber) {
                isPerfectSquare = true;
            }

            }
        System.out.println(isPerfectSquare);
        }


    }

