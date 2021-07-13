package Day13Nisan23;

import java.util.Scanner;

public class _10_NestedIfTask {
    public static void main(String[] args) {
        // get 2 numbers from user
        // if first number is larger than zero, check second number, if second number is larger than 5 print "ok" else print "not ok"
        // if first number is less than or equal to zero, print "too cold to check"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature = ");
        int temp = scanner.nextInt();
//        System.out.print("Pressure = ");   // buraya yazarsak, temp geregi yerine getirilmedigi zaman
//        int pressure = scanner.nextInt();    // pressure i da soruyor. ama line 18 e koydugumuzda eger ilk condition is not ok, pressure i hic sormuyor

        if (temp > 0){
            System.out.print("Pressure = ");
            int pressure = scanner.nextInt();

            if (pressure > 5){
                System.out.println("OK");
            }else {
                System.out.println("not ok");
            }
        }else {
            System.out.println("too cold to check");
        }
    }
}
