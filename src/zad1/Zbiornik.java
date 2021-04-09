/**
 *
 *  @author Kaczyński Krzysztof PD3565
 *
 */

package zad1;


public class Zbiornik {

    private double pojemnosc=0;
    private double stanWody=0;
    private static int lot =0;
    private int number=0;

    public Zbiornik() {
        number=++lot;
    }

    public Zbiornik(double y, double x) {
        pojemnosc = y;
        stanWody = x;
        number=++lot;
    }

    public Zbiornik(double x) {
        this(x,0);
    }

    public Zbiornik(Zbiornik z) {
        pojemnosc=z.pojemnosc;
        stanWody=z.stanWody;
        number=++lot;
    }

    public void dolej(double water) {
        stanWody+=water;
        if (stanWody>pojemnosc) {stanWody=pojemnosc;}

    }
    public void odlej(double water) {
        stanWody-=water;
        if (stanWody<0) {stanWody=0;}
    }

    public String toString()  {
        return "Zbiornik nr "+number+", pojemnosc "+pojemnosc+", stan wody "+stanWody;
    }
    public void show() {
        System.out.println(toString());
    }

}