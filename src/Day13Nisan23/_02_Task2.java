package Day13Nisan23;

import java.util.Scanner;

public class _02_Task2 {
    public static void main(String[] args) {
        // get string input from the user
        // if it contains 'a' and 'b', print "The input contains both a and b"
        // else print "The input does not contains both a and b"

        // part 2
        // if input only contains a
        // if input only contains b

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls write your motto = ");
        String userInput = scanner.nextLine();

        if (userInput.contains("a") && userInput.contains("b")) {
            System.out.println("The input contains both a and b");
        } else if (userInput.contains("a")) {
            System.out.println("The input contains only a");
        } else if (userInput.contains("b")) {
            System.out.println("The input contains only b");
        } else {
            System.out.println("The input does not contain both a and b");


            // yukardaki dogru, fakat asagidaki diger cozme yontemi
//        String output;
//        if (userInput.contains("a") && userInput.contains("b")){
//           output = "contains";
//        }else {
//            output = "does not contain";
//        }
//        System.out.println("input " + output + " both a and b ");
        }
    }
}
