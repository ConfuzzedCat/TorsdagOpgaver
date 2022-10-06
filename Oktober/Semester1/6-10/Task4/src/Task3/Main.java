package Task3;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Customer> customers;
    public static void main(String[] args) {
        Customer c1 = new Customer("Jørgen", "Jørgensen", "JørgenMiester");
        Customer c2 = new Customer("Søren", "Sørensen", "SørenMiester");
        Customer c3 = new Customer("Ben", "bensen", "BenMiester");
        Customer c4 = new Customer("Iben", "Ibensen", "IbenMiester");
        Customer c5 = new Customer("Jens", "Jensen", "JensMiester");
        Customer c6 = new Customer("Rasmus", "Rasmussen", "RasmusMiester");

        customers = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5,c6));
        printCustomers();
    }
    public static void printCustomers(){
        for (Customer c:customers) {
            System.out.println(c);
        }
    }
}