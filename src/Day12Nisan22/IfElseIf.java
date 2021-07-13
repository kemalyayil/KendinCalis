package Day12Nisan22;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        /*
        if temp >= 30 print hot
        if temp >= 18 && 30 print it is a good weather
        if temp < 18 print cold.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature = ");
        int temp = scanner.nextInt();

        if (temp >= 30){
            System.out.println("Hot");
        }else if (temp >=18 && temp<=30){
            System.out.println("It is a good weather");
        }else {
            System.out.println("Cold ");
        }

    }
}
