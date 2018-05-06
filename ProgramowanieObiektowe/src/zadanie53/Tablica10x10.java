package zadanie53; // Zadanie 5.3

import java.util.*;

/**
 * Napisz zgodnie z zasadami programowania obiektowego program,
 * który w tablicy 10×10 umieszcza losowo na przekątnej
 * liczby od 0 do 9, a poza przekątną zera. Dodatkowo program
 * oblicza sumę liczb znajdujących się na przekątnej. Klasa powinna
 * zawierać trzy metody z parametrami:
 * 􀁔 czytaj_dane(double [][]macierz, int rozmiar) — metoda
 * umieszcza dane w tablicy.
 * 􀁔 przetworz_dane(double [][]macierz, int rozmiar) — metoda
 * oblicza i wyświetla sumę liczb znajdujących się na
 * przekątnej.
 * 􀁔 wyswietl_wynik(double [][]macierz, int rozmiar) — metoda
 * wyświetla zawartość tablicy na ekranie monitora.
 */

class matrix {

    public void czytaj_dane(double[][] macierz, int rozmiar) {
        int i, j;
        Random rand = new Random();
        // generowanie liczby pseudolosowej
        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                if (i == j) {
                    macierz[i][j] = Math.round(9 * (rand.nextDouble()));
                }
// wpisywanie liczb pseudolosowych od 0 do 9 na przekątnej tablicy

                else {
                    macierz[i][j] = 0;
                }
// wpisywanie liczby 0 poza przekątną
            }
        }
    }

    public void przetworz_dane(double[][] macierz, int rozmiar) {
        int i;
        double suma = 0;
        for (i = 0; i < rozmiar; i++) {
            suma = suma + macierz[i][i];
        }
        System.out.println("Suma elementów na przekątnej wynosi " + (int) suma + ".");
// rzutowanie
    }

    public void wyswietl_wynik(double[][] macierz, int rozmiar) {
        int i, j;
        for (i = 0; i < rozmiar; i++) {
            for (j = 0; j < rozmiar; j++) {
                System.out.print((int) macierz[i][j] + " ");
                // rzutowanie
            }
            System.out.println();
        }
    }
}

public class Tablica10x10 {
    public static void main(String[] args) {
        int rozmiar = 10;
        double[][] tablica = new double[rozmiar][rozmiar];
        matrix matrix1 = new matrix();
        matrix1.czytaj_dane(tablica, rozmiar);
        matrix1.przetworz_dane(tablica, rozmiar);
        matrix1.wyswietl_wynik(tablica, rozmiar);
    }
}