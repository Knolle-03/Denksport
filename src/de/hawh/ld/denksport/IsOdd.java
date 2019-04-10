/*
 * public static boolean IsOdd(long i) {
 * return i % 2 == 1;
 *
 * Für negative Zahlen gibt der Modulooperator auch negative Zahlen zurück.
 * Folglich liefert die Methode nur in einem Viertel aller Fälle das richtige Ergebnis,
 * bzw. in der Hälfte. Allerdings sind alle false für gerade negative Zahlen "zufällig" richtig.
 *
 *
 * Alternativen wären folgende Klassenmethoden:
 */
package de.hawh.ld.denksport;

public class IsOdd {
    public static void main(String[] args) {
        System.out.println(IsOdd.isOdd1(-3));
        System.out.println(IsOdd.isOdd2(-3));
    }


    public static boolean isOdd1(long i) {
        return i % 2 != 0;
    }
    // oder
    public static boolean isOdd2(long i) {
        return Math.abs(i % 2) == 1;
    }
}
