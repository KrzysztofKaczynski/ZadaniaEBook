package zadanie52; // zadanie 5.2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Napisz zgodnie z zasadami programowania obiektowego
 * program, który oblicza pierwiastki równania kwadratowego
 * ax2+bx+c = 0 z wykorzystaniem instrukcji wyboru switch ...
 * case. Klasa powinna zawierać trzy metody:
 * 􀁔 czytaj_dane() — metoda jest odpowiedzialna za wczytanie
 * danych do programu oraz obsłużenie sytuacji, kiedy a = 0.
 * Zmienne a, b i c to liczby rzeczywiste wprowadzane
 * z klawiatury.
 * 􀁔 przetworz_dane() — metoda odpowiada za wykonanie
 * niezbędnych obliczeń.
 * 􀁔 wyswietl_wynik() — metoda jest odpowiedzialna za
 * wyświetlenie wyników na ekranie monitora. Dla
 * zmiennych a, b, c, x1 oraz x2 należy przyjąć format
 * wyświetlania ich z dwoma miejscami po przecinku.
 */

class Trojmian {

    double a, b, c, delta, x1, x2;
    char liczba_pierwiastkow;

    public void czytaj_dane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Program oblicza pierwiastki równania kwadratowego");
        System.out.println(" dla dowolnych wartości a, b oraz c.");
        System.out.println("Podaj a.");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {
            System.out.println("Niedozwolona wartość współczynnika a.");
            System.exit(1);
            // wyjście z programu
        }
        else {
            System.out.println("Podaj b.");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj c.");
            c = Double.parseDouble(br.readLine());

        }
    }

    public void przetworz_dane(){

        delta = b*b-4*a*c;

        if (delta < 0) {
            liczba_pierwiastkow = 0;
        }
        if (delta == 0) {
            liczba_pierwiastkow = 1;
        }
        if (delta > 0) {
            liczba_pierwiastkow = 2;
        }
        switch(liczba_pierwiastkow)
        {
            case 1 : x1 = -b/(2*a);
                break;
            case 2 : {x1 = (-b-Math.sqrt(delta))/(2*a);
                x2 = (-b+Math.sqrt(delta))/(2*a);
            }
            break;
        }
    }
    public void wyswietl_wynik()
    {
        System.out.println("Dla wprowadzonych liczb");
        System.out.printf("a = "+"%2.2f,\n", a);
        System.out.printf("b = "+"%2.2f,\n", b);
        System.out.printf("c = "+"%2.2f,\n", c);
        switch (liczba_pierwiastkow)
        {
            case 0 : System.out.print("brak pierwiastków rzeczywistych.");
                break;
            case 1 : System.out.printf("trójmian ma jeden pierwiastek podwójny\n" + "x1 = " + "%2.2f.\n", x1);
                break;
            case 2 : {System.out.println("trójmian ma dwa pierwiastki");
                System.out.printf("x1 = "+"%2.2f,\n", x1);
                System.out.printf("x2 = "+"%2.2f.\n", x2);
            }
            break;
        }
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        Trojmian trojmian1 = new Trojmian();
        trojmian1.czytaj_dane();
        trojmian1.przetworz_dane();
        trojmian1.wyswietl_wynik();
    }
}
