package Day5Nisan12;

public class Task1 {

    public static void main(String[] args) {

        // Create a String number5 which is 8;
        // Create a short called sum which is number5 + 4;

        String number5 = "8";  // asagiya (short) eklememizin nedeni, 8 ile 4 u integer da toplamasi.
        short sum = (short) (Short.parseShort(number5) + 4); //bu yuzden once short a cevirip, sonra topladik
        System.out.println(sum);

        short x = 3;
        short y = 2;
        //short sum2 = x + y; bu sekilde bile hata veriyor cunku integer olarak tanimliyor.
        short sum2 = (short) (x + y); // ancak bu sekilde yaparsak sonuc aliyoruz
        System.out.println(sum2);

        String num2 = "8";
        short sum4 = (short) (Integer.parseInt(num2) + 4); // once short a cevirip, parseint le de devam edebiliriz.
        System.out.println(sum4);



        String number7 = "8";
        int sum3 = (Integer.parseInt(number7) + 4);
        System.out.println(sum3);
    }
}
