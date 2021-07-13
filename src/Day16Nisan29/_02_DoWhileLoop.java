package Day16Nisan29;

public class _02_DoWhileLoop {
    public static void main(String[] args) {
    int count = 0;
    int count2 = 0;


    do {
        System.out.println("Do While TechnoStudy" + count);
        count++;
    }while (count > 10);  // doWhileLoop once contion i kontrol ediyor. false sa sifir yaziyor.


        while (count2 > 10){ //once contion i kontrol ediyor. false sa yazdirmiyor.
            System.out.println("While TechnoStudy" + count2);
            count2++;
        }
    }

}
