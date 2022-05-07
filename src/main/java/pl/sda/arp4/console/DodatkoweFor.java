package pl.sda.arp4.console;

import java.util.Scanner;

public class DodatkoweFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        int result = 1;

        for (int i = 0; i < b; i++) {

            result=result * a;

            System.out.println(result + " = " + a + " * " + result );

        }
        System.out.println("Wynik = " + result);
    }
}
