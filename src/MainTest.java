import java.io.File;
import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("JCollections");
        // utworzenie pustej listy
        List<String> fruits = new ArrayList<>();
        // sprawdzenie rozmiaru listy
        System.out.println("Rozmiar listy:" + fruits.size());
        // dodawanie do listy
        fruits.add("Jabłko");
        fruits.add("Gruszka");
        fruits.add("Pomidor");
        fruits.add("Ogórek");
        fruits.add("Mandarynka");
        // dodawanie elementów na dowolonym indeksie
        fruits.add(1,"Mango");
//        fruits.add(10,"Mango"); -- błąd
        // wypisanie zawartości tablicy
        System.out.println(fruits);
        // wyrażenie lambda
        System.out.println("Lambda");
        fruits.forEach(fruit -> System.out.println(fruit));
        // to samo
        System.out.println("For each");
        for (String f : fruits){
            System.out.println(f);
        }
        // modyfikacja wartości w liście
        fruits.set(1,"Kaka");
        // odczytanie wartości na podanym indeksie
        System.out.println(fruits.get(1));
        System.out.println(fruits);
        // usuwanie wartości
        fruits.remove("Gruszka");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        System.out.println(fruits.get(0));

        // Inicjalizacja listy wartościami początkowymi
        List<String> brands = new ArrayList<>(Arrays.asList("BMW","Audi","VW","Toyota"));
        brands.add("Porsche");
        System.out.println(brands);

    }
}
