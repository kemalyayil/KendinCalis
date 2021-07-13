package Day26Mayis18;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_2DCollections {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        ArrayList<String>cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Honda");
        cars.add("Toyota");

        ArrayList<String > cities = new ArrayList<>();
        cities.add("London");
        cities.add("Berlin");
        cities.add("Paris");


        listOfLists.add(cars);
        listOfLists.add(cities);

        System.out.println(cars);
        System.out.println(cities);
        System.out.println(listOfLists);  // 21 ve 22 line daki add olmasa, hepsini print edemiyor.

        ArrayList<HashSet<Integer>> listOfSet = new ArrayList<>();
        HashSet<Integer>firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);

        HashSet<Integer>secondSet = new HashSet<>();
        secondSet.add(2);
        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(4); // same values will not be printed

        listOfSet.add(firstSet);
        listOfSet.add(secondSet);

        System.out.println(firstSet);
        System.out.println(secondSet);
        System.out.println(listOfSet);

    }

}
