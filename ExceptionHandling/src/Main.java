

public class Main {
    public static void main(String[] args) {

        try
        {
            int[] numbers = new int[] {1,2,3};
            System.out.println(numbers[5]);
        }
        catch(Exception exception){
            System.out.println(exception);
            // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        }
        finally {
            System.out.println("I can work all the time.");
        }

    }
}