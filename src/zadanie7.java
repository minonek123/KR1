import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        String name;
        String name2;
        String name3;

        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj pierwsze imie: ");
        name = klawisz.nextLine();

        System.out.println("Podaj drugie imie: ");
        name2 = klawisz.nextLine();

        System.out.println("Podaj trzecie imie: ");
        name3 = klawisz.nextLine();

        List<String> names = new ArrayList<>();
        names.add(name);
        names.add(name2);
        names.add(name3);
        Collections.sort(names);
        System.out.println(names);

    }
}