
import math.Log;
import math.MathOperations;

// import math.* for using all things in math package.

// built-in packages
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Merhaba " + name + "\n");

        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.add(2,3));
        Log log = new Log();
        System.out.println(log.logCalculate());
    }
}