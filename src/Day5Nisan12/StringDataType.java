package Day5Nisan12;

import java.awt.*;

public class StringDataType {
    public static void main(String[] args) {

        String name = "Hello World";  // refernce type olan string de new yazmamiza gerek yok.
        String name2= new String("Hello World2"); // methodlar arasinda sadece string de var bu exception.
        System.out.println(name + "\n" + name2);// cunku cok kullanildigi icin...

        String schoolName = "TechnoStudy";
        String courseName = "SDET Course";
        System.out.println(schoolName +courseName); // boyle olunca ikisi birlesik yazdirildi.
        System.out.println(schoolName + " " + courseName); // boyle yapinca, araya bosluk koydu.
        System.out.println(schoolName + " " + courseName + " Java"); // istersek kelime de eklenebilir.
                                                            // Java dan onceki space e dikkat

        String question = "What's your age?";
        String answer = "My age is:";
        int age = 25;
        System.out.println(question + "\n" + answer + age);//question ve answer string, ama age integer. how that happens?
        // bu durumda java integer bile olsa , string e convert eder.

        int dob = 1990;
        double height = 6.5;
        char gender = 'M'; // char is also representing numbers. ASCII table
        System.out.println(dob + height + gender); // bu durumda string olmadigi icin, hesaplama yapiyor. 2073.5 cikariyor
        System.out.println(""+ dob + height + gender);// "" converts everything into a String, no matter in begining or at the end.
        System.out.println(""+ dob +" "+ height + " "+ gender); // boyle daha guzel gorunuyor :)










    }
}
