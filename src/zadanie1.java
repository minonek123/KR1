

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        int liczba;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz liczbe z przedzialu od 1 do 10: ");
        liczba = (int) scanner.nextDouble();
        scanner.nextLine();

        if (liczba == 1) {
            System.out.println("Liczba rzymska: I ");
        }
        else if (liczba == 2) {
            System.out.println("Liczba rzymska: II ");
        }
        else if (liczba == 3) {
            System.out.println("Liczba rzymska: III ");
        }
        else if (liczba == 4) {
            System.out.println("Liczba rzymska: IV ");
        }
        else if (liczba == 5) {
            System.out.println("Liczba rzymska: V");
        }
        else if(liczba == 6) {
            System.out.println("Liczba rzymska: VI ");
        }
        else if(liczba == 7) {
            System.out.println("Liczba rzymska: VII ");
        }
        else if(liczba == 8) {
            System.out.println("Liczba rzymska: VIII ");
        }
        else if(liczba == 9) {
            System.out.println("Liczba rzymska: IX ");
        }
        else if(liczba == 10) {
            System.out.println("Liczba rzymska: X ");
        }
        else {
            System.out.println("Nieprzewidziane dane błąd 404" );
        }
    }
}