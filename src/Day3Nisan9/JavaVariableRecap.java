package Day3Nisan9;

public class JavaVariableRecap {

    public static void main(String[] args) {

        int mile = 50;

        int age= 30, temperature = 28; //burada 2 intiger olusturduk. ama bu method cok tavsiye edilmiyor.

        System.out.println(age);
        System.out.println(temperature);

        int myAge = 27; // that is copying one value to other's value.
        int herAge = myAge;
        System.out.println(herAge);

        int year = 2010; // we do this to update the value. println deki (year)
                         // ayni olmasina ragmen ilkinde 2010,
                         // digerinde 2015 sonucunu yazdirdik.
        System.out.println(year);
        year= 2015;
        System.out.println(year);

        int yearBefore2020 = 2019; // you cant start with number to your variable.
        //int 2010yearBefore2020 = 2019; not ALLOWED

        int $_ = 45; // while naming our variables, java allows us to use only "$ and _" among the special characters.


    }
}
