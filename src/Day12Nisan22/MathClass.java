package Day12Nisan22;

public class MathClass {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -3;

        System.out.println("+ number    = " + Math.abs(c));
        System.out.println("max number  = " + Math.max(a,b));
        System.out.println("min number  = " + Math.min(a,b));

        // round
        System.out.println("round 3.4   = " + Math.round(3.4));
        System.out.println("round 3.5   = " + Math.round(3.5));
        System.out.println("round 3.6   = " + Math.round(3.6));

        // ceil  || everytime up
        System.out.println("ceil 7.4   = " + Math.ceil(7.4));
        System.out.println("ceil 7.5   = " + Math.ceil(7.5));
        System.out.println("ceil 7.6   = " + Math.ceil(7.6));

        // floor  || everytime down

        System.out.println("floor 1.4   = " + Math.floor(1.4));
        System.out.println("floor 1.5   = " + Math.floor(1.5));
        System.out.println("floor 1.6   = " + Math.floor(1.6));

        // Sqrt Square root (karakok)
        System.out.println("25'in karekoku = " + (int) Math.sqrt(25));
        double sr = (int) Math.sqrt(25);
        System.out.println("double ile yazilmis hali = " + sr);

        // power
        System.out.println("2 uzeri 5 = " +  (int) Math.pow(2,5)); // 2x2x2x2x2 = 32 ( 2 uzeri 5)

        // random
        System.out.println((int) (Math.random()));
        System.out.println((int) (Math.random()*100));
        System.out.println(Math.round(Math.random()));
        System.out.println(Math.round(Math.random()*100)) ;




    }
}
