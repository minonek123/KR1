import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        int day;
        int month;
        int twolastnumberyear;

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj numer dnia: " );
        day = klawisz.nextInt();

        System.out.println("Podaj numer miesiąca: ");
        month = klawisz.nextInt();

        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        twolastnumberyear = klawisz.nextInt();


        if (day + month == twolastnumberyear) {
            System.out.println("Data jest magiczna! ");
        }
        else{
            System.out.println("Data nie jest magiczna! ");
        }
    }
}