
public class Main {

    public static void main(String[] args) {

        findTarget();

    }


    public static void findTarget(){
        int numbers[] = new int[]{1,2,5,7,9};
        int target = 6;
        boolean isFound = false;

        for(int number : numbers){
            if(target == number){
                isFound = true;
                break;
            }
        }

        printResult(isFound,target);
    }

    public static void printResult(boolean isFound,int target){

        if(isFound){
            System.out.println("The number is found: "+target);
        }
        else{
            System.out.println("The number is not found: "+target);
        }

    }
}