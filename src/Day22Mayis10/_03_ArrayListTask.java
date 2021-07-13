package Day22Mayis10;

import java.util.ArrayList;
import java.util.Random;

public class _03_ArrayListTask {
    // create a method that will create an arrayList of integers
    // with 5 random numbers(1 to 10) and return it

    // part2: create a method that updates the middle element to the element that's provided in parameter
    // [3, 4, 1, 6, 9]  -> provided parameter 100 -> [3, 4, 100, 6, 9]

    public static void main(String[] args) {
      ArrayList<Integer>firstList = createRandomList(7);
        System.out.println("firstList = " + firstList);

      updateMiddleElement(firstList,339390);
        System.out.println("firstList updated Middle element = " + firstList);
    }
    public static ArrayList<Integer> createRandomList(int number){
        ArrayList<Integer> mylist = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < number; i++) {
            mylist.add(random.nextInt(9)+1);
        }
        return mylist;
    }

    public static void updateMiddleElement(ArrayList<Integer> arrayList, Integer element){
        if (arrayList.size() % 2 == 1){
            int middleElement = arrayList.size()/2;
            arrayList.set(middleElement,element);
        }else if (arrayList.size() % 2 == 0){
            int middleElement = arrayList.size()/2-1;
            arrayList.set(middleElement,element);
        }



    }
    }

