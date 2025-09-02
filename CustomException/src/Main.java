//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AccountManager manager = new AccountManager();
        System.out.println("Account : " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Account : " + manager.getBalance());
        try {
            manager.withdraw(90);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Account : " + manager.getBalance());
        try {
            manager.withdraw(20);
        } catch (BalanceInsufficientException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Account : " + manager.getBalance());
    }
}