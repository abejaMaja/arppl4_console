package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int liczba2 = scanner.nextInt();

        if (liczba1 <= liczba2){
            System.out.println("Podaj dzielnik");
            int dzielinik = scanner.nextInt();
            for (int i = liczba1; i <= liczba2; i++) {
                int result = i%dzielinik;
                if (result == 0){
                    System.out.println(i);
                }
        else{
                    System.out.println("podaj jeszcze raz bo druga liczba musi byc większa, program nie zadziała");

                }


            }
        }



    }
}
