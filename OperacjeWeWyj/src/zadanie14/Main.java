package zadanie14; // Zadanie 1.4

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Napisz program, który oblicza objętość kuli o promieniu r.
 * Wartość promienia wprowadzamy z klawiatury. W programie
 * należy przyjąć, że zmienne: promień r i objetosc, są typu double
 * (rzeczywistego). Dla tych zmiennych należy przyjąć format
 * wyświetlania na ekranie z dokładnością do dwóch miejsc po
 * przecinku.
 */
public class Main
{
    public static void main(String[] args) throws IOException {

        double r, objetosc;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza objętość kuli. ");
        System.out.println("Podaj promień r.");

        r = Double.parseDouble(br.readLine());
/**
 * Objętość kuli o promieniu r oblicza następująca linijka kodu:
 * objetosc = 4.0*Math.PI*r*r*r/3;
 * gdzie potęgowanie zamieniono na mnożenie.
  */
        objetosc = 4.0*Math.PI*r*r*r/3;

        System.out.println("Objętość kuli o promieniu r = ");
        System.out.printf("%2.2f", r);
        System.out.println(" wynosi ");
        System.out.printf("%2.2f.", objetosc);
    }
}
