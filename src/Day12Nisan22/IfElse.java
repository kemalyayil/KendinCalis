package Day12Nisan22;

public class IfElse {
    public static void main(String[] args) {

        int income = 20_000;
//        String salary = income > 100000 ? "Your income is good" : "Your income is not good";
//        System.out.println(salary); // Ternary operator

        if (income > 100_000){
            System.out.println("Your income is good");
        }else {
            System.out.println("Your income is not good");
        }
    }
}
