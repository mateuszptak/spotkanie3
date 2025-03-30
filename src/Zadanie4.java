// ------ Różnice między HashSet, LinkedHashSet i TreeSet ------

// 1. Struktura danych
// HashSet: Przechowuje dane w sposób losowy, nie zachowuje kolejności. Jest
// szybki
// LinkedHashSet: Zachoowuje kolejność, w jakiej elementy zostały dodane. Jest
// nieco wolniejszy niż HashSet
// TreeSet: Sortuje elementy w porządku alfabetycznym lub numerycznym. Jest
// najwolniejszy z powodu sortowania
// 2. Kolejność elementów
// HashSet: Elementy są w losowej kolejności
// LinkedHashSet: Elementy są w tej samej kolejności, w jakiej zostały dodane
// TreeSet: Elementy są posortowane
// 3. Wydajność
// HashSet: Najlepsza wydajność, operacje są bardzo szybkie
// LinkedHashSet: Trochę wolniejszy niż HashSet, ale nadal szybki
// TreeSet: Wolniejszy z powodu sortowania
// 4. Obsługa null
// HashSet i LinkedHashSet: Mogą zawierać jeden element null
// TreeSet: Nie pozwala na elementy null

// ------ Dodatkowe metody w SortedSet i TreeSet ------
// SortedSet (który jest implementowany przez TreeSet) pozwala na:
// headSet(): Pobiera elementy mniejsze niż dany
// tailSet(): Pobiera elementy większe lub równe danemu
// subSet(): Pobiera elementy w danym zakresie

// Która kolekcja działa najszybciej?
// HashSet jest najszybszy, ponieważ wykorzystuje specjalną strukturę danych
// zwana tablicą haszującą/mieszającą, która jest wewnętrznie implementowana
// przez HashMap. Ta struktura pozwala na szybkie dodawanie, usuwanie i
// wyszukiwanie elementów