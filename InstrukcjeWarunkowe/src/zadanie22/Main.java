package zadanie22; // Zadanie2.2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Napisz program, który oblicza pierwiastki równania kwadratowego
 * ax2+bx+c = 0 z wykorzystaniem instrukcji warunkowej
 * if, gdzie zmienne a, b i c to liczby rzeczywiste wprowadzane
 * z klawiatury. Dla zmiennych a, b, c, x1 oraz x2 należy przyjąć
 * format wyświetlania ich na ekranie z dokładnością do dwóch
 * miejsc po przecinku.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        double a, b, c, delta, x1, x2;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program oblicza pierwiastki równania ax^2+bx+c = 0.");
        System.out.println("Podaj a.");
        a = Double.parseDouble(br.readLine());

        if (a == 0) {

            System.out.println("Niedozwolona wartość współczynnika a.");
        } else {
            System.out.println("Podaj b.");
            b = Double.parseDouble(br.readLine());

            System.out.println("Podaj c.");
            c = Double.parseDouble(br.readLine());

            delta = b*b-4*a*c;

            if (delta < 0){

                System.out.println("Brak pierwiastków rzeczywistych.");
            }
            else {
                if (delta == 0){

                    x1 = -b/(2*a);
                    System.out.printf("Dla a = " + "%4.2f,",a);
                    System.out.printf("Dla b = " + "%4.2f,",b);
                    System.out.printf("Dla c = " + "%4.2f\n,",c);
                    System.out.println("trójmian ma jeden pierwiastek podwójny x1 = ");
                    System.out.printf("%4.2f.", x1);
                }
                else {
                    x1 = (-b-Math.sqrt(delta))/(2*a);
                    x2 = (-b+Math.sqrt(delta))/(2*a);
                    System.out.printf("Dla a = " + "%4.2f,", a);
                    System.out.printf(" b = " + "%4.2f,", b);
                    System.out.printf(" c = " + "%4.2f\n", c);
                    System.out.println("trójmian ma dwa pierwiastki:");
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f,",x1);
                    System.out.print(" x2 = ");
                    System.out.printf("%4.2f.\n",x2);
                }
            }
        }
    }
}
