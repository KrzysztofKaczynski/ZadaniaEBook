package zadanie313; // Zadanie 3.13

/**
 * Napisz program, który za pomocą instrukcji for sumuje liczby
 * nieparzyste z przedziału od 1 do 100.
 * Wskazówka
 * Należy skorzystać z właściwości operatora modulo % i oznaczonego
 * symbolem ! operatora negacji.
 */

public class ForSumaNieparzyste {
    public static void main(String[] args) {
        int i, suma = 0;
        System.out.print("Program sumuje liczby nieparzyste ");
        System.out.println("z przedziału od 1 do 100.");
        for (i = 1; i <= 100; i++) {
/**
 * Do wyodrębnienia liczb nieparzystych wykorzystaliśmy właściwości
 * operatora modulo oznaczonego symbolem % oraz właściwości oznaczonego
 * znakiem ! operatora negacji. Drugi z nich przekształca warunek
 * prawdziwy w fałszywy, a fałszywy w prawdziwy. Jeśli reszta z dzielenia
 * całkowitego zmiennej (!(i%2 == 0)) jest różna od zera, to mamy
 * do czynienia z liczbą nieparzystą, którą dodajemy do zmiennej suma.
 */
            if (!(i % 2 == 0)) {
                suma = suma + i;
            }
        }
        System.out.print("Suma liczb nieparzystych z przedziału od 1 do 100 wynosi ");
        System.out.print(suma + ".");
    }
}
