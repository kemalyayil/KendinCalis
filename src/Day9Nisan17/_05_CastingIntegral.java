package Day9Nisan17;

import java.util.Scanner;

public class _05_CastingIntegral {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your byte");
        byte myByte = (byte) scanner.nextLong(); // long byte dan buyuk oldugu icin casting yapmak lazim
        System.out.println("Mybyte : " + myByte);

        int myInteger = Integer.parseInt(scanner.nextLine()); // int i string e cevirdik
    }
}
