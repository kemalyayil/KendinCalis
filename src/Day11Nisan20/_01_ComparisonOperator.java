package Day11Nisan20;

public class _01_ComparisonOperator {
    public static void main(String[] args) {
        int a =1;
        int b =1;
        int c =2;

        System.out.println("Equal");
        System.out.println(a==b); // returning type is boolean. true
        System.out.println(a==c); //false

        System.out.println("Not Equal");
        System.out.println(a != b); // false . neden cunku aynilar. ayni deil mi diye soruyoruz. cevap false.
        System.out.println(a != c); // true. cunku ayni deil.

        System.out.println("Greater than");
        System.out.println(a > b); // false . cunku aynilar
        System.out.println(c > a); // true

        System.out.println("Less Than");
        System.out.println(a < b); // false
        System.out.println(a < c); // true

        System.out.println("Greater than or equal");
        System.out.println(a >= b); // true
        System.out.println(a >= c); // false

        System.out.println("Less than or equal");
        System.out.println(a <= b); // T
        System.out.println(a <= c); // T

        boolean aLessThanC = a < c;
        System.out.println(aLessThanC); // true. bu sekilde boolean da da store edebiliriz.
    }
}
