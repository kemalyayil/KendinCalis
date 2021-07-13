package Day16Nisan29;

import java.util.Scanner;

public class _03_BreakTask {
    public static void main(String[] args) {
        // get number form user
        // count from 0 until the number
        // if the count is larger than 10, stop

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int userInput = scanner.nextInt();


        for (int i = 0; i <= userInput; i++) {
            System.out.println(i);
            if (i >= 10){
                break;
            }
        }

    }
}
