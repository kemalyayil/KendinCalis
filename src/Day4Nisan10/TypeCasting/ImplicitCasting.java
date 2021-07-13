package Day4Nisan10.TypeCasting;

public class ImplicitCasting {

    public static void main(String[] args) {
        // type casting means converting sth to another. it should happen to compatible types.
        // implicit casting (widening Casting) is automatically done by JAVA.

        byte byteNumber = 50;
        short shorNumber= byteNumber;
        System.out.println(shorNumber);

        short shortNumber2 = 2222;
        int integerNumber = shortNumber2;
        System.out.println(integerNumber);

        // Task - create 2 variable integer & long. convert int to long
        int integerNumber2 = 28938484;
        long longNumber = integerNumber2;
        System.out.println(longNumber);

        short x = 1;
        // but in this situation , java create an anonymous variable somewhere in our memory  = 1
        int y = x + 3;
        System.out.println(y);

        float floatNumber = 1.354F;
        double doubleConvert = floatNumber;
        System.out.println(doubleConvert);

       // double a = 1.5;
        //int b = a+3;    // yukarda double oldugu icin , kirmizi cizgi cekiyor.acsagida da double olmasi
                        // gerekir diyor. cunku java 3 u 3.0 olarak convert ediyor.

        double a = 2.1;
        double b = a + 1; // burda da 1 aslinda int. java onu 1.0 olarak covert ediyor zira onceki double oldugu icin
        System.out.println(b);

        int toDouble = 3;
        double fromInteger = toDouble;
        System.out.println("fromInteger = " + fromInteger);

        int sisko= 100;
        double dombili = sisko;
        System.out.println(dombili);


        short toFloat = 1;
        float myFloat = toFloat;
        System.out.println(myFloat);

    }
}
