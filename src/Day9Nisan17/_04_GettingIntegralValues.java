package Day9Nisan17;

import java.util.Scanner;

public class _04_GettingIntegralValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some byte : ");
        byte byteInput = scanner.nextByte();

        System.out.print("Enter some short : ");
        short shortInput = scanner.nextShort();

        System.out.print("Enter some short : ");
        int intInput = scanner.nextInt();

        System.out.print("Enter some long : ");
        long longInput = scanner.nextLong();

        System.out.println("Byte    : " + byteInput);
        System.out.println("Short   : " + shortInput);
        System.out.println("Integer : " + intInput);
        System.out.println("Long    : " + longInput);
    }
}
