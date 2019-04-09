package de.hawh.ld.denksport;

public class Main {

    public static void main(String[] args) {

        //3.

        System.out.println((int) (char) (byte) -1);
        //4.
        /*
        * Die Code in der Aufgabenstellung kann nicht kompiliert werden. (x ^= y ^= x ^_= y) Der Unterstrich zeigt das Leerzeichen.
        *
        * Der Code ohne Leerzeichen gibt:
        * x = 0; y = 1984
        *
        *
        *
        *
        * */
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
        System.out.println();

        //5.
        /*
        *
        *
        *
        * */
        System.out.print("Hell");
        System.out.println("o world");

    }





}
