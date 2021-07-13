package Day17Nisan30;

import java.util.Scanner;

public class LoopsQuestion2 {
    public static void main(String[] args) {
       /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int userNumber = scanner.nextInt();

        int factorialNumber = 1;        // bu cok onemli. 0 yazarsan sifirla carpilan her sayi sifir. sonuc hep sifir olur
        for (int i = 1; i <= userNumber; i++) {
            factorialNumber *= i;
        }
        System.out.println(factorialNumber);
    }
}
