package Day6Nisan13;

public class Task7 {
    public static void main(String[] args) {

        // part 1 = find out the character at 5th index of string "123456789"
        // part 2 = find out the character at 5th index of string "0123456789"

        String part1 = "123456789";
        char fifthIndex = part1.charAt(5);
        System.out.println(fifthIndex);
        System.out.println(part1.charAt(5));

        String part2 = "0123456789";
        char fifthIndex2 = part2.charAt(5);
        System.out.println(fifthIndex2);
        System.out.println(part2.charAt(5));
    }
}
