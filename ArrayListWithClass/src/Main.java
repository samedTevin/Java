import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer micheal = new Customer(1, "Micheal", "Adders");
        customers.add(micheal);
        customers.add(new Customer(1, "Emma", "Adders"));
        customers.add(new Customer(1, "Lauren", "Adders"));

        customers.remove(micheal);
        //customers.remove(new Customer(1, "Micheal", "Adders")); ---> new creates new reference so it will not delete Micheal.
        // To delete micheal or any customer, we can use variables as we did before.

        for(Customer customer : customers){
            System.out.println(customer.firstName);
        }
    }
}