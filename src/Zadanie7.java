import java.util.*;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź tekst:");

        // wczytuje caly tekst i przyisuje ja do zmiennej "text"
        String text = scanner.nextLine();

        // Rozdziel tekst na słowa
        String[] slowa = text.toLowerCase().split("\\s+");

        // Map do zliczania ilosci slow
        Map<String, Integer> zliczaczSlow = new HashMap<>();

        // Przechodzimy przez każde słowo i zliczamy wystąpienia
        for (String slowo : slowa) {
            slowo = slowo.toLowerCase();
            zliczaczSlow.put(slowo, zliczaczSlow.getOrDefault(slowo, 0) + 1);
        }

        // Sortowanie słów alfabetycznie
        List<String> sortedWords = new ArrayList<>(zliczaczSlow.keySet());
        Collections.sort(sortedWords);

        // Wypisywanie słów i ich zliczeń
        System.out.println("Zliczenia słów:");
        for (String word : sortedWords) {
            System.out.println(word + ": " + zliczaczSlow.get(word));
        }

        scanner.close();
    }
}