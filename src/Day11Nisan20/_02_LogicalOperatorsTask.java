package Day11Nisan20;

import java.util.Locale;
import java.util.Scanner;

public class _02_LogicalOperatorsTask {
    public static void main(String[] args) {

        // get string input from the user
        // check if it contains 'a' and 'b'
        // check if it contains 'a' or 'c'
        // check if it does Not contain 'c'
        // check if it does Not contain 'c' and 'd'

        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your motto =");
        String str = scanner.nextLine().toLowerCase(Locale.ROOT);
        boolean ifContainAB = str.contains("a") && str.contains("b");
        boolean ifContainAorC = str.contains("a") || str.contains("c");
        boolean notContainC = !str.contains("c");
        boolean notContainAC = (!str.contains("c") && !str.contains("d"));

        System.out.println("ifContainAB = " + ifContainAB);
        System.out.println("ifContainAorC = " + ifContainAorC);
        System.out.println("notContainC = " + notContainC);
        System.out.println("notContainAC = " + notContainAC);


    }
}
