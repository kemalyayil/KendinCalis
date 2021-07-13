package Day13Nisan23;

import java.util.Random;
import java.util.Scanner;

public class _01_GameTask {
    public static void main(String[] args) {
        // ask number from user between  0  and 5
        // generate a random number
        // check if the user number and random number are equal
        // if equals print "you win" else "you lose"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number between 0 and 5 = ");
        int number = scanner.nextInt();

        Random random = new Random();
        int rnd = random.nextInt(5);
        System.out.println("Random number is = " + rnd);
        if (number == rnd ){
            System.out.println("The numbers are equal, you win");

        }else{
            System.out.println("You lose");
        }
    }
}
