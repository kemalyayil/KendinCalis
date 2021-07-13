package Day17Nisan30;

import java.util.Arrays;

public class _02_Task2 {
    public static void main(String[] args) {

        //String[][] strArray = {{"abc","def","ghi"}, {"jkl", "mno", "prs"}}; print it by for loop

        String[][] strArray = {{"abc","def","ghi"}, {"jkl", "mno", "prs"}};

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length; j++) {
                System.out.println(strArray[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(Arrays.deepToString(strArray));
    }
}
