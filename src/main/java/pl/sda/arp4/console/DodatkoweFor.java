package pl.sda.arp4.console;

import java.util.Scanner;

public class DodatkoweFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println(a*i);

        }
    }
}
