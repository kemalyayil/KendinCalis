package Day7Nisan15.StringMethods;

public class _14_Replace {
    public static void main(String[] args) {

        String myString = " Hello World";
        String replacedString = myString.replace('l','*');
        System.out.println("replacedString = " + replacedString);

        String replacedString2 = myString.replace("Hello" , "Hi");
        System.out.println("replacedString2 = " + replacedString2);
    }
}
