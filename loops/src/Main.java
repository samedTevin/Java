//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // For loop

        for(int i = 1;i<10;i++){
            System.out.println(i);
        }

        System.out.println("For loop terminated");

        // While loop

        int i = 1;

        while (i<10){
            System.out.println(i);
            i++;
        }

        System.out.println("While loop terminated.");

        // Do-While loop

        int j = 1;

        do{
            System.out.println(j);
            j++;
        }while(j<10);

        System.out.println("Do-While loop terminated.");
    }

}