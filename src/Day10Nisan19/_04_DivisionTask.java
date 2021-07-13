package Day10Nisan19;

public class _04_DivisionTask {
    public static void main(String[] args) {
        // Write a program that calculate average of following numbers
        // 23.4 , 24.0 , 12 , 450.3, 23000
        // assign the numbers

        double a = 23.4;
        double b = 24.0;
        byte c = 12;   // deger kucuk oldugundan byte ile daha az yer tutar. sonuc olarak otomatik olarak double a cevrilir en sonda
        double d = 450.3;
        short e = 23000;

        System.out.println((a+b+c+d+e) / 5);


    }
}
