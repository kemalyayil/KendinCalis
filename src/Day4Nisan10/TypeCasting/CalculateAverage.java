package Day4Nisan10.TypeCasting;

public class CalculateAverage {

    public static void main(String[] args) {

        int student1 = 80;
        int student2 = 95;
        int student3 = 33;
        int student4 = 71;
        int average = (student1 + student2 + student3 + student4) /4; // burada sonuc 69 cikiyor. aslinda 69.75.
        System.out.println(average);  // cunku int oldugu icin decimal kismi ignore ediyor. dolayisi ile float
                                        // veya double kullanmak lazim.
        double average2 = (student1 + student2 + student3 + student4) /4; // sonuc 69.0. neden? cunku numbers hala int
        System.out.println(average2);                                    // o yuzden.

        double average3 = (student1 + student2 + student3 + student4) /4.0; // simdi dogru cevabi verdi. 69.75
        System.out.println(average3);  // bu senaryoda, sonunda 4.0 oldugu icin, int olan numaralari double a
                                        //otomatik olarak convert edecek. ama 4 olarak kalsa, hala int olarak kabul eder.

        double average4 = (double) (student1 + student2 + student3 + student4) /4;
        System.out.println("average4 = " + average4); // bu da ikinci yontem.double cevirip yaptik

    }
}
