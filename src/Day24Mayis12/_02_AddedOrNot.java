package Day24Mayis12;

import java.util.HashSet;
import java.util.Random;

public class _02_AddedOrNot {
    public static void main(String[] args) {

        HashSet<Integer>set = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int random2 = random.nextInt(5);
            boolean isAdded = set.add(random2);
            System.out.println(random2 + " = is added " + isAdded);
        }

        System.out.println(set);  // 5 e kadar 5 numara uret dedik. ayni olanlari false yazip , yazdirmadi.


    }
}
