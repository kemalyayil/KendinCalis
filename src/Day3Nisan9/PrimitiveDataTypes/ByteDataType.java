package Day3Nisan9.PrimitiveDataTypes;

public class ByteDataType {

    public static void main(String[] args) {

//      int age = 30; // we dont need to use int to store someone's age. nobody can live more than 128 years.
        byte age = 30;
        System.out.println(age);

        byte myFirstByte = 54;
        byte mySecondByte = -76;
        System.out.println(myFirstByte);
        System.out.println(mySecondByte);

        System.out.println("Max value of byte = "+ Byte.MAX_VALUE);
        System.out.println("Min value of byte = "+ Byte.MIN_VALUE);


    }
}
