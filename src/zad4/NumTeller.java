/**
 * @author Kaczyński Krzysztof PD3565
 */

package zad4;


public class NumTeller {

    public static String say(int liczba) {
        String msg = liczba + "-";

        if (liczba < 0) liczba = -liczba;

        if (liczba % 10 == 0) {

            if (liczba == 0)
                msg += "owy";

            else if (liczba % 1000000 == 0)
                msg += "owy";

            else if (liczba % 1000 == 0)
                msg += "ny";

            else if (liczba % 100 == 0)
                msg += "ny";

            else msg += "ty";
        } else if (liczba % 10 == 1) {

            if (liczba % 100 == 11)
                msg += "ty";

            else msg += "szy";
        } else if (liczba % 10 == 2) {

            if (liczba % 100 == 2)
                msg += "gi";

            else msg += "gi";
        } else if (liczba % 10 == 3) {

            if (liczba % 100 == 13)
                msg += "ty";
            else msg += "ci";
        } else if (liczba % 10 == 4) {
            msg += "ty";
        } else if (liczba % 10 == 5) {
            msg += "ty";
        } else if (liczba % 10 == 6) {
            msg += "ty";
        } else if (liczba % 10 == 7) {
            if (liczba % 100 == 7)
                msg += "ty";
            else msg += "my";
        } else if (liczba % 10 == 8) {
            if (liczba % 100 == 8)
                msg += "ty";
            else msg += "my";
        } else if (liczba % 10 == 9) {
            msg += "ty";
        }
        return msg;
    }

}


