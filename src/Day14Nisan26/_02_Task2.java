package Day14Nisan26;

import java.util.Arrays;
import java.util.Random;

public class _02_Task2 {
    public static void main(String[] args) {

        // declare an array of bytes
        // init it with size 3
        // give each element a random value
        // print all elements

        Random random = new Random();

        byte [] byteArray =new byte[3];
//        byteArray[0] = (byte) random.nextInt(127);
//        byteArray[1] = (byte) random.nextInt(127);
//        byteArray[2] = (byte) random.nextInt(127);

        for (int i = 0; i < byteArray.length; i++) {
            byteArray [i] = (byte) random.nextInt(127);

            System.out.println(byteArray[i]);
        }
        System.out.println(Arrays.toString(byteArray));

        }
    }

