package Day26Mayis18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _02_Map {
    public static void main(String[] args) {

        // in map we store in KEY - Value format
        // key can not be duplicated, but values can be duplicated.

        HashMap<String,Integer>salaries = new HashMap<>();
        salaries.put("John", 100000);
        salaries.put("Mike", 80000);
        salaries.put("Rita", 200000);
        salaries.put("Emily", 50000);

        System.out.println("Map = " + salaries);

        salaries.put("John", 150000); // burada update olarak gorecek key ayni olursa. key cant be duplicated
        System.out.println("After adding john once again = " + salaries);

        salaries.put("Charles", 200000);
        System.out.println("After adding charles 200_000(rita's) = " + salaries); // values can be same. rita & charles


        System.out.println("Mike's Salary = " +  salaries.get("Mike")); // to call the key with get method.

        Set<String>keys = salaries.keySet();  // keyset is for showing all the keys in Map.
        System.out.println("Keys of salaries map = " + keys);

        for(String key : keys){
           // System.out.println(key); // bu sekilde array disina cikarip basiyor key degerini
            Integer values = salaries.get(key);
            System.out.println(key + " = " + values);  // bu sekilde key and values are printed
        }
        Collection<Integer>values = salaries.values();  // collection i kullanarak values print edilir
        System.out.println("Get all values by Values w/Collection= " + values); // all values
        for (Integer value : values){
            System.out.println("Printing all values one by one = " + value);
        }
        System.out.println("Map = " + salaries); // line 20 de de basmistik. map ile set arasindaki farki anlamak icin yeniden bastim
        Set<Map.Entry<String,Integer>> entrySet = salaries.entrySet();
        System.out.println("Set = " + entrySet);
        for(Map.Entry<String,Integer>  entry: entrySet){// entrySet is variable of line45
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        salaries.putIfAbsent("Hakki", 33222);
        salaries.putIfAbsent("Mike" , 66000);       // yoksa print ediyor. varsa etmiyor
        System.out.println("After adding Hakki = " + salaries);

        int size = salaries.size();
        System.out.println("Number of entiries = " + size);

        boolean isEmpty = salaries.isEmpty();
        System.out.println("Is map Empty = " + isEmpty);

        salaries.clear();
        System.out.println("Map after clear method = " + salaries);

        isEmpty = salaries.isEmpty();
        System.out.println("Is Map empty after clear method = " + isEmpty);


    }
}
