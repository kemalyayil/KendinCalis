package Day19Mayis4;

public class _00_MethodsOverview {
    public static void main(String[] args) {
        String str = "How are you?";
        char chr = str.charAt(0);

        printNumbers();  // her zaman 5 print edecek

        printNumbers2(9);
        printNumbers2(11);

       int number =  returnInteger(5);
        System.out.println(number);

    }
    public static void printNumbers(){  // no parameter
        System.out.println(5);
    }

    public static void printNumbers2(int number){  // int number is parameter
        System.out.println(number);
    }

    public static int returnInteger (int number){  // int number is parameter
        return number;                              // and returns number
    }
}
