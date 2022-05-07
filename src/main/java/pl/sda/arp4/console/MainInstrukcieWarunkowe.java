package pl.sda.arp4.console;

import java.util.Scanner;

public class MainInstrukcieWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę pierwszą");
        int liczbaPierwsza = scanner.nextInt();

        System.out.println("podaj liczbę drugą");
        int liczbaDruga = scanner.nextInt();


        if ( liczbaPierwsza> liczbaDruga) {
            System.out.println("Pierwsza większa");
        }
        if ( liczbaPierwsza < liczbaDruga) {
            System.out.println("Druga większa");
        }

        else {
            System.out.println("Są równe");
        }

    }

}
