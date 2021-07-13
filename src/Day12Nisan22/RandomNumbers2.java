package Day12Nisan22;

import java.util.Random;

public class RandomNumbers2 {
    public static void main(String[] args) {

       // formula
        // (Math.random () * (max - min) + min;

        //Task
        // generate random number btw 25 and 390.

        Random random = new Random();
        int number  = random.nextInt(365)+25;
        System.out.println("Random Class = " + number);

        int rnd = (int) (Math.random() * 365)+25; //
        System.out.println("Math random = " + rnd);

    }
}
