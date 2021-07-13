package Day5Nisan12.StringMethods;

public class _06_IndexOf {

    public static void main(String[] args) {

        String welcome = "Welcome to TechnoStudy!"; // the purpose of this method is to find the position of the
        int indexOfE = welcome.indexOf("e");       // character that you ve typed.
        System.out.println(indexOfE);
        System.out.println(welcome.indexOf("e"));

        int indexOfT = welcome.indexOf("t");
        System.out.println(indexOfT);
        System.out.println(welcome.indexOf("t"));
    }
}
