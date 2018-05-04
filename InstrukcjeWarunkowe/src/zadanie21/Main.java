package zadanie21; // zadanie 2.1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Napisz program, który sprawdza dla trzech boków trójkąta a,
 * b i c wprowadzonych z klawiatury, czy tworzą one trójkąt prostokątny
 * (zakładamy, że a > 0, b > 0, c > 0).
 */

public class Main {

    public static void main(String[] args) throws IOException {
/**
 * W Javie istnieją dwie instrukcje warunkowe:
 * 􀁔 instrukcja warunkowa if ... else,
 * 􀁔 instrukcja wyboru switch ... case.
 * Instrukcja if ... else służy do sprawdzania poprawności wyrażenia
 * warunkowego i w zależności od tego, czy dany warunek jest prawdziwy,
 * czy nie, pozwala na wykonanie różnych bloków programu.
 * Jej ogólna postać jest następująca:
 * if (warunek)
 * {
 * // instrukcje do wykonania, kiedy warunek jest prawdziwy
 * }
 * else
 * {
 * // instrukcje do wykonania, kiedy warunek jest fałszywy
 * }
 *
 * Instrukcja wyboru switch ... case pozwala w wygodny i przejrzysty
 * sposób sprawdzić ciąg warunków i wykonywać kod w zależności od
 * tego, czy są one prawdziwe, czy fałszywe. Oto jej ogólna postać:
 * switch (wyrażenie)
 * {
 * case wartość_1 : instrukcje_1;
 * break;
 * case wartość_2 : instrukcje_2;
 * break;
 * ........................
 * case wartość_n : instrukcje_n;
 * break;
 * default : instrukcje;
 * }
 * Instrukcja break przerywa wykonywanie całego bloku case.
 */

        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj bok a.");
        a = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok b.");
        b = Integer.parseInt(br.readLine());
        System.out.println("Podaj bok c.");
        c = Integer.parseInt(br.readLine());

/**
 * Sprawdzenie twierdzenia Pitagorasa dla wczytanych boków a, b i c.
 */
        if ((a * a + b * b) == c * c) {

            System.out.println("Boki");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("tworzą trójkąt prostokątny.");
        } else {
            System.out.println("Boki");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("nie tworzą trójkąta prostokątnrgo.");
        }
    }
}
