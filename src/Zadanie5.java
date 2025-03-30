// Collections.sort() - odpowiada za sortowanie danych w liscie w porządku od najmniejszej do największej

// P.s. na ćwiczeniach mówił Pan, że ten przykład przejdzie więc finalnie nie odnosilem sie do przykladu z ksiązkami wiec dzialalem dalej na Int'ach. Dzieki! =)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zadanie5 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(2);
        lista.add(8);
        lista.add(1);
        System.out.println(lista); // output - 5, 2, 8, 1 - lista nie jest posortowana

        Collections.sort(lista); // output - 1, 2, 5, 8 - lista jest posorotwana od najmniejszej do najwiekszej
        Collections.reverse(lista); // output - 8, 5, 2, 1 - lista jest posortowana od najwiekszej do najmniejszej

        System.out.println(lista);
    }
}
