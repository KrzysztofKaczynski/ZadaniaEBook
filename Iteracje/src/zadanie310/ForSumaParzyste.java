package zadanie310; // zadanie 3.10

/**
 * Napisz program, który za pomocą instrukcji for sumuje liczby
 * parzyste z przedziału od 1 do 100.
 * Wskazówka
 * Należy skorzystać z właściwości operatora modulo %.
 */

public class ForSumaParzyste {
    public static void main(String[] args) {

        int i, suma = 0;

        System.out.println("Program sumuje liczby parzyste z przedziału od 1 do 100.");

        for (i = 1; i <= 100; i++) {
/**
 * Do wyodrębnienia liczb parzystych wykorzystaliśmy właściwości
 * operatora modulo oznaczonego symbolem %. Użyliśmy w tym celu
 * zapisu i%2 == 0 — jeśli reszta z dzielenia całkowitego zmiennej i%2
 * wynosi zero, to mamy do czynienia z liczbą parzystą, którą dodajemy
 * do zmiennej suma.
 */

            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println("Suma liczb parzystych z przedziału od 1 do 100 wynosi ");
        System.out.println(suma + ".");
    }
}
