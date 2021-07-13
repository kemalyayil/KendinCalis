package Day9Nisan17.MultiDArray;

import java.util.Arrays;

public class MultiDArrayTask {
    // create a 2d array
    // store country -capital in array

    public static void main(String[] args) {

        String [][] countryAndCapital = new String[5][2];
        countryAndCapital[0][0] = "USA";
        countryAndCapital[0][1] = "Washington DC";
        countryAndCapital[1][0] = "Turkey";
        countryAndCapital[1][1] = "Ankara";
        countryAndCapital[2][0] = "China";
        countryAndCapital[2][1] = "Pekin";
        countryAndCapital[3][0] = "Georgia";
        countryAndCapital[3][1] = "Tbilisi";
        countryAndCapital[4][0] = "Azerbaijan";
        countryAndCapital[4][1] = "Baku";
        System.out.println(Arrays.deepToString(countryAndCapital));

    }
}
