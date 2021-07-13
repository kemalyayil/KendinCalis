package Day26Mayis18;

import java.util.ArrayList;

public class _01_2DCollectionsTask {
    public static void main(String[] args) {

        // create 2d ArrayList which can store String ArrayLists
        // create 3 ArrayList which are Employees , Employers , Companies
        // Store this 3 ArrayList in 2D arrayList

        ArrayList<ArrayList<String>> my2DArray = new ArrayList<>();
        ArrayList<String>employees = new ArrayList<>();
        ArrayList<String>employers = new ArrayList<>();
        ArrayList<String>companies = new ArrayList<>();

        employees.add("Hakki");
        employees.add("Veli");
        employees.add("Suleyman");

        employers.add("John");
        employers.add("Mike");
        employers.add("Rita");

        companies.add("A ltd");
        companies.add("Ac ltd");
        companies.add("Ad ltd");

        my2DArray.add(employees);
        my2DArray.add(employers);
        my2DArray.add(companies);
        System.out.println(my2DArray);
    }

}
