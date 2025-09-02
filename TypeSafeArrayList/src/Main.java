import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>(); // now the type of arrayList is String : Cannot store any type except Strings
        cities.add("Moscow");
        cities.add("Berlin");
        cities.add("London");
        cities.add("Bahn");
        cities.add("Ankara");

        cities.remove("London");

        Collections.sort(cities); // Sort function

        for(String city: cities){
            System.out.println(city); // sorted result
        }
    }
}