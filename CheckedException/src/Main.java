import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("/Users/samedtevin/Desktop/JavaIntroduction/CheckedException/src/numbers.txt"));
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        finally {
           reader.close(); // This is a checked exception: You have to use try/catch or throws
            // There is an IOException:
            // Two way : Select one of them
            // 1- surround with try/catch
            // 2- notify the user (add exception to method signature) with "throws" IOException
        }
    }
}