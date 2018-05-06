package rekurencja; // Zadanie 5.5
/**
 * Rekurencja
 * W języku Java metoda może wywołać samą siebie — proces ten nazywa
 * się rekurencją (lub rekursją), a metoda taka nazywana jest metodą
 * rekurencyjną (lub rekursywną). Główną zaletą rekurencji jest
 * możliwość tworzenia metod realizujących niektóre algorytmy w sposób
 * znacznie prostszy i bardziej czytelny niż niektóre ich odpowiedniki
 * iteracyjne.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Napisz program, który rekurencyjnie oblicza kolejne wartości
 * n! dla n = 10 i wynik wyświetla na ekranie komputera.
 */
class silnia1 {

    public long silnia(int liczba) {
        long zwrot = 1;
        if (liczba >= 2) {

            zwrot = liczba * silnia(liczba - 1);

        }
        return zwrot;
    }
}

public class MainSilnia {

    public static void main(String[] args) throws IOException {

        int i, n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        silnia1 s = new silnia1();

        System.out.println("Obliczanie silni dla dowolnej liczby całkowitej.");
        System.out.println("Podaj n.");

        n = Integer.parseInt(br.readLine());

        for (i = 0; i <= n; i++) {

            System.out.println(" " + i + "! = " + s.silnia(i));

        }


    }
}
