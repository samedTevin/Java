

public class Main{
    public static void main(String[] args) {

        String[][] cities = new String[3][3];

        cities[0][0] = "Moscow";
        cities[0][1] = "St. Petersburg";
        cities[0][2] = "Kazan";
        cities[1][0] = "Berlin";
        cities[1][1] = "Hanover";
        cities[1][2] = "Dortmund";
        cities[2][0] = "Antalya";
        cities[2][1] = "Istanbul";
        cities[2][2] = "Ankara";

        for(int i = 0; i < cities.length; i++){
            if(i == 0){
                System.out.println("----------Russia---------");
            }
            else if(i == 1){
                System.out.println("---------Germany---------");
            }
            else{
                System.out.println("--------Türkiye----------");
            }
            for(int j = 0; j < cities[i].length; j++){
                System.out.println( (j+1) + ". city: " + cities[i][j]);
            }
        }
    }
}