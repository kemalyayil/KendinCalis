package Day14Nisan26;

public class _02_Task3 {
    public static void main(String[] args) {
        // declare an array of veggies and initialize it with some values use array = {}
        // print all elements - use for loop
        // part2: make a copy of that array and print it

        String [] veggies = {"Lettuce" , "Tomato" , "Cucumber"};

        for (int i = 0; i < veggies.length; i++) {
            System.out.println(veggies[i]);
        }

        String [] copyOfVeggies = veggies;

        for (int j = 0; j < copyOfVeggies.length; j++) {
            System.out.println("Copy of veggies " + copyOfVeggies[j]);

        }
    }
}
