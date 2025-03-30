// 1. Różnice między kolekcjami:
//  -- HashMap --
// Elementy w tej mapie są przechowywane w sposób nieposortowany.
// Wykorzystuje funkcję haszowania dla kluczy, dzięki czemu operacje takie jak put, get i remove są szybciutkie

// -- LinkedHashMap -- 
// Podobna do HashMap, ale z dodatkową cechą: zachowuje kolejność dodawania elementów.
// Dzięki zastosowaniu listy dwukierunkowej, jest nieco wolniejsza od HashMap.

// -- TreeMap --
// Przechowuje elementy w porządku rosnącym według klucza.
// Bazuje na strukturze  "Binary Search Tree", co sprawia, że operacje takie jak put i get wykonują się w czasie O(log n) - to znaczy, że są wolniejsze niż w HashMap i LinkedHashMap.

//  ----- Map, SortedMap, NavigableMap -----

// Map: Zwykła mapa klucz-wartość, brak gwarancji zachowania kolejności
// SortedMap: Mapa, która sortuje elementy według klucza
// NavigableMap: Rozszerza SortedMap, dodaje metody do "poruszania się" po mapie

// 2.  Która kolekcja jest najszybsza?
// Popd względem wydajności najszybsza jest HashMap bo wykorzystuje tablice haszowanie do przechowywania elementóów

// Działa na zasadzie haszowania, co sprawia, że operacje takie jak dodawanie, odczyt czy usuwanie elementów wykonują się bardzo szybko

// 3.  Dodatkowe metody w TreeMap i SortedMa:

// firstKey() – zwraca klucz o najmniejszej wartości.

// lastKey() – zwraca klucz o największej wartości.

// headMap(K toKey) – zwraca mapę kluczy mniejszych od toKey.

// tailMap(K fromKey) – zwraca mapę kluczy większych lub równych fromKey.

// subMap(K fromKey, K toKey) – zwraca mapę z elementami w zakresie od fromKey do toKey.

// NavigableMap (TreeMap) ma dodatkowe metody do pracy z najbliższymi kluczami:

// lowerKey(K key) – zwraca najbliższy klucz mniejszy od podanego.

// higherKey(K key) – zwraca najbliższy klucz większy od podanego.

// ceilingKey(K key) – zwraca najmniejszy klucz większy lub równy od podanego.

// floorKey(K key) – zwraca największy klucz mniejszy lub równy od podanego.

// 4. Aby sprawdzić kod metod, funkcji itd wystarczy najechać myszką na dany obiekt i z wcisnietym ctrl kliknac LPM. Mam nadzieje, że o to chodzi

public class Zadanie6 {
    public static void main(String[] args) {

    }
}
