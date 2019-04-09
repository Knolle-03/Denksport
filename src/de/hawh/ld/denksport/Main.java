package de.hawh.ld.denksport;

public class Main {

    public static void main(String[] args) {
        //2.
        System.out.println(Main.isOdd(-3));
        System.out.println(Main.isOdd2(-3));
        //3.
        System.out.println((int) (char) (byte) -1);

    }


    /*
    * public static boolean isOdd(long i) {
    * return i % 2 == 1;
    *
    * Für negative Zahlen gibt der Modulooperator auch negative Zahlen zurück.
    *
    * Alternativen wären:
    */
    public static boolean isOdd(long i) {
        return i % 2 != 0;
    }
    // oder
    public static boolean isOdd2(long i) {
        return Math.abs(i % 2) == 1;
    }

}
