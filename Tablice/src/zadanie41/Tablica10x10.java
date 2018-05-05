package zadanie41;

/**
 * Napisz program, który w zadeklarowanej tablicy dwuwymiarowej
 * 10×10 umieszcza w pierwszej kolumnie liczby od 0 do 9,
 * w drugiej kwadraty tych liczb, natomiast w pozostałych kolumnach
 * 0 . Dodatkowo program powinien obliczać osobno sumę liczb znajdujących się
 * w pierwszej oraz w drugiej kolumnie.
 */

public class Tablica10x10 {
    public static void main(String[] args) {

        int n = 10, i, j, suma;
        int tablica[][] = new int[n][n];
        // wpisywanie liczb do tablicy

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0) {
                    tablica[i][j] = i;
                }
                if (j == 1) {
                    tablica[i][j] = i * i;
                }
                if (j > 1) {
                    tablica[i][j] = 0;
                }
            }
        }
        // wyświetlenie zawartości tablicy
        for (i = 0; i < n; i++)

        {
            for (j = 0; j < n; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        // obliczanie sumy
        suma = 0;
        for (i = 0; i < n; i++)

        {
            suma = suma + tablica[i][0];
        }
        System.out.println("Suma liczb znajdujących się w pierwszej kolumnie to " + suma + ".");
        suma = 0;
        for (i = 0; i < n; i++)

        {
            suma = suma + tablica[i][1];
        }
        System.out.println("Suma liczb znajdujących się w drugiej kolumnie to " + suma + ".");
    }
}
