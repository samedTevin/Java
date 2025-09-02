
public class Main {
    public static void main(String[] args) {

        Validator validator = new Validator();
        Customer customer = new Customer();
        CustomerDal customerDal = new CustomerDal();

        validator.validate(customerDal); // there is no generic constraint

        validator.accept(customer); // there is generic constraint
    }
}