/**
 * @author Kaczyński Krzysztof PD3565
 */

package zad4;


import java.util.NoSuchElementException;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {

    public static void main(String[] args) {
        String input = showInputDialog("Podaj 3 liczby");
        Scanner scan = new Scanner(input);
        String msg = "";
        try {
            msg += NumTeller.say(scan.nextInt()) + '\n';
            msg += NumTeller.say(scan.nextInt()) + '\n';
            msg += NumTeller.say(scan.nextInt()) + '\n';
            System.out.println(msg);
        } catch (NoSuchElementException e) {
            System.out.println("Nieprawidlowa ilosc podanych liczb");
        }


    }

}
