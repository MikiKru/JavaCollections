import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        // deklaracja zbioru
        Set<String> pesels = new HashSet<>();
        Set<String> pesels_bydgoszcz = new HashSet<>(Arrays.asList("2222","3333","2345","4567"));
        // dodawanie wartości do zbioru
        System.out.println("Dodano? " + pesels.add("1234"));
        System.out.println("Dodano? " + pesels.add("2345"));
        System.out.println("Dodano? " + pesels.add("3456"));
        System.out.println("Dodano? " + pesels.add("4567"));
        System.out.println("Dodano? " + pesels.add("1234"));
        System.out.println(pesels);
        // sprawdzenie przynależnosci do zbioru
        System.out.println("Przynależy: " + pesels.contains("1234"));
        System.out.println("Przynależy: " + pesels.contains("6666"));
        // usunięcie wartości ze zbioru
        pesels.remove("1234");
        System.out.println(pesels);
        // suma zbiorów
        Set<String> temp = new HashSet<>();
        temp.addAll(pesels);
        temp.addAll(pesels_bydgoszcz);
        System.out.println("Po sumowaniu "+ pesels + " + " + pesels_bydgoszcz + " = " + temp);
    }
}
