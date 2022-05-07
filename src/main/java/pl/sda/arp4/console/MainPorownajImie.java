package pl.sda.arp4.console;

import java.util.Scanner;

public class MainPorownajImie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scanner.next();
       // String znane = "Marian";

        if (imie.equals("Marian")){
            System.out.println("Siema kolego dawno się nie widzieliśmy");
        }
        else{
            System.out.println("Witaj " + imie);
        }
    }
}
