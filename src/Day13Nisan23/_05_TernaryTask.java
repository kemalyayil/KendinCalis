package Day13Nisan23;

public class _05_TernaryTask {
    public static void main(String[] args) {
        // if income is more than 100k than set className to "First" else "Economy"

        int income = 120000;
        String className = income>100000 ? "First" : "Economy";
        System.out.println(className);

//        String className;
//        if (income>100000){
//            className = "First";
//        }else {
//            className = "Economy";
//        }
//        System.out.println(className);

    }


}
