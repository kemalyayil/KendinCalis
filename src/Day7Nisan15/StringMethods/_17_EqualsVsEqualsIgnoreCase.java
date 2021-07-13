package Day7Nisan15.StringMethods;

public class _17_EqualsVsEqualsIgnoreCase {

    public static void main(String[] args) {

        String string1 = " TechnoStudy";
        String string2 = " TechnoStudy";
        String string3 = " technostudy";

        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3)); // case sensitive oldugu icin burada false sonucunu aliyoruz.

        System.out.println(string1.equalsIgnoreCase(string2));
        System.out.println(string1.equalsIgnoreCase(string3));// burada true sonucunu aliyoruz.


    }
}
