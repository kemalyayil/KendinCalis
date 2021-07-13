package Day5Nisan12;

import java.awt.*;

public class PrimitiveVsReference {

    public static void main(String[] args) {

        byte x = 1;     // update edip guncelledik. ama sonuc degismedi.
        byte y = x;
        System.out.println(y);

        x = 3;          // update edip guncelledik. ama sonuc degismedi.
        System.out.println(y); // bu durumda primitive de yapilan degisklikler etki etmiyor, y yi yazdirip ayni sonuc aldik

        Point point1 = new Point(1,1);
        Point point2 = point1;

        System.out.println(point1);
        System.out.println(point2);

        point1.x = 2;   // variable girip nokta koyduktan sonra, update etmek istedigimiz deger yaziliyor
        point1.y = 334;
        System.out.println(point2); // burada x ve y leri update ettik, sonuc update ettigimiz gibi cikti.

        Point point88 = new Point(5, 11);
        Point point99 = point88 ;
        System.out.println(point99);

        point88. x = 6;
        point88. y = 12;
        System.out.println(point99);



    }
}
