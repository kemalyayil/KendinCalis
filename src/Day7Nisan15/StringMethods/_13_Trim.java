package Day7Nisan15.StringMethods;

public class _13_Trim {

    public static void main(String[] args){

        String welcomeMessage = "          Hello TechnoStudy         ";
        System.out.println("welcomeMessage = " + welcomeMessage); // bu sekilde yaparsak bastaki ve sondaki bosluklari da yazdiriyor

        String trimmedString = welcomeMessage.trim();
        System.out.println("trimmedString = " + trimmedString); // basta ve sondaki bosluklari kesiyor.
                                                                // ortaki bosluklari silmez

    }
}
