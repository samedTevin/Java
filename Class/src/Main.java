
public class Main {
    public static void main(String[] args) {

        // reference type

        // Stack  101 cm, 102 cm2
        // Heap 101 object, 102 object
        CustomerManager customerManager = new CustomerManager(); // 101
        CustomerManager customerManager2 = new CustomerManager(); // 102

        customerManager = customerManager2; // now both of them 102 and cm's object in heap collected by garbage collector.

        customerManager.addCustomer();
        customerManager.deleteCustomer();
        customerManager.updateCustomer();
    }
}