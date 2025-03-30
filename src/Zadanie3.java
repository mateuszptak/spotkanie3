// ------ Różnice między ArrayList a LinkedList w Java ------
// 1. Struktura danych:
//    - ArrayList: jest to dynamiczna tablica, która przechowuje dane w ciągłym bloku pamięci dzięki czemu  dostęp do elementów jest szybki ale dodawanie lub usuwanie elementów w środku listy może być wolniejsze, pponieważ wszystkie następne elementy muszą być "przesunięte" kolokwialnie mowiac
//   - LinkedList: jest to lista dwukierunkowa, w której każdy element (zwany węzłem) przechowuje odniesienia do poprzedniego i następnego elementu. Dzięki temu dodawanie lub usuwanie elementów w dowolnym miejscu jest szybsze, ale dostęp do konkretnego elementu może być wolniejszy, ponieważ trzeba przeglądać listę od początku lub końca

// 2. Dostęp do danych:
//    - ArrayList: bardzo szybki dostęp do elementów, ponieważ można odwołać się do nich bezpośrednio za pomocą indeksu
//    - LinkedList: Dostęp do elementów jest wolniejszy, ponieważ trzeba przeglądać listę od początku lub końca, aby znaleźć konkretny element

// 3. Zużycie pamięci:
//   - ArrayList: Zajmuje mniej pamięci, ponieważ nie przechowuje dodatkowych odniesień do innych elementów
//   - LinkedList: Zajmuje więcej pamięci, ponieważ każdy element przechowuje odniesienia do sasiednich elementoow

// 4. Zastosowanie:
//   - ArrayList: Najlepszy do kolekcji, które są głównie odczytywane lub gdy operacje dodawania i usuwania są rzadkie
//   - LinkedList: Najlepszy do kolekcji, które często są modyfikowane czyli np. dodawanie lub usuwanie poszczegolnych elementow w liscie

// Dodatkowe metody na:

import java.util.LinkedList;

public class Zadanie3 {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        for (int i = 0; i <= 25; i++) {
            lista.add(i);
        }

        // Lista dodatkowych metod ktore sa dostępne po stworzeniu LinkedList, a nie sa
        // dostępne po stworzeniu ArrayList (Maslo maslane, mam nadzieje, ze Pan rozumie
        // o co mi chodzi)

        lista.addFirst(10); // Dodaje 10 na początku listy.
        lista.addLast(20); // Dodaje 20 na końcu listy.
        lista.removeFirst(); // Usuwa pierwszy element.
        lista.removeLast(); // Usuwa ostatni element.
        System.out.println(lista.getFirst()); // Zwraca pierwszy element.
        System.out.println(lista.getLast()); // Zwraca ostatni element.
    }
}