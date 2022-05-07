package pl.sda.arp4.console;

public class Zadanie1Petla {
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(i+1);

        }

        for (int i = 1000; i < 1021 ; i++) {
            System.out.print(i + ", ");

        }

        for (int i = -30; i < 1001 ; i++) {

            if (i%5 == 0){
                System.out.println(i );

            }
        }

        for (int i = 1; i <= 100 ; i++) {

            if (i%3 == 0){
                System.out.println(i );

            }
        }

        for (int i = 30; i <= 300 ; i++) {

            if (i%3 == 0 && i%5 == 0 ){
                System.out.println(i );

            }
        }

        for (int i = -300; i <= 300 ; i++) {

            if (i%2 != 0){
                System.out.print(i + " ;" );

            }
        }


    }
}
