package HepBeraber.Dikdortgen;

public class DikdortgenMain {
    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();

        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);

        System.out.println(dikdortgen.alanHesaplama());

        System.out.println(dikdortgen.getBoy());
        System.out.println(dikdortgen.getEn());
    }
}
