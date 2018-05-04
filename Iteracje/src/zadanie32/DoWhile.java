package zadanie32; // Zadanie 3.2

/**
 * Napisz program, który za pomocą instrukcji do ... while dla
 * danych wartości x zmieniających się od 0 do 10 oblicza wartość
 * funkcji y = 3x.
 */

public class DoWhile {
    /**
     * Pętla do ... while
     * Kolejną instrukcją iteracyjną jest instrukcja do ... while. Jej ogólna
     * postać jest następująca:
     * do
     * {
     * // instrukcje
     * }
     * while (warunek);
     * Cechą charakterystyczną instrukcji iteracyjnej do ... while jest to, że
     * bez względu na wartość zmiennej warunek pętla musi zostać wykonana
     * co najmniej jeden raz. Program po napotkaniu instrukcji do ...
     * while wchodzi do pętli i wykonuje instrukcje znajdujące się w nawiasach
     * klamrowych {}, a następnie sprawdza, czy warunek jest spełniony.
     * Jeśli tak, wraca na początek pętli, natomiast jeśli warunek osiągnie
     * wartość false (nieprawda), pętla się zakończy.
     */
    public static void main(String[] args) {

        int x = 0, y = 0;
        //ustalenie wartości początkowych

        System.out.println("Program oblicza wartość funkcji y = 3*x");
        System.out.println("dla x zmieniającego się od 0 do 10.");
        do {
            y = 3 * x;
            System.out.println(" x = " + x + "\t" + " y = " + y);
            x++;
        }
        while (x <= 10);
    }
}

