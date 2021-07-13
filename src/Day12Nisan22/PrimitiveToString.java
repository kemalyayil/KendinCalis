package Day12Nisan22;

public class PrimitiveToString {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println(x + y);// toplama burda olur. ikisi de int

        System.out.println("My numbers are : " + x + y); // burada JVM string'e cevirecek. toplama olmiycak


        String xToString = Integer.toString(x);
        String yToString = Integer.toString(y);

        System.out.println(xToString + yToString); // 12 olacak. toplama olmaz



    }
}
