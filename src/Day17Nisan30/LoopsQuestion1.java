package Day17Nisan30;

import java.util.Locale;
import java.util.Scanner;

public class LoopsQuestion1 {
    /*
        Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1

         */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Your motto = ");
        String userInput = scanner.nextLine().toLowerCase(Locale.ROOT);

       int countB = 0;
       char b = 'b';
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == b){
                countB++;
            }
        }
        System.out.println(countB);
    }
}
