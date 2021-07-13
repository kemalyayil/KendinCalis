package Day13Nisan23;

public class _03_SimplifyIf2 {
    public static void main(String[] args) {

        int income = 120000;
        boolean isHighIncome = false;

        if (income > 100000){
            isHighIncome =true;
       //burda else e gerek yok. line 7 deki false dan sonra
        }
        System.out.println(isHighIncome);
    }
}
