package Day6Nisan13;

public class Task10 {
    public static void main(String[] args) {
        // return the last word from "Hello Techno Study!"

        String hi = "Hello Techno Study!";
        String result = hi.substring(13); // normalde bu sekilde yapiyorduk. ama
        System.out.println(result);

        String hi2 = "Hello Techno Study!";
        int lastIndexOfSpace = hi2.lastIndexOf(" "); // burada son space i tanimladik.
        System.out.println(hi2.substring(lastIndexOfSpace + 1)); // +1 dememizin nedeni tanimlanandan 1 sonra basla


    }
}
