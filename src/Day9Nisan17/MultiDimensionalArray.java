package Day9Nisan17;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] list1 = { "1", "2"};  // one d array
        String[] list2 = { "3", "4"};
        String[] list3 = { "5", "6"};



        String [][] listOfLists ={{ "1", "2"},{ "3", "4"},{ "5", "6"}};
        System.out.println(Arrays.deepToString(listOfLists));

        int [][] ageAndGrad = new int[4][2];
        ageAndGrad[0][0] = 35;
        ageAndGrad[0][1] = 2010;
        System.out.println(Arrays.deepToString(ageAndGrad));

        ageAndGrad[1][0] = 40;
        ageAndGrad[1][1] = 2003;
        System.out.println(Arrays.deepToString(ageAndGrad));

        ageAndGrad [2] [0]= 60;
        ageAndGrad [2] [1]= 1985;
        ageAndGrad [3] [0]= 24;
        ageAndGrad [3] [1]= 2020;
        System.out.println(Arrays.deepToString(ageAndGrad));

    }
}
