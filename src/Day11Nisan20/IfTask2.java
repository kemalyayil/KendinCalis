package Day11Nisan20;

import java.util.Scanner;

public class IfTask2 {
    // get a number from the user
    // check if it is positive or negative
    // part 2 = check for zero also

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Pls enter a number = ");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("Positive");
        }
        if (number < 0){
            System.out.println("Negative");
        }
        if (number == 0){
            System.out.println("zero");
        }
    }


}
