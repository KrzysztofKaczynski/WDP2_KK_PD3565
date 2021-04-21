/**
 * @author Kaczyński Krzysztof PD3565
 */

package zad3;


public class Appender {
    String src;

    public Appender(String s) {
        src = s;
    }

    public Appender append(String app, int n) {
        if (n <= 0) throw new IllegalArgumentException("Powielanie napisu n musi byc wieksze od 0");
        while (n-- > 0) {
            src += app;
        }
        return this;

    }

    public String toString() {
        return src;
    }
}
