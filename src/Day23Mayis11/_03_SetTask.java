package Day23Mayis11;

import java.util.Arrays;
import java.util.HashSet;

public class _03_SetTask {
    // create a String[] array of student name in your group, you might make duplicates
    // add all of them to a set

    // create a method that takes set and varargs of String and adds all elements to the set
    // public static void addAll(HashSet<String> set, Strings... elements) {}

    // create a method that takes set and String[], method should adds all elements to the set

    public static void main(String[] args) {
        String [] students = {"Hamza", "Liping" , "Kemal", "Gulsum","Julie","Sinan","Kevser"};

//        HashSet<String>addAllNames = new HashSet<>(Arrays.asList(students));
//        System.out.println("addAllNames = " + addAllNames);  // bu sekilde de olur


        HashSet<String>addAllNames = new HashSet<>();
        for (int i = 0; i < students.length; i++) {
            addAllNames.add(students[i]);
        }
        System.out.println("addAllNames = " + addAllNames);

        addAll(addAllNames,"HAkki","Cengiz","Suleyman");
        System.out.println("addAllNames2 = " + addAllNames);


        String [] strArray = {"Zeynep", "Numan", "Lizhou"};
        addAllAsArray(addAllNames,strArray);
        System.out.println("addAllNames3 = " + addAllNames);
        }



        public static void addAll(HashSet<String>set,String... str){
            for (int i = 0; i < str.length; i++) {
                set.add(str[i]);
            }
        }

        public static void addAllAsArray(HashSet<String>set,String[]strArray){
            for (int i = 0; i < strArray.length; i++) {
                set.add(strArray[i]);
            }
        }
    }


