package zadanie15; // Zadanie 1.5
/**
 *Napisz program, który oblicza wynik dzielenia całkowitego
 * bez reszty dwóch liczb całkowitych: a = 37 i b = 11.
 *
 * W języku Java w przypadku zastosowania operatora dzielenia / dla liczb
 * całkowitych reszta wyniku jest pomijana
 */
public class Main
{
    public static void main(String[] args) {

        int a = 37;
        int b = 11;

        System.out.println("Program wyswietla wynik dzielenia całkowitego");
        System.out.println("bez reszty dwóch liczb całkowitych");
        System.out.println("Dla liczb a = " + a + ", b = " + b);
        System.out.println(a + " / " + b + " = " + a/b + ".");
    }
}
