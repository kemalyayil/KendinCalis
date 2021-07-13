package Day12Nisan22;

import java.util.Scanner;

public class Task1 {
    // get number from user as a string
    // check if the number is bigger than 100.
    // if it is biggger than 100, print "It is bigger than 100"

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number :");
        String input = scanner.nextLine();
        int inputToInteger = Integer.parseInt(input);

        if (inputToInteger > 100){
            System.out.println("It is bigger than 100");
        }


    }
}
