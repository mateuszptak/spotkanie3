import java.util.*;

public class Zadanie10 {
    public static void main(String[] args) {
        List<String> colors = List.of("Red", "Green", "Blue");
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);
        Map<String, Integer> scores = Map.of("Alice", 95, "Bob", 85, "Charlie", 90);

        colors.add("Yellow"); // java.lang.UnsupportedOperationException
        System.out.println();
        colors.remove("Red"); // java.lang.UnsupportedOperationException

        numbers.add(6); // java.lang.UnsupportedOperationException

        numbers.remove(1); // java.lang.UnsupportedOperationException

        scores.put("David", 80); // java.lang.UnsupportedOperationException

        scores.remove("Alice"); // java.lang.UnsupportedOperationException

    }
}

// Immutable collections są to kolekcje ktorych nie mozna edytować tzn. nie
// mozna ani dodawać ani usuwać elementow oraz modyfikować ich. Mozna je jedynie
// stworzyć i odczytać. Jeśli spróbuje dokonać jakiejkolwiek modyfikacjis
// to wynik jest taki jak w komentarzach powyżej ^
// A jak się je tworzy? No wlasnie tak jak Pan to napisał czyli: List.of(),
// Set.of(), Map.of()
