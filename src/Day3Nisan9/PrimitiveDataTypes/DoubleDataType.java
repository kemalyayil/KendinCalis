package Day3Nisan9.PrimitiveDataTypes;

public class DoubleDataType {
    public static void main(String[] args) {

        double mileage = 9995.786;
        System.out.println(mileage);

        System.out.println("Max values for double =" + Double.MAX_VALUE);
        System.out.println("Min values for double =" + Double.MIN_VALUE);

        // we can do this. but remember that the result will be printed as decimal number.
        // because java sees that it(value) is integer, later convert it into double. therefore we got that.
        double price = 5;
        System.out.println(price);
    }
}
