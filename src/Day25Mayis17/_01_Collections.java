package Day25Mayis17;

import java.util.*;

public class _01_Collections {

    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        Set<Integer>set = new HashSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 7; i++) {
            list.add(rnd.nextInt(10));
            set.add(rnd.nextInt(10));
        }
        System.out.println("Elements in set  = " + set);
        System.out.println("Elements   in   List  = " + list);

        Integer[] array = {2,3,4,6,7,9,00};
        Collections.addAll(list,array);
        System.out.println("AddAll c/Array for List  = " + list);

        Collections.addAll(list,15,6,7,44,88,11,243);
        System.out.println("AddAll method  for List  = " + list);


        Collections.sort(list);
        System.out.println("Sort method  for   List  = " + list);


        Collections.sort(list,Collections.reverseOrder());
        System.out.println("ReverseOrder for    List = " + list);



        Collections.shuffle(list);
        System.out.println("Shuffle metho. for List  = " + list);


        Collections.rotate(list,-1);
        System.out.println("Rotate method  for List  = " + list);


        Collections.replaceAll(list,6,88);
        System.out.println("ReplaceAll met. for List = " + list);


        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println("Max number for List   = " + max);
        System.out.println("Min number for List   = " + min);


        Integer maxSet = Collections.max(set);
        Integer minSet = Collections.min(set);
        System.out.println("Max number for Set    = " + maxSet);
        System.out.println("Min number for Set    = " + minSet);

        Collections.sort(list);
        System.out.println("Sorted for BinarySearch 'LIST'= " + list);
        int i = Collections.binarySearch(list, 88);
        System.out.println("BinarySearch method for List  = " + i);


    }

}
