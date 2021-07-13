package Day16Nisan29;

import java.util.Scanner;

public class _02_DoWhileTask {
    public static void main(String[] args) {

        // ask the user for pin number
        // if the pin number is incorrect keep asking the user for pin number
        // when the pin is correct print out "you are logged in"
        // the correct pin is 3535
        // use do - While

        Scanner scanner = new Scanner(System.in);
        int correctPin = 3535;
        int userPin = 0;

        do{
            System.out.print("Enter your pin = ");
            userPin = scanner.nextInt(); // line 16 da yazmamizin nedeni loop ta iki defa kullacak olmamiz.
        }while (userPin != correctPin);  // zira yukarda onu kullanmazak , kullanmak istedigimizde tek yerde kullanabiliyoruz

        System.out.println("You are logged in");

    }

}
