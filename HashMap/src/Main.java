import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("book","kitap"); // key,value
        dictionary.put("table","masa");
        dictionary.put("computer","bilgisayar");
        dictionary.remove("table"); // key
        System.out.println(dictionary.get("table")); // null
        System.out.println(dictionary.size());

        for(String item : dictionary.keySet()){
            System.out.println("Element:" + item + " Value:" + dictionary.get(item));
        }

        System.out.println(dictionary); // {computer=bilgisayar, book=kitap, table=masa}

        dictionary.clear();



    }
}