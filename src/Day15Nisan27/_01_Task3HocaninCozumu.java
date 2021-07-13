package Day15Nisan27;

import java.util.Scanner;

public class _01_Task3HocaninCozumu {
    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 8787

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your pin");
        int correctPin = 8787;
        int userPin = scanner.nextInt();

        while (userPin != correctPin) {
                System.out.println("Incorrect pin, enter again");
                userPin = scanner.nextInt();

            }
        System.out.println("You are logged in"); // line 18-22 arasini gecerse zaten dogru pin i girmistir.
        }

    }


