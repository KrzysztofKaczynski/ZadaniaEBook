package zadanie54; // Zadanie 5.4

/**
 * Napisz zgodnie z zasadami programowania obiektowego program,
 * który sortuje n liczb. Klasapowinna zawierać trzy metody z parametrami:
 * 􀁔 czytaj_dane(int [] liczby, int n) — metoda czyta dane
 * i umieszcza je w tablicy o nazwie liczby.
 * 􀁔 przetworz_dane(int [] liczby, int n) — metoda sortuje dane
 * według wybranego algorytmu sortowania (w programie
 * wykorzystano algorytm sortowania bąbelkowego).
 * 􀁔 wyswietl_wynik(int [] liczby, int n) — metoda wyświetla
 * zawartość posortowanej tablicy liczby na ekranie monitora.
 */
class sortowanie {

    public void czytaj_dane(int[] liczby, int n) {

        int i;

        liczby[0] = 57;
        liczby[1] = 303;
        liczby[2] = 34;
        liczby[3] = 1025;
        liczby[4] = 8;
        liczby[5] = 20;

        System.out.println("Liczby nieposortowane: ");

        for (i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.println(liczby[i] + ", ");
            } else {
                System.out.println(liczby[i] + ".");
            }
            System.out.println();
        }
    }

    public void przetworz_dane(int[] liczby, int n) {

        int i, j, x;

        for (i = 1; i <= n - 1; i++) {

            for (j = n - 1; j >= i; --j) {

                if (liczby[j - 1] > liczby[j]) {

                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }

            } // koniec pętli j

        } // koniec pętli i

    }

    public void wyswietl_wynik(int[] liczby, int n) {

        int i;

        System.out.println("Liczby posortowane: ");

        for (i = 0; i < n; i++) {

            if (i < n - 1) {
                System.out.println(liczby[i] + ", ");
            } else {
                System.out.println(liczby[i] + ".");
            }
            System.out.println();
        }

    }
}

public class SortowanieBubble {

    public static void main(String[] args) {

        int n = 6;
        int[] liczby = new int[n];

        sortowanie babelki = new sortowanie();

        babelki.czytaj_dane(liczby, n);
        babelki.przetworz_dane(liczby, n);
        babelki.wyswietl_wynik(liczby, n);
    }
}
