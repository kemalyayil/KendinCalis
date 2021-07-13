package Day25Mayis17;

import java.util.*;

public class _02_Converting {

    public static void main(String[] args) {
        //Converting Array to list
        Integer[] integers = new Integer[] {1,2,3,4,5,2};
        List<Integer>list = new ArrayList<>(Arrays.asList(integers));
        System.out.println("Array to List - Not fixed  = " + list);


        List<Integer>fixedSizeList = Arrays.asList(integers);
        System.out.println("Array to List - Fixed      = " + list); // buna ekleme yapilmaz.
                                                // unsupportedOperationException hatasi veriyor

        // Converting List to Array
        Integer[] convertedFromList = list.toArray(new Integer[0]);
        System.out.println("List to Array = " + Arrays.toString(convertedFromList));

        // Converting an Array to Set
        Set<Integer>set = new HashSet<>(Arrays.asList(integers));
        System.out.println("Array to Set = " + Arrays.toString(convertedFromList));

        // Converting Set to Array
        Integer [] convertedFromSet = set.toArray(new Integer[0]);
        System.out.println("Set to Array = " + Arrays.toString(convertedFromSet));


        // Converting List to Set  // bu method duplicate values istenmiyorsa kullanilabilir
        Set<Integer>listFromSet = new HashSet<>(list); // line 10 dan geldi
        listFromSet.add(9);
        System.out.println("List to Set = " + listFromSet); //


    }








}
