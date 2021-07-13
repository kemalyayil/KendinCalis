package Day22Mayis10;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayListTask {
    // create an arraylist of Strings
    // add Red, Green and Blue inside
    // print out all the elements, each element on new line

    // Part2: create a method that accepts an arraylist and element
    // it should add the element at the first position to arraylist

    // Part3: create a method that accepts an arraylist and element
    // it should add element before last  [1, 2, 3]  -> [1, 2, 4, 3]


    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("normal sekliyle = " + color);

        for (int i = 0; i < color.size(); i++) {
            String s = color.get(i);
            System.out.println("bu sekilde alt alta print ettik  = " + s);
        }



        addElementAtFirstPosition(color,"brown");
        System.out.println("add element in first position = " + color);

        addElementBeforeLast(color,"Cengiz");
        System.out.println("sondan bi onceki karakterden once ekleme = " + color);

    }

    public static void addElementAtFirstPosition(ArrayList<String> list, String element) {
        list.add(0,element);
    }
    public static void addElementBeforeLast(ArrayList<String> list, String element) {
        list.add(list.size() -1 ,element );
        list.set(1,"Kolin");
    }
}

