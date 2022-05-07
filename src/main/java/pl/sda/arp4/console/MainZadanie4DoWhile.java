package pl.sda.arp4.console;

import java.util.Scanner;

public class MainZadanie4DoWhile {
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

        do{
            i++;
            if (i%dzielinik == 0){
                System.out.println(i);
            }

        }while (i <liczba2);
    }
}
