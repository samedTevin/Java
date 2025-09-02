public class Parameter {

    public static void main(String[] args){
        String message = "The weather is good today.";
        String newMessage = returnCity();
        System.out.println(newMessage);
        int number = addition(15,7);
        System.out.println("Result: "+number);
        int result = addition2(2,3,4,5,6,10);
        System.out.println("Result 2: "+ result);

    }

    public static void add(){
        System.out.println("Added.");
    }

    public static void delete(){
        System.out.println("Deleted");
    }

    public static int addition(int number1, int number2){
        return number1+number2;
    }

    // Variable Arguments (Varargs)
    // Lets you pass any number of int values to a method. Internally, it works like an int[] array.
    public static int addition2(int... numbers){
        int total = 0;

        for(int number : numbers) {
            total += number;
        }

        return total;
    }

    public static String returnCity(){
        return "Washington";
    }
}
