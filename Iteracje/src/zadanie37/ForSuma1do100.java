package zadanie37; // Zadanie 3.7

/**
 * Napisz program, który przy użyciu instrukcji for sumuje
 * liczby całkowite od 1 do 100.
 */

public class ForSuma1do100 {

    public static void main(String[] args) {

        int i, suma = 0;

        System.out.println("Program sumuje liczby całkowite od 1 do 100.");

        for (i = 1; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + suma + ".");
    }
}
