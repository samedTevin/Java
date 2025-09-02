
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();


        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        System.out.println("-----Employee------");
        employeeManager.bestEmployee(); // specific method for EmployeeManager
        employeeManager.add();
        employeeManager.list();


        System.out.println("-----Customer------");
        customerManager.add();
        customerManager.list();
    }
}