package Day27Mayis20;

import java.util.HashMap;

public class _01_MapTask {
    public static void main(String[] args) {

        // check if this map contains key "six"
        // if not put it as "Six"

        // Part 2: check if this map contains key "Three"
        // if yes, change it's value to 33.

        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("One",1);
        hashMap.put("Two",2);
        hashMap.put("Three",3);
        hashMap.put("Four",4);
        hashMap.put("Five",5);

        System.out.println(hashMap);

        // task starts here
//        if (!hashMap.containsKey("Six")){
//            hashMap.put("Six",6);
//        }
//        System.out.println("After 6 = " + hashMap);
        hashMap.putIfAbsent("Six",6);
        System.out.println("put if method"+ hashMap);

        //Part 2
        if (hashMap.containsKey("Three")){
            hashMap.put("Three", 33);
        }
        System.out.println("Part 2 = " + hashMap);
    }
}
