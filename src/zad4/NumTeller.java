/**
 * @author Kaczyński Krzysztof PD3565
 */

package zad4;


public class NumTeller {

    public static String say(int number) {
        String msg = number + "-";

        if (number < 0) number = -number;

        if (number % 10 == 0) {

            if (number == 0)
                msg += "owy";

            else if (number % 1000000 == 0)
                msg += "owy";

            else if (number % 1000 == 0)
                msg += "ny";

            else if (number % 100 == 0)
                msg += "ny";

            else msg += "ty";
        } else if (number % 10 == 1) {

            if (number % 100 == 11)
                msg += "ty";

            else msg += "szy";
        } else if (number % 10 == 2) {

            if (number % 100 == 2)
                msg += "gi";

            else msg += "gi";
        } else if (number % 10 == 3) {

            if (number % 100 == 13)
                msg += "ty";
            else msg += "ci";
        } else if (number % 10 == 4) {
            msg += "ty";
        } else if (number % 10 == 5) {
            msg += "ty";
        } else if (number % 10 == 6) {
            msg += "ty";
        } else if (number % 10 == 7) {
            if (number % 100 == 7)
                msg += "ty";
            else msg += "my";
        } else if (number % 10 == 8) {
            if (number % 100 == 8)
                msg += "ty";
            else msg += "my";
        } else if (number % 10 == 9) {
            msg += "ty";
        }

        return msg;
    }
}
