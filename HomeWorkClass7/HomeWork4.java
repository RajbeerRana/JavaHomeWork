package HomeWorkClass7;

public class HomeWork4 {
    public static void main(String[] args) {

        int num = 20;

        while (num <= 50) {
            if( num%2 !=0){

            System.out.print(num+" ");}
             num++;

        }

        System.out.println();
        for(int j=20; j<=50; j++){
            if( j%2 !=0) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
        int i =20;
        do{ if( i%2 !=0) {
            System.out.print(i + " ");
        }
            i+=1;
        }while(i<=50);
    }

}