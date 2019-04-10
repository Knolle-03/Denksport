/*
 *
 * Die folgende Aufgabe wurde sowohl auf Aufgabenblatt 02, als auch auf Aufgabenblatt 03
 * (in "verschärfter Form") gestellt.
 *
 * Dies ist somit die Lösung für beide Aufgaben.
 *
 *
 * Quelle: https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html
 *
 * -1 wird als Zweierkomplementär gespeichert. Alle bits sind anfänglich also gesetzt.
 * Durch den Bytecast werden die ersten 24 Bit abgeschnitten. (Wert ist immernoch -1)
 * Da Bytes signed sind wird das negative Vorzeichen "beibehalten"
 * und die -1 in 16 gesetzen bits dargestellt.
 *
 * siehe: 5.1.3. Narrowing Primitive Conversion
 *
 * Byte to char ist, da char unsigned ist, eine Widening and Narrowing Primitive Conversion.
 * Erst wird eine WPC zu int druchgeführt und anschließend eine NPC zum char.
 *
 * siehe: 5.1.4. Widening and Narrowing Primitive Conversion
 *
 * Der Byte wird also erst per WPC zum int (1111 1111 1111 1111 1111 1111 1111 1111)
 *
 * siehe: 5.1.2. Widening Primitive Conversion
 *
 * und anschließend der int zum char. (1111 1111 1111 1111)
 * Hier geht auch das Vorzeichen verloren,
 * denn chars können nur positive Werte repräsentieren.
 *
 * siehe: 5.1.3. Narrowing Primitive Conversion
 *
 * Bei folgender WPC (char to int) wird also von einer positiven Zahl ausgegangen.
 * Der Char 1111 1111 1111 1111 wird also zum int 0000 0000 0000 0000 1111 1111 1111 1111
 * und nicht wie man denken könnte zu 1111 1111 1111 1111 1111 1111 1111 1111.
 *
 * Folglich wird die Zahl 65535 (2e+16 - 1) ausgegeben.
 *
 * Diese wird dann auch ausgegeben.
 */
package de.hawh.ld.denksport;

public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
    }
}
