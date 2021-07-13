package Day6Nisan13.StringMethods;

public class _08_Concat {
    public static void main(String[] args) {
        String first = "Hello";
        String second = "TechnoStudy";
        String third = "!!";

        String concat = first.concat(second+third);
        System.out.println(concat);
        System.out.println(first.concat(second+third));
        System.out.println(first + second + third); // concat kullanmadan yapilabilir.

    }
}
