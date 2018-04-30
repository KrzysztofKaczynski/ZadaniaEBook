package Zadanie12; // Zadanie 1.2

/**
 * Napisz program, który wyświetla na ekranie komputera wartość
 * predefiniowanej stałej π = 3,14… Należy przyjąć format wyświetlania
 * tej stałej z dokładnością do pięciu miejsc po przecinku.
 *
 * Wskazówka
 * Język Java umożliwia formatowanie wyświetlanych danych w podobny
 * sposób jak w języku C. Służy do tego metoda printf. Jej składnia jest
 * następująca:
 * String format;
 * System.out.printf(format, arg_1, arg_2, ..., arg_n); .
 */
public class Main
{
    public static void main(String[] args) {

        System.out.println("Program wyswietla liczbę pi z zadaną dokładnością.");

        System.out.printf("Pi = " + "%6.5f\n", Math.PI);

/**
 *Specyfikatory typów mogą być następujące:
 * 􀁔 %d — integer,
 * 􀁔 %e — double,
 * 􀁔 %f — float.
 * Pomiędzy znakiem % i literą przyporządkowaną danemu typowi można
 * określić ilość pól, na których ma zostać wyświetlona liczba, np.:
 * %7.2f — oznacza przyznanie siedmiu pól na liczbę typu float,
 * w tym dwóch pól na jej część ułamkową;
 * %4d — oznacza przyznanie czterech pól na liczbę typu całkowitego.
 * W programie zapis
 * System.out.printf("Pi = " + "%6.5f\n", Math.PI);
 * powoduje, że na wydruk liczby π przeznaczonych zostaje sześć pól,
 * w tym pięć na część ułamkową. Znak specjalny "...\n" (ang. new line)
 * oznacza przejście na początek nowego wiersza. Math jest standardową
 * klasą Javy, która umożliwia obliczenia matematyczne.
 */
    }
}
