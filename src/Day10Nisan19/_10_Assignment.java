package Day10Nisan19;

public class _10_Assignment {
    public static void main(String[] args) {

        int x = 1;
        int y = x;

        x = x + 4; // x = 5, y = 1 hala. cunku update burda oldu.

        y += 4 ; // y = y + 4 demek. shortcut

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y -= 3;
        System.out.println("y -= den sonra = " + y);

        y *= 5;
        System.out.println(y); // 10

        y %= 2;
        System.out.println(y); // 0
    }
}
