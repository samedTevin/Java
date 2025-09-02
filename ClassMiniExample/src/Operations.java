import static java.lang.System.exit;

public class Operations {

    public double addition(double num1, double num2){
        return num1 + num2;
    }

    public double substraction(double num1, double num2){
        return num1 - num2;
    }

    public double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public double division(double num1, double num2){

        if(num2 == 0) {
            System.out.println("Unallowed action.");
            exit(0);
        }

        return num1 / num2;
    }
}
