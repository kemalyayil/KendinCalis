package Day15Nisan27;

import java.util.Scanner;

public class _01_Task3HocaninCozumu_DahaKisa {
    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 8787

        Scanner scanner = new Scanner(System.in);  // bu benim cozdugum yol, ayni zamanda da hoca daha kisa dedi.
        System.out.println("Enter your pin");
        int userPin = scanner.nextInt();
        int correctPin = 8787;

        while (true) {
            if (userPin == correctPin) {
                System.out.println("you are logged in");
                break;
            } else {
                System.out.println("Incorrect pin,pls enter again");
                userPin = scanner.nextInt();

            }
        }
    }
}


