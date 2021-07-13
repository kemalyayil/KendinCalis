package Day11Nisan20;

public class _02_LogicalOperator {
    public static void main(String[] args) {

        int temp = 28;
        boolean isHot = temp > 30;
        System.out.println("Is hot? " + isHot);

        boolean isGood = temp > 23 && temp < 30;  // && and operator
        System.out.println("Is good? " + isGood);


        boolean hasHighIncome = false;
        boolean hasGoodCreditStore = true;

        boolean isEligible = hasHighIncome || hasGoodCreditStore; // ikisinden biri oyleyse true cikarir.
        System.out.println("isEligible = " + isEligible);
    }
}
