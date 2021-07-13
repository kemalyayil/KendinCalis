package Day7Nisan15.JavaArrays;

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
        // we use arrays to store list of items

        int[] myArray = new int[3];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        System.out.println("myArray = " + myArray); // sonuc location cikar.
        System.out.println(Arrays.toString(myArray)); // bu sekilde print etmemiz lazim

        int[] arrayOfNumbers = { 15,9,2,10,7,1,6};
        System.out.println(Arrays.toString(arrayOfNumbers));
        System.out.println(arrayOfNumbers.length);
        // Arrays are fixed size, once you create and array you cannot add or remove items.


        String [] arrayOfCars = { "Toyota" , "BMW" , "Mercedes" , "Tesla" , "Ford"};
        System.out.println(Arrays.toString(arrayOfCars)); // this is not sorted
        Arrays.sort(arrayOfCars); // this is sorted.
        System.out.println(arrayOfCars.length);
        System.out.println(arrayOfCars[0]);

    }
}
