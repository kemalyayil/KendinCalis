package Day14Nisan26;

public class _02_Task {
    // {"apple", "watermelon", "peach", "strawberry", "kiwi"}
    // print this array by using for loops

    public static void main(String[] args) {

        String [] fruits = {"apple", "watermelon", "peach", "strawberry", "kiwi"};
        for (int i = 0; i < fruits.length ; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println( " ");

        //Arraay in reverse order
        for (int j = fruits.length -1; j >= 0 ; j--) {
            System.out.print(fruits[j].toUpperCase() + " ");
        }
    }
}
