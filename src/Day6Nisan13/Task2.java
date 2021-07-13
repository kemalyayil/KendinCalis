package Day6Nisan13;

public class Task2 {
    public static void main(String[] args) {
        // Task : find the index of 4 in "0.12345678"
        // Task : find the index of . in "0.12345678"

        String find4 = "0.12345678";
        int index4 = find4.indexOf("4");
        System.out.println(index4);
        System.out.println(find4.indexOf("4"));

        int indexDot = find4.indexOf(".");
        System.out.println(indexDot);
        System.out.println(find4.indexOf("."));

    }

}
