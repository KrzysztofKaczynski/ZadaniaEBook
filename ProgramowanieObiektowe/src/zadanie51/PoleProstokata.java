package zadanie51; // Zadanie 5.1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Napisz zgodnie z zasadami programowania obiektowego program,
 * który oblicza pole prostokąta. Klasa powinna zawierać
 * trzy metody:
 * 􀁔 czytaj_dane() — metoda umożliwia wprowadzenie do
 * programu długości boków a i b z klawiatury. W programie
 * należy przyjąć, że a i b oraz zmienna pole są typu double
 * (rzeczywistego).
 * 􀁔 przetworz_dane() — metoda oblicza pole prostokąta
 * według wzoru pole = a*b.
 * 􀁔 wyswietl_wynik() — metoda wyświetla długości boków a i b
 * oraz wartość zmiennej pole w określonym formacie.
 * Dla zmiennych a i b oraz pole należy przyjąć format
 * wyświetlania ich na ekranie z dwoma miejscami po
 * przecinku.
 */

class pole_prostokata{

    double a, b, pole;

   public void czytaj_dane() throws IOException //deklaracja i opis metody czytaj_dane()
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Program oblicza pole prostokąta.");
       System.out.println("Podaj bok a.");
       a = Double.parseDouble(br.readLine());
       System.out.println("Podaj bok b.");
       b = Double.parseDouble(br.readLine());
   }

    public void przetworz_dane() //deklaracja i opis metody przetworz_dane()
    {
        pole = a * b;
    }

    public void wyswietl_wynik() //deklaracja i opis metody wyswietl_wynik()
    {
        System.out.print("Pole prostokąta o boku a = ");
        System.out.printf("%2.2f", a);
        System.out.print(" i boku b = ");
        System.out.printf("%2.2f", b);
        System.out.print(" wynosi ");
        System.out.printf("%2.2f.\n", pole);
    }

}

public class PoleProstokata {

    public static void main(String[] args) throws IOException {
        pole_prostokata pole = new pole_prostokata();
        //deklaracja zmiennej, utworzenie obiektu i przypisanie go do zmiennej

        pole.czytaj_dane();// wywołanie metody czytaj_dane()
        pole.przetworz_dane(); // wywołanie metody przetworz_dane()
        pole.wyswietl_wynik(); // wywołanie metody wyswietl_wynik()
    }
}
