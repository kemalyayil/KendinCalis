package Day25Mayis17;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _01_CollectionsTask {
    // create list of 5 numbers from user input
    // sort the list in reverse order(!= reversing) and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it


    // part 2: find the max number and min number, print them
    // replace all max number with min number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("This is our list = " + list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Reverse order   = " + list);

        Collections.shuffle(list);
        System.out.println("Shuffle         = " + list);

        Collections.rotate(list,3);
        System.out.println("Rotate Right 3  = " + list);


        // Part 2
        System.out.println("============PART 2============");

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("Max number is   = " + max);
        System.out.println("Min number is   = " + min);

        Collections.replaceAll(list,max,min);
        System.out.println("Replace max2min = " + list);




    }
}
