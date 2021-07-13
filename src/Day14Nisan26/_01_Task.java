package Day14Nisan26;

public class _01_Task {
    public static void main(String[] args) {
        // print numbers from 0 to 20 using for loop.
        // output should be in one line 0 1 2 3 ....20

        // part 2
        // print numbers from 20 to 0 using for loop.
        // output should be in one line 20 19 18 .... 0

        for (int i = 0; i <= 20; i++) {
            System.out.print(" " + i);
        }
        System.out.println(" ");
        for (int j = 20; j >= 0 ; j--) {
            System.out.print(" " + j);
        }

    }
}
