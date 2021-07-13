package Day23Mayis11;

import java.util.HashSet;

public class _05_PrintElementsInSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("ABC");
        set.add("DEF");
        set.add("GHI");

        for (String hakki : set) {
            System.out.println(hakki);
        }
    }

}

