package Day9Nisan17;

import java.util.Scanner;

public class _02_GettingMoreUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name ?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        byte age= scanner.nextByte();

        System.out.println("You are = " + name);
        System.out.println("You are  " + age + " years old.");
    }



}
