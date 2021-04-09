/**
 *
 *  @author Kaczyński Krzysztof PD3565
 *
 */

package zad1;


public class Zbiornik {

    private int stanWody = 0;
    private int pojemnosc;

    public Zbiornik(int i) {
        pojemnosc = i;
    }

    public Zbiornik(Zbiornik z) {
        pojemnosc = z.pojemnosc;
        stanWody  = z.stanWody;
    }

    public void dolej(int woda) {
        stanWody += woda;
        if (stanWody > pojemnosc) {
            stanWody = pojemnosc;
        }
    }

    public void odlej(int woda) {
            stanWody -= woda;
            if (stanWody < 0) {stanWody = 0;}
        }
    public String toString()  {
        return "Zbiornik nr "+z+", pojemnosc "+pojemnosc+", stan wody "+stanWody;
    }
    }

