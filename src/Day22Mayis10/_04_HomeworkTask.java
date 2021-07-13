package Day22Mayis10;

import java.util.ArrayList;
import java.util.Random;

public class _04_HomeworkTask {
    public static void main(String[] args) {

        // create a method that will generate arrayList of 5 doubles with random double
        // values (0 - 100)
        // create a method that takes a list and returns it's total sum
        // create a method that takes a list and returns it's average

        // part 2:
        // create a method that return index of the biggest number
        // public static int max(ArrayList<Double> list)

        ArrayList<Double> doubles = randomDouble();
        System.out.println(doubles);

        double sum = sum(doubles);
        System.out.println("sum = " + sum);

        double av = average(doubles);
        System.out.println("av = " + av);

        double index =indexOfMax(doubles);
        System.out.println("index = " + index);



    }
    public static ArrayList<Double> randomDouble(){
        ArrayList<Double> newList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            newList.add(random.nextDouble()*100-1);
        }
        return newList;
    }
    public static double sum(ArrayList<Double>list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        return sum;
    }
    public static double average(ArrayList<Double>list){
        double average = 0;
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average += sum / list.size();
        return average;
    }
    public static double indexOfMax(ArrayList<Double>list){
        double max = 0;
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max){
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
}