import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {

        double masa;
        double ciężar;

        Scanner klawisz = new Scanner(System.in);

        System.out.println("Podaj ile kilogramów ma obiekt: " );
        masa = klawisz.nextDouble();

        ciężar = masa * 9.8;

        System.out.println(ciężar + " niutonów");

        if (ciężar > 1000) {
            System.out.println("Obiekt jest zbyt ciężki");
        }
        else if (ciężar < 10) {
            System.out.println("Obiekt jest zbyt lekki");
        }
    }
}