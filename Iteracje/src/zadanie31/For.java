package zadanie31; //Zadanie 3.1

/**
 * Iteracja (łac. iteratio — powtarzanie) to czynność powtarzania (najczęściej
 * wielokrotnego) tej samej instrukcji (albo wielu instrukcji) w pętli.
 * W Javie istnieją trzy instrukcje iteracyjne:
 * 􀁔 for (dla),
 * 􀁔 do ... while (wykonuj dopóki),
 * 􀁔 while (dopóki).
 */

public class For {

    /**
     * Pętlę for stosujemy, kiedy dokładnie wiemy, ile razy ma ona zostać
     * wykonana. Istnieje wiele wariantów tej pętli, ale zawsze możemy wyróżnić
     * trzy główne części.
     * 1. Inicjalizacja to zwykle instrukcja przypisania stosowana do
     * ustawienia początkowej wartości zmiennej sterującej.
     * 2. Warunek jest wyrażeniem relacyjnym określającym moment
     * zakończenia wykonywania pętli.
     * 3. Inkrementacja (zwiększanie) lub dekrementacja (zmniejszanie)
     * definiuje sposób modyfikacji zmiennej sterującej pętlą po
     * zakończeniu każdego przebiegu (powtórzenia).
     * Te trzy główne składowe oddzielone są od siebie średnikami.
     * Pętla for wykonywana jest tak długo, dopóki wartość warunku wynosi
     * true. Gdy warunek osiągnie wartość false, działanie programu
     * jest kontynuowane od pierwszej instrukcji znajdującej się za pętlą.
     * W języku Java zmienna sterująca pętlą for nie musi być typu całkowitego,
     * znakowego czy logicznego — może być ona również np. typu float.
     * Pętla for może być wykonywana tyle razy, ile wartości znajduje się
     * w przedziale:
     * inicjalizacja; warunek; zwiększanie
     * lub
     * inicjalizacja; warunek; zmniejszanie
     * Ogólna postać tej instrukcji jest następująca:
     * for (inicjalizacja; warunek; zwiększanie)
     * {
     * // instrukcje
     * }
     * lub
     * for (inicjalizacja; warunek; zmniejszanie)
     * {
     * // instrukcje
     * }
     * W języku Java jest możliwa zmiana przyrostu zmiennej sterującej pętlą.
     */

    public static void main(String[] args) {

        int x, y;

        System.out.println("Program oblicza wartość funkcji y = 3*x");
        System.out.println("dla x zmieniającego się od 0 do 10.");

        for (x = 0; x <= 10; x++) {

            y = 3 * x;
            System.out.println("x = " + x + '\t' + "y = " + y);

/**
 * W pętli
 * for (x = 0; x <= 10; x++)
 * {
 * y = 3*x;
 * System.out.println("x = " + x + '\t' + "y = " + y);
 * }
 * kolejne wartości x, zmieniające się automatycznie od x = 0 (inicjalizacja)
 * do x <= 10 (warunek) z krokiem równym 1 (zwiększanie), są
 * podstawiane do wzoru
 * y = 3*x;
 * a następnie zostają wyświetlone na ekranie dzięki użyciu polecenia
 * System.out.println("x = " + x + '\t' + "y = " + y);
 * Znak '\t' oznacza przejście do następnej pozycji w tabulacji linii.
 */
        }

    }
}
