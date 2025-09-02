public class StudentCreditManager extends BaseCreditManager{



    // Overriding
    // Redefine a method from the parent class in a child class
    // Requires inheritance
    // Must be exactly same as the parent method ( same method name + parameters)
    // Runtime (Dynamic Polymorphism)


    @Override
    public double calculate(double amount){
        return amount * 1.10;
    }



    // public void messageForCalculation(){}
    // 'messageForCalculation()' cannot override 'messageForCalculation()' in 'BaseCreditManager'; overridden method is final

}
