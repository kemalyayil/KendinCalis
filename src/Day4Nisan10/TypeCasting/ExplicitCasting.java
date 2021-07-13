package Day4Nisan10.TypeCasting;

public class ExplicitCasting {
    public static void main(String[] args) {
// explicit casting (narrowing casting) manually. from bigger to smaller
// explicit casting will happen only compatible types.
        // byte-short-int-lon-float-double
        long myLong = 289736L;
        int myInteger = (int) myLong;
        System.out.println(myInteger);

        int myInteger2 = 5555;
        short myShort = (short) myInteger2;
        System.out.println(myShort);

        short myShort2 = 89;
        byte myByte = (byte) myShort2;
        System.out.println(myByte);

        double myDouble = 5990;
        float myFloat = (float) myDouble;
        System.out.println(myFloat);

        double dombili = 100.0;
        float sisko = (float) dombili;
        System.out.println(sisko);

        double myDouble2 = 2.55;
        float myFloat2 = (float) myDouble2;
        System.out.println(myFloat2);

        float toShort = 5.1F;
        short fromFloat = (short) toShort;
        System.out.println(fromFloat);

        double myDouble3 = 3344.99;   // it will remove the decimal points.
        int myInteger3 = (int) myDouble3;
        System.out.println(myInteger3);

        double a = 1.5;
        int b = (int) a + 3;
        System.out.println(b);

        short shortNumber = 129;                                  // (-128 / 127)
        byte byteNumber = (byte) shortNumber; // sonuc -127. neden? cunku out of range. sona gelince basa donuyor.overflow deniyor
        System.out.println(byteNumber);







    }
}
