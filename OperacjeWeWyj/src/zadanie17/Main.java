package zadanie17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Napisz program, który oblicza sumę, różnicę, iloczyn i iloraz
 * dla dwóch liczb x i y wprowadzanych z klawiatury. W programie
 * należy założyć, że zmienne x i y są typu float (rzeczywistego).
 * Dla zmiennych x, y, suma, roznica, iloczyn i iloraz
 * należy przyjąć format ich wyświetlania na ekranie z dokładnością
 * do dwóch miejsc po przecinku.
 */

public class Main {
    public static void main(String[] args) throws IOException {

        float x, y, suma, roznica, iloczyn, iloraz;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza sumę, różnicę, iloczyn i iloraz");
        System.out.println(" dla dwóch liczb x i y wprowadzonych z klawiatury.");
        System.out.println("Podaj x.");
        x = Float.parseFloat(br.readLine());
        System.out.println("Podaj y.");
        y = Float.parseFloat(br.readLine());

        suma = x + y;
        roznica = x - y;
        iloczyn = x * y;
        iloraz = x / y;

        System.out.printf("Dla liczb x = " + "%2.2f", x);
        System.out.printf(" i y =" + "%2.2f", y);
        System.out.println(); // wyświetlanie pustej lini
        System.out.printf("suma = " + "%2.2f\n", +suma);
        System.out.printf("roznica = " + "%2.2f\n", +roznica);
        System.out.printf("iloczyn = " + "%2.2f\n", +iloczyn);
        System.out.printf("iloraz = " + "%2.2f\n", +iloraz);


    }
}
