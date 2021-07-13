package Day6Nisan13;

public class Task3 {
    public static void main(String[] args) {

        // Task - check whether string "Hi, world!" starts "Hi"
        // part 2 : "Hi world,Hello world" check whether second part of the string starts with "Hello"

        String greetings = "Hi, world!";
        boolean startsWithHi = greetings.startsWith("Hi");
        System.out.println(startsWithHi);
        System.out.println(greetings.startsWith("Hi"));

        String greetings2 = "Hi world,Hello world";
        boolean startsWithHello = greetings2.startsWith("Hello",9); // buarada yazilan numaradan
        System.out.println(startsWithHello);                                    // sonrasini check eder
        System.out.println(greetings2.startsWith("Hello",9));

        int indexofComma = greetings2.indexOf(","); // burada yaptigimiz sey virgulun yerini bulmak.8.
        System.out.println(indexofComma);
        System.out.println(greetings2.startsWith("Hello",indexofComma+1));
        // yukarda yapilan sey su. ilkinde integer indexof kullanarak virgulun yerini tespit ettik.
        // sonra println den startswith methodunu kullanip + indexofComma adini verdigimiz variable i +1
        // yazip aradigimiz sonuca ulastik. burada toffset kisminda sadece sayinin koyulmiycagini ogrendik.


    }
}
