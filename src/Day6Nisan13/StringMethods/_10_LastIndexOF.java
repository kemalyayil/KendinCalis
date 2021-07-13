package Day6Nisan13.StringMethods;

public class _10_LastIndexOF {
    public static void main(String[] args) {

        String message = "Hello TechnoStudy";
        int firstIndexSpace = message.indexOf(' '); // o karakter ilk nerde kullanildi
        System.out.println(firstIndexSpace);
        int lastIndexOfSpace = message.lastIndexOf(' '); // o karakter son nerde kullanildi
        System.out.println(lastIndexOfSpace);
        int lastIndexOfSpaceE = message.lastIndexOf('e');
        System.out.println(lastIndexOfSpaceE); // e harfi en son nerde kullanildi
    }
}
