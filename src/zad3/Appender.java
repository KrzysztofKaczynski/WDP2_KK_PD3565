/**
 * @author Kaczyński Krzysztof PD3565
 */

package zad3;


public class Appender {
    String src;

    public Appender() {
        src = "";
    }

    public Appender(String s) {
        src = s;
    }

    public Appender append(String app, int n) {
        if (n <= 0) throw new IllegalArgumentException("Parametr n musi być większy od 0");
        while (n-- > 0) {
            src = src + app;
        }
        return this;

    }

    public String toString() {
        return src;
    }
}
