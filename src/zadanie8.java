import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        double cena = 99;
        double cena2;
        int sztuki;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj liczbę sztuk pakietów które chcesz kupic: ");
        sztuki = keyboard.nextInt();

        if (sztuki >= 10 && sztuki <= 19) {
            cena2 = cena - cena*0.30;
            System.out.println("Przyznano rabat 20%" + " Cena: " + cena2*sztuki + "zł");
        }
        else if (sztuki >= 20 && sztuki <= 49) {
            cena2 = cena - cena*0.30;
            System.out.println("Przyznano rabat 30%" + " Cena: " + cena2*sztuki + "zł");
        }
        else if (sztuki >= 50 && sztuki <= 99) {
            cena2 = cena - cena*0.40;
            System.out.println("Przyznano rabat 40%" + " Cena: " + cena2*sztuki + "zł");
        }
        else if (sztuki >= 100) {
            cena2 = cena - cena*0.50;
            System.out.println("Przyznano rabat 50%" + " Cena: " + cena2*sztuki + "zł");
        }
        else {
            System.out.println("Nie przyznano rabatu" + " Cena: " + cena*sztuki + "zł");
        }


    }
}