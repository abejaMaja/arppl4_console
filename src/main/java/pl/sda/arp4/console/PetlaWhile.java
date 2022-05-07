package pl.sda.arp4.console;

import java.util.Scanner;

public class PetlaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość kroków");
        int liczba = scanner.nextInt();

        do{
            System.out.println("Hello world");
            liczba--;
        }while (liczba>0);

        System.out.println("Podaj ilość kroków dla inkrementacji");
        int liczba2 = scanner.nextInt();

        int i = 0;
        do{
            System.out.println("Hello world");
            i++;
        }while (i < liczba2);
    }
}
