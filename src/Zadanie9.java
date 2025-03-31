import java.util.*;

public class Zadanie9 {
    public static void main(String[] args) {
        // HashMapa z ulicami i ich numerami z poprzedniego zadania
        HashMap<String, Integer> ulice = new HashMap<>();
        ulice.put("Marszałkowska", 3);
        ulice.put("Puławska", 4);
        ulice.put("Nowy Świat", 1);
        ulice.put("Antuana", 2);

        System.out.println("Mapa przed posortowaniem: " + ulice);

        // tworze liste key-value bo HashMap nie sortuje po value
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(ulice.entrySet());

        // Sortujemy po wartości (value)
        lista.sort(Comparator.comparing(Map.Entry::getValue));

        System.out.println("Mapa po sortowaniu po wartościach czyli numerach ulic:");
        for (var entry : lista) {
            System.out.println("Ulica: " + entry.getKey() + " nr." + entry.getValue());
        }
    }
}
