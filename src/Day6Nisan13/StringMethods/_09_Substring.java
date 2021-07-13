package Day6Nisan13.StringMethods;

public class _09_Substring {

    public static void main(String[] args) {
// iki sekilde kullaniliyor. ilki yazilan numaradan sonrasini yazdiriyor, digeri iki rakam arasindakileri.
        String welcome = "Hello TechnoStudy!";
        String substsring = welcome.substring(6); // 6. karacterden sonrasini yazdir demek. sonuc TechnoStudy!
        System.out.println(substsring);

        String substring2 = welcome.substring(0,5); // sifir la bes arasindakileri yazdir (defined range)
        System.out.println(substring2);


    }
}
