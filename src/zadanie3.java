import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args) {
        double waga;
        double wzrost;
        double bmi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile masz kilogramów wagi: (w dokladnosci do 2 miejsc po przcinku) " );
        waga = scanner.nextDouble();
        System.out.println("Podaj ile masz metrów wzrostu (w dokladnosci do 2 miejsc po przcinku): ");
        wzrost = scanner.nextDouble();

        bmi = waga / (wzrost * wzrost);

        BigDecimal bd = new BigDecimal(bmi).setScale(2, RoundingMode.HALF_UP);
        double liczbaZaokroglona = bd.doubleValue();


        System.out.println("Twoje BMI to: " + liczbaZaokroglona);

        if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Masz optymalną wage! ");
        }
        else if (bmi < 18.5) {
            System.out.println("Masz niedowagę! ");
        }
        else if (bmi > 25) {
            System.out.println("Masz nadwage! ");
        }
        else {
            System.out.println("Nieprzewidziane dane błąd 404" );
        }


    }
}