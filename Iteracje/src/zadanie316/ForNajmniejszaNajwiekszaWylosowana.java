package zadanie316; // Zadanie 316

import java.util.Random;

/**
 * Napisz program, który za pomocą instrukcji for znajduje największą
 * i najmniejszą liczbę ze zbioru n wylosowanych liczb
 * całkowitych od 0 do 99 (w zadaniu n = 5) oraz oblicza średnią
 * ze wszystkich wylosowanych liczb.
 */

public class ForNajmniejszaNajwiekszaWylosowana {

    public static void main(String[] args) {

        int ilosc_liczb = 5, i;
        double liczba, suma = 0, min, max;

        System.out.println("Program losuje " + ilosc_liczb + " liczb całkowitych od 0 do 99,");
        System.out.println("a następnie znajduje najmniejszą i największą");
        System.out.println("oraz oblicza średnia ze wszystkich wylosowanych liczb.");

        Random r = new Random();
/**
 * W programie tym najpierw losujemy liczbę i przypisujemy jej wartość
 * min:
 */
        min = Math.round(100 * (r.nextDouble()));
        System.out.println();
        System.out.print("Wylosowano liczby: " + min + ", ");
/**
 * W kolejnym kroku wartości max nadajemy wartość min:
 */
        max = min;
        suma = suma + max;
/**
 * Następnie w pętli pomniejszonej o 1 for (i = 1; i <= ilosc_liczb - 1;
 * i++) sprawdzamy, czy następna wylosowana liczba jest większa od
 * poprzedniej. Jeśli tak, to staje się ona największą liczbą (max); w przeciwnym
 * wypadku przypisujemy jej wartość min. Ilustrują to następujące
 * linijki kodu:
 * if (max < liczba) max = liczba;
 * if (liczba < min) min = liczba;
 */
        for (i = 1; i <= ilosc_liczb - 1; i++) {
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.print(liczba + ", ");
            if (max < liczba) {
                max = liczba;
            }
            if (liczba < min) {
                min = liczba;
            }
/**
 * Sumę wszystkich wylosowanych liczb wyliczają następujące linijki
 * kodu: przed pętlą suma = suma+max i w pętli suma = suma+liczba, natomiast
 * ich średnia jest obliczana i wyświetlana na ekranie przez poniższy
 * wiersz:
 * System.out.println("średnia = " + suma/ilosc_liczb + ".");
 */
            suma = suma + liczba;
        }
        System.out.println();
        System.out.println("największa liczba to " + max + ",");
        System.out.println("najmniejsza liczba to " + min + ",");
        System.out.println("średnia = " + suma / ilosc_liczb + ".");
    }
}

