package Day7Nisan15.StringMethods;

import java.awt.*;

public class _16_ToString {
    public static void main(String[] args) {
// purpose of this method is converting some object to String
        String myString = " Hello World";
        String newString = myString.toString();
        System.out.println("newString = " + newString);

        Point point = new Point(1,1);
        System.out.println("point = " + point);

        String toString = point.toString(); // bu sekilde point den string e cevirecek
        System.out.println("toString = " + toString);
        System.out.println(toString.isEmpty()); // isempty methodu point te yok. dolayisi ile string e convert ediyoruz
                                                // yine diger methodlarda kullanilmak uzere convert edilebilir

        System.out.println(toString.replaceAll("[0-9]", "*")); // ayni sekilde, point de replace all olmadi
                                                                        // icin string e cevirip sonuc aldik

    }
}
