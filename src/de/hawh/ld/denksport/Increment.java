package de.hawh.ld.denksport;
/*
* ++ wirkt hier als Postinkrement a++ ist im moment der Zuweisung zu a also '0'
* und wird erst anschließend um eins erhöht, bevor es dann wieder auf '0' gesetzt wird.
* */
public class Increment {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 100; i++)
            j = j++;
        System.out.println(j);
    }
}

