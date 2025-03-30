// Wyniki są różne ponieważ ArrayList może posiadać duplikaty liczb, a set jedynie unikalne

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Zadanie2 {
    public static void main(String[] args) {
        // Inicjalizacja generatora liczb losowych
        Random rand = new Random();

        // Tworzenie listy do przechowywania 1 000 000 liczb
        List<Integer> numberList = new ArrayList<>(1000000);

        // Generowanie 1 000 000 losowych liczb od 1 do 10
        for (int i = 0; i < 1000000; i++) {
            numberList.add(rand.nextInt(10) + 1);
        }

        // Mierzenie czasu sumowania elementów listy
        long startTimeList = System.nanoTime();
        int sumList = 0;
        for (int num : numberList) {
            sumList += num;
        }
        long endTimeList = System.nanoTime();
        long durationList = endTimeList - startTimeList;

        // Tworzenie zbioru i dodawanie do niego unikalnych elementów z listy
        Set<Integer> numberSet = new HashSet<>(numberList);

        // Mierzenie czasu sumowania elementów zbioru
        long startTimeSet = System.nanoTime();
        int sumSet = 0;
        for (int num : numberSet) {
            sumSet += num;
        }
        long endTimeSet = System.nanoTime();
        long durationSet = endTimeSet - startTimeSet;

        // Wyświetlanie wyników
        System.out.println("Suma elementów listy: " + sumList);
        System.out.println("Czas sumowania listy: " + durationList / 1_000_000.0 + " ms");

        System.out.println("Suma elementów zbioru: " + sumSet);
        System.out.println("Czas sumowania zbioru: " + durationSet / 1_000_000.0 + " ms");
    }
}
