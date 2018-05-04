package zadanie33;

/**
 * Napisz program, który za pomocą instrukcji while dla danych
 * wartości x zmieniających się od 0 do 10 oblicza wartość
 * funkcji y = 3x.
 */

public class While {
    /**
     * Pętla while
     * Ostatnią instrukcją iteracyjną jest while. Jej ogólna postać jest następująca:
     * while (warunek)
     * {
     * // instrukcje
     * }
     * Cechą charakterystyczną tej pętli jest sprawdzanie warunku jeszcze
     * przed wykonaniem instrukcji znajdujących się w bloku {...}. W szczególnym
     * przypadku pętla może nie zostać wcale wykonana. Instrukcja
     * while powoduje wykonywanie instrukcji tak długo, dopóki warunek
     * jest prawdziwy.
     */
    public static void main(String[] args) {
        int x = 0, y = 0;
        // ustalenie wartości początkowych

        System.out.println("Program oblicza wartość funkcji y = 3*x");
        System.out.println("dla x zmieniającego się od 0 do 10.");
        while (x <= 10) {
            y = 3 * x;
            System.out.println("x = " + x + '\t' + " y=" + y);
            x++;
        }
    }
}
