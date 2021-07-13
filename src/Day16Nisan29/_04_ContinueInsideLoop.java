package Day16Nisan29;

public class _04_ContinueInsideLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5){  // bu sekilde 5 i ignore etti. yazdirmadi
                continue;
            }
            System.out.println(i);

        }
    }
}
