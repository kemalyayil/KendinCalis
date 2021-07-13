package Day4Nisan10;

public class PrimitiveDataTypesRecap {

    public static void main(String[] args) {

        //byte - short - integer - long

        // What is the purpose of having 4 different data types to store numbers? To save memory, space.
        byte recapByte = 10;
        short recapShort = 2010;
        int recapInteger = 100_000;
        long recapLong = 987765432109L;

        //System.out.println(recapByte);
        //System.out.println(recapShort);
//        System.out.println(recapInteger);
//        System.out.println(recapLong);

        // float - double = 4/8.
        float recapFloat = 1.234567892345F;  // ayni numaralar. ama sonuc farkli.REASON: range of float.
        double recapDouble = 1.234567892345; // cunku out of range of float oldugu icin, bi yere kadar...
        System.out.println(recapFloat);         //1.2345679         : float (sondaki 9 a dikkat)
        System.out.println(recapDouble);        //1.234567892345    : double

        double recapDouble2 = 9;
        System.out.println(recapDouble2); // it is double but JVM is converting int to double. thats why we see 9.0

        //boolean
        boolean isNight= false;
        boolean isSummer= true;
        System.out.println(isNight);
        System.out.println(isSummer);

        // char
        char letter = 'A';
        char number = '3';
        char specialCharacter = '?';

        char singleQuote = '\'';
        System.out.println(letter);
        System.out.println(number);
        System.out.println(specialCharacter);
        System.out.println(singleQuote);

        char randomFromKeyboard= 55;            // Ascii table
        System.out.println(randomFromKeyboard);



    }
}
