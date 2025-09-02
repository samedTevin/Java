public class BaseCreditManager {

    public double calculate(double amount){
        return amount * 1.18;
    }

    // final means "cannot be changed."
    // If a method is marked final, it cannot be overridden in a subclass.

    public final void messageForCalculation(){
        System.out.println("Credit has been calculated successfully.");
    }
}
