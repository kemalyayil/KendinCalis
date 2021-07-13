package Day24Mayis12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _02_AddedOrNotTask {
    public static void main(String[] args) {
        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have

        // find out what are the duplicated values


     int [] numbers = {1, 3, 1, 2, 4, 5, 3};
        System.out.println(Arrays.toString(numbers));

     HashSet<Integer>set = new HashSet<>();
     ArrayList<Integer>duplicatedValues=new ArrayList<>();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean isAdded = set.add(numbers[i]);
            if(!isAdded){
                count++;
                duplicatedValues.add(numbers[i]);
            }
        }
        System.out.println("We have " + count + " duplicated values !");
        System.out.println("Duplicated values are " + duplicatedValues);
    }

}
