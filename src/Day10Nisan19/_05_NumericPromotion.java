package Day10Nisan19;

public class _05_NumericPromotion {
    public static void main(String[] args) {

        int intNumber = 5;
        long longNumber = 5;

        int result = (int) (intNumber + longNumber); // buarada convert gerekiyor cunku integer long'dan kucuk
        long result2 = intNumber + longNumber; // burada gerekmiyor
        byte result3 = (byte) (intNumber + longNumber);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);



    }
}
