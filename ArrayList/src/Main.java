import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(10);
        numbers.add("Moscow");

        System.out.println("Size: " + numbers.size());

        System.out.println(numbers.get(0));

        numbers.set(0,100); // set(index,value)

        numbers.remove(0); // removes value at index

        for(Object i : numbers){
            System.out.println(i);
        }
        numbers.clear(); // drops arraylist
    }
}