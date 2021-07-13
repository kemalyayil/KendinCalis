package Day12Nisan22;

import java.util.Scanner;

public class Task2 {
     // get 2 int from user using nextInt()
    // concatenate them together

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Your first number = ");
        int num1 = scanner.nextInt();
        String strNum1 = Integer.toString(num1);

        System.out.print("Your second number = ");
        int num2 = scanner.nextInt();
        String strNum2 = Integer.toString(num2);

        System.out.println(strNum1.concat(strNum2));


    }

}
