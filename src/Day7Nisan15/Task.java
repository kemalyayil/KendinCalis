package Day7Nisan15;

import java.util.Date;

public class Task {
    public static void main(String[] args) {

        //                  Task
        // First create a Date object which is "now"
        Date now = new Date();
        System.out.println("now = " + now);

        // Then convert this 'now' variable to a String

        String convertedDate = now.toString();
        System.out.println("convertedDate = " + convertedDate);

        // Now replace all numbers with '*'
        String replacedDate = (convertedDate.replaceAll("[0-9]", "*"));
        System.out.println("replacedDate = " + replacedDate);

        // And check if the first Date object is equal to our string
        System.out.println(convertedDate.equalsIgnoreCase(replacedDate));
    }
}
