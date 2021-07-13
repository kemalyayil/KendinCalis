package Day13Nisan23;

public class _09_NestedIf {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1){
            if (condition2){
                System.out.println("Cond 2 is true");
            }else {
                System.out.println("Cond 1 is true");
            }
        }else{
            System.out.println("No cond is true");
        }

    }
}
