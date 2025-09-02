
public class Main {
    public static void main(String[] args) {


        // Our program can throw multiple errors so we can use more catch blocks to identify our program's errors.
        try
        {
            int[] numbers = new int[] {1,2,3};
            System.out.println(numbers[5]);
        }
        catch (StringIndexOutOfBoundsException exception){ // Maybe we could add some String typed codes in our program's code ...
            System.out.println(exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){ // Code will enter here
            System.out.println(exception);
        }
        catch(Exception exception){ // But if there wasn't ArrayIndexOutOfBounds, code would have entered here.
            System.out.println("Logged : " + exception);
        }
        finally {
            System.out.println("I can work all the time.");
        }

    }
}