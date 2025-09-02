
public class Main {
    public static void main(String[] args) {

        // value type (Only using Stack not Heap)

        //Stack  number1 = 10, number2 = 20

        int number1 = 10;
        int number2 = 20;
        number2 = number1; // number2 = 10 right now on stack.
        number1 = 30; // number1 = 30 right now on stack.
        System.out.println(number2); // 10


        // reference type

        //Stack 101 numbers1, 102 numbers2
        //Heap 101 [1,2,3] , 102 [4,5,6]

        int[] numbers1 = new int[] {1,2,3};
        int[] numbers2 = new int[] {4,5,6};
        numbers2 = numbers1; // now both of them 101 and numbers2 is [1,2,3]
        numbers1[0] = 10; // [10,2,3]
        System.out.println(numbers2[0]); // 10

    }
}