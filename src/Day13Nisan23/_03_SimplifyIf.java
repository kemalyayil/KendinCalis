package Day13Nisan23;

public class _03_SimplifyIf {
    public static void main(String[] args) {

        int income = 120000;
        boolean isHighIncome ;

        if (income > 100000){
            isHighIncome =true;
        }else {
            isHighIncome = false;
        }
        System.out.println(isHighIncome);
    }
}
