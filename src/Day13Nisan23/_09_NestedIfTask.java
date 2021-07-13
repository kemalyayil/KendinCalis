package Day13Nisan23;

import java.util.Random;
import java.util.Scanner;

public class _09_NestedIfTask {
    public static void main(String[] args) {
        // ask number from user between  0  and 5
        // generate a random number
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"
        // if number is out of 0 - 5 print invalid number
        // use nested if

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5 = ");
        int number = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(5);
        System.out.println("Random number is = " + randomNumber);

        if (number < 5 && number > 0){
            if (number == randomNumber){
                System.out.println("You win");
            } else {
                System.out.println("You lost");
            }
        }else {
            System.out.println("Invalid number");
        }

    }

}
