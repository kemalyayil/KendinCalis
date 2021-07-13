package Day25Mayis17;

import java.util.*;

public class _02_ConvertingTask {
    // create an array of random numbers of size 10 (random elements should be from 1 to 9)
    // convert that array into a list and add 5 more random elements
    // convert that list into set
    // convert that set back into list, you'll get a list without duplicates
    public static void main(String[] args) {

        Random  random  = new Random();
        Integer[]array = new Integer[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(9) + 1;
        }
        System.out.println("10 random numbers in Array = "+ Arrays.toString(array));

        List<Integer>list = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(9) + 1);
        }
        System.out.println("Array to List + 5 elements = "+list);

        Set<Integer>set = new HashSet<>(list);
        System.out.println("List to Set");


    }
}
