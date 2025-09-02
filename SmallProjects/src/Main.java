
public class Main {

    public static void main(String[] args) {

        // Prime number

        int number = 25;
        boolean isPrime = true;

        if(number<=1){
            isPrime = false;
        }

        for(int i=2;i<=number/2;i++){ //i <= Math.sqrt(number) because any factors of a number must be less than or equal to its square root
            if(number%i==0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(number+" is a prime number.");
        }
        else{
            System.out.println(number +" is not a prime number.");
        }




        // Front and Back Vowels

        char letter = 'a';

        switch(letter){

            case 'a':
            case 'o':
            case 'ı':
            case 'u':
                System.out.println(letter + " is a back vowel.");
                break;
            case 'e':
            case 'i':
            case 'ü':
            case 'ö':
                System.out.println(letter + " is a front vowel.");
                break;
            default:
                System.out.println(letter + " is a consonant.");

        }


        // Perfect Numbers

        int num = 28;
        int total = 0;

        for(int i = 1; i<num; i++){
            if(num % i == 0){
                total += i;
            }
        }

        if (num == total){
            System.out.println(num + " is a perfect number.");
        }
        else{
            System.out.println(num + " is not a perfect number");
        }


        // Amicable Numbers

        int num1 = 284;

        int num2 = 220;

        int total1=0;
        int total2=0;

        for(int i = 1; i<num1; i++){
            if(num1 % i ==0){
                total1 +=i;
            }
        }

        for(int i =1; i<num2; i++){

            if(num2 % i == 0){
                total2 +=i;
            }
        }

        if(total1 == num2 && total2 == num1){
            System.out.println(num1 + " and " + num2 + " are amicable numbers");
        }
        else{
            System.out.println(num1 + " and " + num2 + " are not amicable numbers");
        }


        // Find the number

        int[] numbers = new int[]{1,2,5,7,9,0};
        int target = 5;
        boolean isTargetFound = false;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == target){
                isTargetFound = true;
                break;
            }
        }

        if(isTargetFound){
            System.out.println("Target has found in array.");
        }
        else{
            System.out.println("Target has not found in array.");
        }

    }

}