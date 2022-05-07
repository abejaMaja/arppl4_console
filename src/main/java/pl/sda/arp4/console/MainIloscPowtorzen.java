package pl.sda.arp4.console;

import java.util.Scanner;

public class MainIloscPowtorzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość powtórzeń: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = i+1;

            System.out.println("Numer iteracji " + num);
            System.out.println("Hello World");


        }
    }
}
