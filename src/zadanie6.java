import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        int sekundy;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę sekund:");
        sekundy = keyboard.nextInt();

        if (sekundy > 60){
            System.out.println("Ilosc czasu to: " + sekundy + "s");
        }
        if (sekundy > 59 && sekundy < 3600){
            sekundy = sekundy / 60;
            System.out.println("Ilosc czasu to: " + sekundy + "min");
        }
        if (sekundy > 3599 && sekundy < 86400){
            sekundy = sekundy / 3600;
            System.out.println("Ilosc czasu to:" + sekundy + "h");
        }
        if (sekundy > 86400){
            sekundy = sekundy / 86400;
            System.out.println("Ilosc czasu to: " + sekundy + "dni");
        }
    }
}