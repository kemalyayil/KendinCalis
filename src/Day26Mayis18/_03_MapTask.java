package Day26Mayis18;

import java.util.HashMap;
import java.util.Set;

public class _03_MapTask {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2

    // part 2: print all the keys of the map
    public static void main(String[] args) {

        HashMap<Integer,String > citiesAndZipCodes = new HashMap<>();
        citiesAndZipCodes.put(12345, "Sao Paolo");
        citiesAndZipCodes.put(56673, "Ankara");
        citiesAndZipCodes.put(99836, "Moskova");

        Set<Integer> keys = citiesAndZipCodes.keySet();
        System.out.println(keys);
        for (Integer key: keys){
            String value = citiesAndZipCodes.get(key);
            System.out.println(  key + " = " + value);
        }

        // part 2: print all the keys of the map
        System.out.println("Part 2 (Keys only) = " + keys);  // line 20 deki  keys print ediliyor
        int size = citiesAndZipCodes.size();
        System.out.println("Size = " + size);

        boolean isEmpty = citiesAndZipCodes.isEmpty();
        System.out.println(isEmpty);

        citiesAndZipCodes.clear();
        System.out.println(citiesAndZipCodes);

        System.out.println(citiesAndZipCodes.isEmpty());
    }
}
