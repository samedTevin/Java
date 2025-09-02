public class AccountManager {
    private double balance;

    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception{
        if(balance >= amount){
            balance = getBalance() - amount;
        }
        else{
          throw new Exception("Insufficient balance");
        }

    }

    public double getBalance(){
        return balance;
    }
}
