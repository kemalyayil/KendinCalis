package Day13Nisan23;

import java.util.Scanner;

public class _08_SwitchTask2 {
    public static void main(String[] args) {
        // print all days after today

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the day = ");
        String day = scanner.nextLine();

        switch (day){
            case "Monday" :
                System.out.println("Monday");
            case "Tuesday" :
                System.out.println("Tuesday");
            case "Wednesday" :
                System.out.println("Wednesday");
            case "Thursday" :
                System.out.println("Thursday");
            case "Friday" :
                System.out.println("Friday");
            case "Saturday" :
                System.out.println("Saturday");
            case "Sunday" :
                System.out.println("Sunday");

        }

    }
}
