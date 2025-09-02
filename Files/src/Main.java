import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        getInfoFile();
        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {

        File file = new File("/Users/samedtevin/Desktop/JavaIntroduction/Files/students.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu: " + file.getAbsolutePath());
            } else {
                System.out.println("Dosya zaten var: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void getInfoFile() {

        File file = new File("/Users/samedtevin/Desktop/JavaIntroduction/Files/students.txt");

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Is File writable: " + file.canWrite());
            System.out.println("Is File readable: " + file.canRead());
            System.out.println("File size: " + file.length());
        }

    }

    public static void readFile(){

        File file = new File("/Users/samedtevin/Desktop/JavaIntroduction/Files/students.txt");

        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try{
            //if you remove "true" on code block, file will be opened on write only mode. It will remove previous things and write the new things.
            //if you add "true" on code block, file will be opened on write + append mode. The previous things will stay on file and new things will be added too.
            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/samedtevin/Desktop/JavaIntroduction/Files/students.txt", true));
            writer.newLine(); // It is same as ("\n").
            writer.write("Kevin");
            System.out.println("Printed out on file:");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}
