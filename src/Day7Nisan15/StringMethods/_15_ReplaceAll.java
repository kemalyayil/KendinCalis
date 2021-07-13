package Day7Nisan15.StringMethods;

public class _15_ReplaceAll {
    public static void main(String[] args) {


        String myString = " Hello World";
        String replacedString = myString.replace('l','*');
        System.out.println("replacedString = " + replacedString);
        // buraya kadar olan replace methodu ile yaptigimiz. Replaceall daha fazlasini yapar

        String myNumber = "My number is 6564839282789 call me";
        String replacedNumbers = myNumber.replaceAll("[4-9]", "#"); // square bracket is important
        System.out.println("replacedNumbers = " + replacedNumbers);

        String replacedNumbers2 = myNumber.replaceAll("[1-4]", "P");
        System.out.println("replacedNumbers2 = " + replacedNumbers2);

        String replacedNumbers3 = myNumber.replaceAll("[a-z]","@");
        System.out.println("replacedNumbers3 = " + replacedNumbers3); // burada 'M' degismedi. neden ? cunku capital oldugu icin

    }
}
