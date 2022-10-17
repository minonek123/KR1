import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        int test1;
        int test2;
        int test3;
        double srednia;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj wynik z pierwszego testu:");
        test1 = keyboard.nextInt();

        System.out.println("Podaj wynik z drugiego testu:");
        test2 = keyboard.nextInt();

        System.out.println("Podaj wynik z trzeciego testu:");
        test3 = keyboard.nextInt();

        srednia = (test1 + test2 + test3) / 3;

        System.out.println("Twoja średnia to: " + srednia);

        if (srednia >= 90 && srednia <= 100) {
            System.out.println("Ocena 5");
        }
        else if (srednia >= 80 && srednia <= 89) {
            System.out.println("Ocena 4");
        }
        else if (srednia >= 70 && srednia <= 79) {
            System.out.println("Ocena 3");
        }
        else if (srednia >= 60 && srednia <=69) {
            System.out.println("Ocena 2");
        }
        else if (srednia >=0 && srednia <= 60) {
            System.out.println("Ocena 1");
        }
        else {
            System.out.println("Nieprzewidziane dane błąd 404" );
        }

    }
}
