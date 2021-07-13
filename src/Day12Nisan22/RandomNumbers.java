package Day12Nisan22;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        System.out.println(Math.random() * 100); // 0 ila 100
        System.out.println((int)(Math.random() * 200) -100); // 100 ila -100 arasi

        Random random = new Random();
        int randomNumber = random.nextInt(5) + 5; // 5 ila 10 arasinda rakam verir
        System.out.println(randomNumber);
        int numBt5A100 = random.nextInt(95)+5; // 5 ila 100 arasinda rakam verir

        // generate random number between -100 and 100
        int numBt100AMinus100 = random.nextInt(200) - 100; // 100 ila -100 arasi
        System.out.println("between -100 and 100 = " + numBt100AMinus100);

    }
}
