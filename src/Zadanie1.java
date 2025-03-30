import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zadanie1 {
    public static void main(String[] args) {
        // Tworzenie listy i seta
        List<Integer> lista = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // petla for do dodawania elementow
        for (int i = 1; i <= 1000000; i++) {
            lista.add(i);
            set.add(i);
        }

        // Sumowanie listy
        long startList = System.nanoTime();
        long sumaListy = 0;
        for (int num : lista) {
            sumaListy += num;
        }
        long endList = System.nanoTime();
        long czasListy = endList - startList;

        // Sumowanie seta
        long startSet = System.nanoTime();
        long sumaSeta = 0;
        for (int num : set) {
            sumaSeta += num;
        }
        long endSet = System.nanoTime();
        long czasSeta = endSet - startSet;

        // Wyniki
        System.out.println("Suma listy: " + sumaListy);
        System.out.println("Suma seta: " + sumaSeta);
        System.out.println("Czas sumowania listy: " + czasListy + " ns");
        System.out.println("Czas sumowania seta: " + czasSeta + " ns");
    }
}
