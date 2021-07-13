package Day5Nisan12;

public class StringMethod {
    public static void main(String[] args) {

        String myString = "IntelliJ is cool!!";
        myString.toLowerCase();
        System.out.println(myString); // bu sekilde harfleri kucuk yazmadi. neden? cunku String are immutable : can not be changed.
        System.out.println(myString.toLowerCase()); // bu sekilde lowercase yapti
        System.out.println(myString.toUpperCase());
        System.out.println(myString.startsWith("I")); // true
        System.out.println(myString.startsWith("H")); // false
        boolean startsWith = myString.startsWith("I");
        System.out.println(startsWith);
        System.out.println(myString.endsWith("cool!!"));
        System.out.println(myString.length()); // kac karakter var onu sayar. returning in int. int i kullaniyor
        System.out.println(myString.indexOf("l")); // bu location of "l" i soyler. 4 cikartti. cunku 0 dan basliyor. amac karakterin ilk nerede kullanildigni bulmak
        System.out.println(myString.indexOf("L")); // sonuc -1. cunku java case sensitive. olamadigi icin -1.

//        Task we wanna find I but we dont wanna pay attetion if it is capital or small.
        System.out.println(myString.toLowerCase().indexOf("i"));

        String slm = "Konusma Len";
        System.out.println(slm.toUpperCase());
        System.out.println(slm.toLowerCase());
        System.out.println(slm.startsWith("J"));
        System.out.println(slm.endsWith("n"));
        System.out.println(slm.indexOf("a"));
        System.out.println(slm.length());
        System.out.println(slm.toUpperCase().indexOf("U"));


    }
}
