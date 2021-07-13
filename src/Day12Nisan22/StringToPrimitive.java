package Day12Nisan22;

public class StringToPrimitive {
    public static void main(String[] args) {
        String number = "123";
        String number2 = "100";
        int numberFromString = Integer.parseInt(number);
        int numberFromString2 = Integer.parseInt(number2);

        System.out.println(numberFromString+numberFromString2); // toplama olacak, neden. cunku int cevirdik.
        System.out.println(number+number2); // toplama olMAyacak. cunku hala String.
    }
}
