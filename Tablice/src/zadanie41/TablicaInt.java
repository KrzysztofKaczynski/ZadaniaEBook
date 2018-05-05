package zadanie41;

/**
 * Napisz program, który w 10-elementowej tablicy jednowymiarowej
 * o nazwie dane umieszcza liczby od 0 do 9
 */
public class TablicaInt {

    public static void main(String[] args) {
        int n = 10, i;
        int dane[] = new int[n];
            // deklaracja tab. typu int

        for (i = 0; i < 10 ; i++) {

            dane[i] = i;
            System.out.println("dane[" + i + "] = " + dane[i]);
                // wyswietla zawartość tab.

        }
    }
}
