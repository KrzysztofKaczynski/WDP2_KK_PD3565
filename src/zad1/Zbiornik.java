/**
 * @author Kaczyński Krzysztof PD3565
 */

package zad1;


public class Zbiornik {

    private final double pojemnosc;
    private double stanWody;
    private static int next = 0;
    private final int numer;

    public Zbiornik(double y, double x) {
        pojemnosc = y;
        stanWody = x;
        numer = ++next;
    }

    public Zbiornik(double x) {
        this(x, 0);
    }

    public void dolej(double water) {
        stanWody += water;
        if (stanWody > pojemnosc) {
            stanWody = pojemnosc;
        }

    }

    public void odlej(double water) {
        stanWody -= water;
        if (stanWody < 0) {
            stanWody = 0;
        }
    }

    public String toString() {
        return "Zbiornik nr " + numer + ", pojemnosc " + pojemnosc + ", stan wody " + stanWody;
    }


}

