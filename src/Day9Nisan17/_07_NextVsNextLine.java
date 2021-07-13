package Day9Nisan17;

import java.util.Scanner;

public class _07_NextVsNextLine {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.print("Name :");
        // trim stringle uygulannan bi method oldugu icin kullanabiliriz.
        String name = scanner.next().trim(); // will read the object untill first space.nextline: whole line
        System.out.println("");
        System.out.println("Your name : " + name);

    }
}
