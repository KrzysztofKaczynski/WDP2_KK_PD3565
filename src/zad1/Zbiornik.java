/**
 * @author Kaczyński Krzysztof PD3565
 */

package zad1;


public class Zbiornik {

    private double pojemnosc = 0;
    private double stanWody = 0;
    private static int next = 0;
    private final int numer;

    public Zbiornik() {
        numer = ++next;
    }

    public Zbiornik(double y, double x) {
        pojemnosc = y;
        stanWody = x;
        numer = ++next;
    }

    public Zbiornik(double x) {
        this(x, 0);
    }

    public Zbiornik(Zbiornik z) {
        pojemnosc = z.pojemnosc;
        stanWody = z.stanWody;
        numer = ++next;
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

    //public void show() {
      //  System.out.println(this);
    }

