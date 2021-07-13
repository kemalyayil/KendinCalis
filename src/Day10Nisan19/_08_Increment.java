package Day10Nisan19;

public class _08_Increment {
    public static void main(String[] args) {
        int x = 1;
        x = x + 1;
        System.out.println(x);

        x++;
        System.out.println(x);

        int y = 1;
        int z = y++; // post increment. first JVM will copy the value of y to z. then will add 1+ to y.
        System.out.println("z = " + z);
        System.out.println("y = " + y);

        int a = 1;
        int b = ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int f = 5;
        System.out.println(f++); // burda yine 5 cikacak. ama bir altta 6 cikacak
        System.out.println(f);
        System.out.println(++f); // burda da 7 cikacak.


    }
}
