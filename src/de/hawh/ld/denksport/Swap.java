package de.hawh.ld.denksport;

public class Swap {

    public static void main(String[] args) {
        //4.
        /*
        * Die Code in der Aufgabenstellung kann nicht kompiliert werden.
        * (x ^= y ^= x ^_= y) Der Unterstrich zeigt das Leerzeichen.
        *
        * Der Code ohne Leerzeichen gibt:
        *
        * x = 0; y = 1984
        *
        * Der xor-Operator arbeitet bitweise wie folgt:
        *
        * temp1 = x; (1984)
        * temp2 = y; (2001)
        *
        *
        * temp3 = x ^ y (17)
        *
        *     y = 0111 1101 0001 (2001)
        *     x = 0111 1100 0000 (1984)
        *         --------------
        * temp3 = 0000 0001 0001 (17)
        *
        * x = temp3; (17)
        *
        * y = temp2 ^ temp3; (1984)
        *  temp2 = 0111 1101 0001 (2001)
        *  temp3 = 0000 0001 0001 (17)
        *          --------------
        *      y = 0111 1100 0000 (1984)
        *
        * x = temp1 ^ y; (0)
        *
        *  temp1 = 0111 1100 0000 (1984)
        *      y = 0111 1100 0000 (2001)
        *          --------------
        *      x = 0000 0000 0000 (0)
        * */
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println("x = " + x + "; y = " + y);
    }





}
