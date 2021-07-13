package Day14Nisan26;

import java.util.Arrays;

public class _02_ForLoopWithArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array));
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(" ");

        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
