package zadanie322; // Zadanie 3.22

/**
 * Napisz program, który wyświetla duże litery alfabetu od A do
 * Z i od Z do A z wykorzystaniem pętli for.
 */

public class ForAZiZA {
    public static void main(String[] args) {
        char znak;
        System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
        for (znak = 'A'; znak <= 'Z'; znak++) {
            if (znak < 'Z')
                System.out.print(znak + ", ");
            else
                System.out.print(znak + ".");
        }
        System.out.println();
        for (znak = 'Z'; znak >= 'A'; znak--) {
            if (znak > 'A')
                System.out.print(znak + ", ");
            else
                System.out.print(znak + ".");
        }
    }
}
