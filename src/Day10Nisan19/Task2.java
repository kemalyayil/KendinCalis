package Day10Nisan19;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // write a java program to convert temperature from Fahren. to Cels.
        // c = (f-32) * 5/9

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fahrenheit degree is = ");

        double fahrValue = scanner.nextDouble();
        double celsValue = (fahrValue-32) * 5/9;
        System.out.println("Celsius value is == > " + celsValue);


    }
}
