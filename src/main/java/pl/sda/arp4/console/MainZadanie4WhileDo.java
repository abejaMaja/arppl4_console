package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4WhileDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int liczba1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int liczba2 = scanner.nextInt();

        if (liczba1 > liczba2){
            System.out.println("to bład");
        }

        System.out.println("Podaj dzielnik");
        int dzielinik = scanner.nextInt();


        int i = liczba1;
        while (i < liczba2 + 1) {
            if (i%dzielinik == 0){
                System.out.println(i);
            }
            i++;

        }

    }
}
