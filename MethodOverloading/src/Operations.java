public class Operations {

    //Overloading

    // Same method name but different parameters
    // No need for inheritance
    // Signature : Same method name + different parameter counts/types
    // Compile-time

    public double addition(int num1, int num2){
        return num1 + num2;
    }

    public double addition(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}
