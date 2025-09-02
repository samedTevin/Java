public class Main {


    public static void main(String[] args) {
        String[] students = new String[4];
        // String students[] = new String[4]; -----> Another version of declaring array.

        /*
        String[] students;
        students = new String[4];
        */

        students[0] = "Mike";
        students[1] = "Alice";
        students[2] = "Emma";
        students[3] = "George";


        for(int i = 0;i<students.length;i++){
            System.out.println(students[i]);
        }

        // Another version of loop for array.
        for(String student : students){
            System.out.println(student);
        }





        // Example

        double[] myList = {1.2,6.3,4.3,5.6};
        double total = 0;
        double max = myList[0];

        for(double number : myList){

            if(max < number){
                max = number;
            }
            total += number;
        }

        System.out.println("Total : " + total);
        System.out.println("Max : " + max);


    }






}
