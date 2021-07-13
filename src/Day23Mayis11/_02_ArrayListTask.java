package Day23Mayis11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class _02_ArrayListTask {

    // create an array list of 4 random integers  (Main)
    // create a method that adds element at random position
    // public static void addAtRandomPosition(ArrayList<Integers> list, Integer element)

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            list.add(random.nextInt());
        }
        System.out.println("list = " + list);

        addAtRandomPosition(list,899);
        System.out.println("list2 = " + list);
    }
    public static void addAtRandomPosition(ArrayList<Integer> list,Integer element){
        Random random2 = new Random();
        int index = random2.nextInt(list.size());
        list.add(index,element);

    }
    }