// W konstruktorze mozna przekazać rożne elementy w zaleznosci od typu kolekcji tzn, mozna przekazać:
// - elementy do dodania do kolekcji
// - inna kolekcje do skopiowania/dodania
// - wartość początkowa do kolekcji w celu optymalizacji

import java.util.*;

public class Zadanie8 {
    public static void main(String[] args) {
        // HashMapa z ulicami i ich numerami
        HashMap<String, Integer> ulice = new HashMap<>();
        ulice.put("Marszałkowska", 10);
        ulice.put("Puławska", 5);
        ulice.put("Nowy Świat", 8);
        ulice.put("Antuana", 1);

        System.out.println("mapa przed posortowaniem:" + ulice);

        // Przekazujemy do TreeMap, żeby posortować po nazwie ulicy (a-z) czyli kluczu
        // jak w tresci zadania
        // aby posortować po kluczu, musimy użyć TreeMap, która automatycznie sortuje
        // elementy na wlasnie ich podstawie
        // Natomiast jesli chcialbym sortować po value, musialbym stworzyć własny
        // Comparator P.s. wiem, że to nie bylo wymagane ale są to moje notatki do
        // ktorych bede wracal.
        TreeMap<String, Integer> posortowaneUlice = new TreeMap<>(ulice);

        System.out.println("mapa po posortowaniu:" + posortowaneUlice);

        // wynik za pomoca petli for-each
        for (var entry : posortowaneUlice.entrySet()) {
            System.out.println("Ulica: " + entry.getKey() + " nr." + entry.getValue());
        }
    }
}
