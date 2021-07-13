package Day5Nisan12;

public class StringCasting {

    public static void main(String[] args) {

        double myDouble = 3;
        int myInteger = (int) myDouble + 3;
        System.out.println(myInteger);

        String number = "3";// those are called wrapper classes.
        int myInteger2 = Integer.parseInt(number) + 3;  // we converted here String to Integer. Cuz String is different data type.
        System.out.println(myInteger2);

        String number2 = "18";
        double myDouble2 = Double.parseDouble(number2) + 100;
        System.out.println(myDouble2);

        // Task- create a string named number5 which is 8
        // create a short sum which is equal to number5 + 4

        String number5 = "8";
        short sum = (short) (Short.parseShort(number5) + 4);
        // int sum = Integer.parseInt(number5) + 4;
        System.out.println(sum);





    }
}
