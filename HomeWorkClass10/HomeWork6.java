package HomeWorkClass10;

public class HomeWork6 {
    public static void main(String[] args) {
      //   Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored.

        String [][] countriesNames={{"United States","Canada","Mexico","Cuba","Costa Rica"},
                {"Brazil","Argentina","Colombia","Peru","Chile"},
                {"Germany","Italy","France","Greece","Ukraine"},
                {"India","Japan","China","Indonesia","Philippines"},
                {"South Africa","Namibia","Angola","Algeria","Tanzania"}
        };

        int sum=0;
        for (int i = 0; i < countriesNames.length ; i++) {
            for (int j = 0; j < countriesNames[i].length ; j++) {
                System.out.print(countriesNames[i][j]);
                sum++;
            }
            System.out.println();

        }
        System.out.println("Total numbers of countries: " + sum);

        System.out.println("+----------------------------------------+");


        int sum1 = 0;
        for (String[] countriesName : countriesNames)
            for (String nameCountries : countriesName) {
                System.out.print(nameCountries + " ");
                sum1++;

            }
        System.out.println();

        System.out.println("Total numbers of countries: " + sum1);

    }
}
