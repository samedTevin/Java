public class Main {

    public static void main(String[] args){

        // Conditions

        // if

        int num = 3;

        if (num > 0){
            System.out.println("The number is positive.");
        }

        // else

        num = -5;

        if (num>0){
            System.out.println("The number is positive.");
        }
        else{
            System.out.println("The number is negative.");
        }

        // else if

         num = 0;

        if (num > 0){
            System.out.println("The number is positive.");
        }
        else if (num == 0){
            System.out.println("The number is 0.");
        }
        else {
            System.out.println("The number is negative.");
        }


        // Example ( The biggest number)

        int num1 = 52;
        int num2 = 10;
        int num3 = 311;

        int theBiggest = num1 ;

        if (num2 > theBiggest){
            theBiggest = num2;
        }
        else if (num3 > theBiggest){
            theBiggest = num3;
        }

        System.out.println("The biggest number: " + theBiggest);



        // switch

        char grade = 'C';

        switch (grade){

            case 'A':
                System.out.println("Perfect : Passed");
                break;

            case 'B':
                System.out.println("Well : Passed");
                break;

            case 'C':
            case 'D':
                System.out.println("Mid : Passed");
                break;

            case 'F':
                System.out.println("Bad : Passed");
                break;

            default :
                System.out.println("Invalid grade!");
        }


    }
}
