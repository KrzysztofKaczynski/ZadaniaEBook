package zadanie11; //Zadanie 1.1

/**
 * Napisz program, który oblicza pole prostokąta. Wartości boków
 * a i b wprowadzamy z klawiatury. W programie należy przyjąć,
 * że zmienne a, b oraz pole są typu double (rzeczywistego).
 */

import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException {

/**
 * Linijka kodu
 * double a, b, pole;
 * umożliwia deklarację zmiennych a, b i pole (wszystkie są typu rzeczywistego
 * — double) w programie.
  */
            double a, b, pole;
/**
 * W celu czytania z klawiatury liter i cyfr należy skorzystać z dwóch
 * klas: InputStreamReader oraz BufferedReader. Najpierw tworzymy nowy
 * obiekt klasy InputStreamReader, przekazując jej konstruktorowi obiekt
 * System.in. Można go następnie wykorzystać w konstruktorze klasy
 * BufferedReader. Tak opisana konstrukcja ma następujący zapis:
 */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Program oblicza pole prostokonta.");
            System.out.println("Podaj bok a.");
/**
 * Powstały obiekt klasy BufferedReader możemy przypisać do zmiennej
 * referencyjnej br i dalej, poprzez metodę readLine(), możemy wykorzystać
 * go do wczytywania zmiennej a typu double ze strumienia wejściowego.
 * Ilustruje to następująca linijka kodu:
 * a = Double.parseDouble(br.readLine());
  */
        a = Double.parseDouble(br.readLine());
            System.out.println("Podaj bok b.");
/**
 * Wczytywanie liczb odbywa się tak samo jak wczytywanie tekstu,
 * musimy jednak dokonać odpowiedniej konwersji, tzn. zamiany ciągu
 * znaków na odpowiadającą mu wartość liczbową. Służy do tego jedna
 * z poniższych metod statycznych:
 * 􀁔 parseByte z klasy Byte do odczytu bajtów,
 * 􀁔 parseDouble z klasy Double do odczytu liczb typu double,
 * 􀁔 parseFloat z klasy Float do odczytu liczb typu float,
 * 􀁔 parseInt z klasy Int do odczytu liczb typu int,
 * 􀁔 parseLong z klasy Long do odczytu liczb typu long.
 */
        b = Double.parseDouble(br.readLine());
        pole = a * b;

        System.out.println("Pole prostokąta o boku a = " +  a + " i boku b = " + b);
        System.out.println(" wynosi " + pole + ".");
        }
    }

