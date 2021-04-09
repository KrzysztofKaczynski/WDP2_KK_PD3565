/**
 *
 *  @author Kaczyński Krzysztof PD3565
 *
 */

package zad4;


import static javax.swing.JOptionPane.*;

public class Main {
  
  public static void main(String[] args) {
    String input = showInputDialog("Podaj 3 liczby");
    Scanner scan = new Scanner(input);
    String msg = "";
    msg += NumTeller.say(scan.nextInt()) + '\n'; 
    msg += NumTeller.say(scan.nextInt()) + '\n';
    msg += NumTeller.say(scan.nextInt()) + '\n';
    System.out.println(msg);
  }

}
