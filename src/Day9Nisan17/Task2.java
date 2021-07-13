package Day9Nisan17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // create a program that asks you name,age and height. and print

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        byte age = scanner.nextByte();

        System.out.println("How tall are you?");
        double height = scanner.nextDouble();


        System.out.print("Your name is " + name);
        System.out.print("You are " + age + " years old...");
        System.out.print("Your height is " + height);
    }


}
