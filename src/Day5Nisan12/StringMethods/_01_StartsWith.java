package Day5Nisan12.StringMethods;

public class _01_StartsWith {

    public static void main(String[] args) {

        String newMessage = "Hello World";
        boolean startsWithHello = newMessage.startsWith("H");
        System.out.println(startsWithHello);
        System.out.println(newMessage.startsWith("H"));

        // asagidaki formul ikinci kelimenin o degerle baslayip baslamiyacgini ogrenme formulu. 6 = 6. karaktere bak demek
        boolean secondWordStartingWithW = newMessage.startsWith("W",6); // bi detay: 6 yazarken ""kullanma.
        System.out.println(secondWordStartingWithW);
        System.out.println(newMessage.startsWith("W",6));

    }
}
