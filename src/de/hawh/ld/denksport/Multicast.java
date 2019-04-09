/*
 * -1 wird als Zweierkomplementär gespeichert. Alle bits sind anfänglich also gesetzt.
 * Durch den Bytecast werden die ersten 24 Bit abgeschnitten. (Wert ist immernoch -1)
 * Da Bytes signed sind wird das negative Vorzeichen "beibehalten" und die -1 in 16 gesetzen bits dargestellt.
 * Allerdings ist Char unsigned. Somit wird beim Intcast davon ausgegangen,
 * dass es um eine positive Zahl handelt (2^16 -1 = 65535).
 *
 *Diese wird dann auch ausgegeben.
 */
package de.hawh.ld.denksport;

public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
    }
}
