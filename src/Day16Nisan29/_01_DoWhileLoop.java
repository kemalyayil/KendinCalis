package Day16Nisan29;

public class _01_DoWhileLoop {

    public static void main(String[] args) {
        int number = 4;
        while (number < 0) { // 4 sifirdan buyuk oldugu icin code will not be executed
            number++;
            System.out.println("While   = " + number);
        }
        do {
            ++number;
            System.out.println("Do while  = " + number);
            } while ( number < 0);


    }
}
