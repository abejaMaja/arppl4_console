package pl.sda.arp4.console;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tekst;

        do{
            System.out.println("Wpisz tekst");
            tekst = scanner.next();
            System.out.println(tekst.toUpperCase());
        } while (!tekst.equals("quit"));

    }
}
