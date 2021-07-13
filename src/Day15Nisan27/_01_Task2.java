package Day15Nisan27;

import java.util.Scanner;

public class _01_Task2 {
    public static void main(String[] args) {

     // get a number from user
        // print the sum of numbers from 0 up to number from user

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your number = ");
        int userInput = scanner.nextInt();

        int sum = 0;
        int i = 0;
        while (i<=userInput){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
